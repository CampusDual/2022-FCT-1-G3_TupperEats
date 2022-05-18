import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MenusRoutingModule } from './menus-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { MenusHomeComponent } from './menus-home/menus-home.component';
import { MenusDetailsComponent } from './menus-details/menus-details.component';
import { MenusNewComponent } from './menus-new/menus-new.component';


@NgModule({
  declarations: [MenusHomeComponent, MenusDetailsComponent, MenusNewComponent],
  imports: [
    CommonModule,
    MenusRoutingModule,
    OntimizeWebModule
  ]
})
export class MenusModule { }
