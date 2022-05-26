import { Component, Injector, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { OBaseTableCellRenderer } from 'ontimize-web-ngx';

@Component({
  selector: 'app-menu-name-photo-render',
  templateUrl: './menu-name-photo-render.component.html',
  styleUrls: ['./menu-name-photo-render.component.css']
})
export class MenuNamePhotoRenderComponent extends OBaseTableCellRenderer {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;

  constructor(protected injector: Injector) {
    super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): string{
    return  rowvalue["first_plate_name"];
  }

}
