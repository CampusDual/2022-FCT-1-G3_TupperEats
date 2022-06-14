import { Component, Injector, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { OBaseTableCellRenderer } from 'ontimize-web-ngx';

@Component({
  selector: 'app-alergic-render',
  templateUrl: './alergic-render.component.html',
  styleUrls: ['./alergic-render.component.css']
})
export class AlergicRenderComponent extends OBaseTableCellRenderer {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;
  public image_array = [];

  constructor(protected injector: Injector, protected sanitizer: DomSanitizer) {
    super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): any{

    if(rowvalue!=undefined){
      let image_array = rowvalue["photo_alergenos"].split(';;;');
      this.image_array=image_array.map(image=> this.sanitizer.bypassSecurityTrustResourceUrl('data:image/png;base64,'+image));

    }
     return '';
  }

}
