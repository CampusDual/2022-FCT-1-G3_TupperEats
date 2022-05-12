import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MenusRoutingModule } from './menus-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { MenusHomeComponent } from './menus-home/menus-home.component';


@NgModule({
  declarations: [MenusHomeComponent],
  imports: [
    CommonModule,
    MenusRoutingModule,
    OntimizeWebModule
  ]
})
export class MenusModule { }
