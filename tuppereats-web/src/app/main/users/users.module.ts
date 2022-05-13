import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UsersRoutingModule } from './users-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { UsersHomeComponent } from './users-home/users-home.component';


@NgModule({
  declarations: [UsersHomeComponent],
  imports: [
    CommonModule,
    UsersRoutingModule,
    OntimizeWebModule
  ]
})
export class UsersModule { }
