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

  constructor(protected injector: Injector, protected sanitizer: DomSanitizer) {
    super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): any{
     let first = rowvalue["photo_alergenos"].split(';;;');
     return 'data:image/*;base64,' + first ;
  }

}
