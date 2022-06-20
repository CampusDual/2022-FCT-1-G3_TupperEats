import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SuscriptionsRoutingModule } from './suscriptions-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { SuscriptionsHomeComponent } from './suscriptions-home/suscriptions-home.component';
import { SuscriptionsDetailComponent } from './suscriptions-detail/suscriptions-detail.component';
import { OChartModule } from 'ontimize-web-ngx-charts';


@NgModule({
  declarations: [SuscriptionsHomeComponent, SuscriptionsDetailComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    SuscriptionsRoutingModule,
    OChartModule
  ]
})
export class SuscriptionsModule { }

