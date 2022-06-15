import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ClientPersonalDataRoutingModule } from './client-personal-data-routing.module';
import { ClientPersonalDataComponent } from './client-personal-data.component';


@NgModule({
  declarations: [ClientPersonalDataComponent],
  imports: [
    CommonModule,
    ClientPersonalDataRoutingModule
  ]
})
export class ClientPersonalDataModule { }
