import { Component, Injector, OnInit, TemplateRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-menus-home',
  templateUrl: './menus-home.component.html',
  styleUrls: ['./menus-home.component.css']
})
export class MenusHomeComponent implements OnInit {

  @ViewChild('templateref', { read: TemplateRef, static: false }) public templateref: TemplateRef<any>;
 constructor(protected injector: Injector) {
   super(injector);
    }

  getCellData(cellvalue: any, rowvalue?: any): string{
   return  rowvalue[""]+" "+rowvalue["OFFICEID"]+" "+rowvalue["CDID"]+" "+rowvalue["ANID"];
  }

}
