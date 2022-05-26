import { Component, Injector, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { OBaseTableCellRenderer } from 'ontimize-web-ngx';

@Component({
  selector: 'app-menu-name-photo2-render',
  templateUrl: './menu-name-photo2-render.component.html',
  styleUrls: ['./menu-name-photo2-render.component.css']
})
export class MenuNamePhoto2RenderComponent extends OBaseTableCellRenderer {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;

  constructor(protected injector: Injector) {
    super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): string{
    return  rowvalue["second_plate_name"];
  }

}
