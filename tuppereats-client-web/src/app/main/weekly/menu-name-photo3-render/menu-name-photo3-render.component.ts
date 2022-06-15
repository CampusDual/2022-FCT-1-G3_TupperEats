import { Component, Injector, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { OBaseTableCellRenderer } from 'ontimize-web-ngx';

@Component({
  selector: 'app-menu-name-photo3-render',
  templateUrl: './menu-name-photo3-render.component.html',
  styleUrls: ['./menu-name-photo3-render.component.css']
})
export class MenuNamePhoto3RenderComponent extends OBaseTableCellRenderer {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;

  constructor(protected injector: Injector) {
    super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): string{
    return  rowvalue["dessert_name"];
  }

}
