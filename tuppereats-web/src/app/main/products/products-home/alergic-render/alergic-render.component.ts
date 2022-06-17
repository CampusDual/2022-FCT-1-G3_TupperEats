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
     return "";
  }

  getImage(rowvalue?: any){
    let image_array=[];

    if(rowvalue!=undefined){
      image_array = rowvalue["photo_alergenos"].split(';;;');
      // return image_array.map(image=> this.sanitizer.bypassSecurityTrustResourceUrl('data:image/png;base64,'+image));
     }
     return image_array;
  }

  getScuritySource(image:String){

    return this.sanitizer.bypassSecurityTrustResourceUrl('data:image/png;base64,'+image);

  }

}
