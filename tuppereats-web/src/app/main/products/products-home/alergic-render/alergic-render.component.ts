import { Component, Injector, TemplateRef, Type, ViewChild } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { DEFAULT_INPUTS_O_TABLE_CELL_RENDERER_SERVICE, DEFAULT_OUTPUTS_O_TABLE_CELL_RENDERER_SERVICE, DialogService, OTableCellRendererServiceComponent, ServiceResponse, ServiceUtils, Util } from 'ontimize-web-ngx';

@Component({
  selector: 'app-alergic-render',
  templateUrl: './alergic-render.component.html',
  inputs: DEFAULT_INPUTS_O_TABLE_CELL_RENDERER_SERVICE,
  outputs: DEFAULT_OUTPUTS_O_TABLE_CELL_RENDERER_SERVICE,
  styleUrls: ['./alergic-render.component.css']
})
export class AlergicRenderComponent extends OTableCellRendererServiceComponent {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;



  constructor(protected injector: Injector, protected sanitizer: DomSanitizer) {
    super(injector);
    this.tableColumn.type = 'service';
    this.dialogService = injector.get<DialogService>(DialogService as Type<DialogService>);
    this.setComponentPipe();
  }

  queryData(cellvalue: any, parentItem?: any): void {
    if (!this.dataService || !(this.queryMethod in this.dataService) || !this.entity) {
      console.warn('Service not properly configured! aborting query');
      return;
    }
    const filter = ServiceUtils.getFilterUsingParentKeys(parentItem, this._pKeysEquiv);
    const tableColAlias = Object.keys(this._pKeysEquiv).find(key => this._pKeysEquiv[key] === this.column);
    if (Util.isDefined(tableColAlias)) {
      if (!filter[tableColAlias]) {
        filter[tableColAlias] = cellvalue;
      }
    } else {
      filter[this.column] = cellvalue;
    }
    this.dataService[this.queryMethod](filter, this.colArray, this.entity)
      .subscribe((resp: ServiceResponse) => {
        if (resp.isSuccessful()) {
          this.responseMap[cellvalue] = {photo_alergenos:resp.data[0]["photo_alergenos"]};
          this.onDataLoaded.emit(this.responseMap[cellvalue]);
        }
      }, err => {
        console.error(err);
        if (err && typeof err !== 'object') {
          this.dialogService.alert('ERROR', err);
        } else {
          this.dialogService.alert('ERROR', 'MESSAGES.ERROR_QUERY');
        }
      });
  }

  getCellData(cellvalue: any, rowvalue?: any): any {
    return this.responseMap[cellvalue];
  }

  getImage(rowvalue?: any) {
    let image_array = [];

    if (rowvalue != undefined) {
      image_array = rowvalue["photo_alergenos"].split(';;;');
    }
    return image_array;
  }

  getScuritySource(image: String) {

    return this.sanitizer.bypassSecurityTrustResourceUrl('data:image/png;base64,' + image);

  }


}
