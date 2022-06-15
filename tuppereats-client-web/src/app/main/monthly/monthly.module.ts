import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MonthlyRoutingModule } from './monthly-routing.module';
import { MonthlyComponent } from './monthly.component';


@NgModule({
  declarations: [MonthlyComponent],
  imports: [
    CommonModule,
    MonthlyRoutingModule
  ]
})
export class MonthlyModule { }
