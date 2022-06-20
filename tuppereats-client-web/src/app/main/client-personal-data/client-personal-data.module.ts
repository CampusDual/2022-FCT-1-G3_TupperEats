import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OntimizeWebModule } from 'ontimize-web-ngx';

import { ClientPersonalDataRoutingModule } from './client-personal-data-routing.module';
import { ClientPersonalDataComponent } from './client-personal-data.component';


@NgModule({
  declarations: [ClientPersonalDataComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    ClientPersonalDataRoutingModule
  ]
})
export class ClientPersonalDataModule { }
