import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OntimizeWebModule } from 'ontimize-web-ngx';

import { ClientHistoryRoutingModule } from './client-history-routing.module';
import { ClientHistoryComponent } from './client-history.component';


@NgModule({
  declarations: [ClientHistoryComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    ClientHistoryRoutingModule
  ]
})
export class ClientHistoryModule { }
