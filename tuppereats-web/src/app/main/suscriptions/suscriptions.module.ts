import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SuscriptionsRoutingModule } from './suscriptions-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { SuscriptionsHomeComponent } from './suscriptions-home/suscriptions-home.component';


@NgModule({
  declarations: [SuscriptionsHomeComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    SuscriptionsRoutingModule
  ]
})
export class SuscriptionsModule { }
