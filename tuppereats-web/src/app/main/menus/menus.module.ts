import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MenusRoutingModule } from './menus-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { MenusHomeComponent } from './menus-home/menus-home.component';
import { MenusDetailsComponent } from './menus-details/menus-details.component';
import { MenusNewComponent } from './menus-new/menus-new.component';
import { MenuNamePhotoRenderComponent } from './menus-home/menu-name-photo-render/menu-name-photo-render.component';


@NgModule({
  declarations: [MenusHomeComponent, MenusDetailsComponent, MenusNewComponent, MenuNamePhotoRenderComponent],
  imports: [
    CommonModule,
    MenusRoutingModule,
    OntimizeWebModule
  ]
})
export class MenusModule { }
