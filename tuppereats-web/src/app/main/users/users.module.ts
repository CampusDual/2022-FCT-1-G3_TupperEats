import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UsersRoutingModule } from './users-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { UsersHomeComponent } from './users-home/users-home.component';
import { UsersDetailComponent } from './users-detail/users-detail.component';
import { UsersNewComponent } from './users-new/users-new.component';


@NgModule({
  declarations: [UsersHomeComponent, UsersDetailComponent, UsersNewComponent],
  imports: [
    CommonModule,
    UsersRoutingModule,
    OntimizeWebModule
  ]
})
export class UsersModule { }
