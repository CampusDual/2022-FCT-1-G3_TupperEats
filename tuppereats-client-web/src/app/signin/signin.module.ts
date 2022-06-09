import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SigninRoutingModule } from './signin-routing.module';
import { SigninComponent } from './signin.component';
import { OFormModule,  OFormToolbarModule,  OntimizeWebModule } from "ontimize-web-ngx";


@NgModule({
  declarations: [SigninComponent],
  imports: [
    CommonModule,
    SigninRoutingModule,
    OntimizeWebModule,
    OFormModule,
    OFormToolbarModule,
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SigninModule { }
