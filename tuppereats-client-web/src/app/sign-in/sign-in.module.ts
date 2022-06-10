import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { OntimizeWebModule } from 'ontimize-web-ngx';

import { SharedModule } from '../shared/shared.module';
import { SignInFormComponent } from './form/sign-in-form.component';
import { SignInComponent } from './sign-in.component';

import { SignRoutingModule } from './sign-routing.module';


@NgModule({
  imports: [
    SharedModule,
    OntimizeWebModule,
    SignRoutingModule
  ],
  declarations: [
    SignInComponent,
    SignInFormComponent
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SignModule { }
