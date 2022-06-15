import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ClientHistoryRoutingModule } from './client-history-routing.module';
import { ClientHistoryComponent } from './client-history.component';


@NgModule({
  declarations: [ClientHistoryComponent],
  imports: [
    CommonModule,
    ClientHistoryRoutingModule
  ]
})
export class ClientHistoryModule { }
