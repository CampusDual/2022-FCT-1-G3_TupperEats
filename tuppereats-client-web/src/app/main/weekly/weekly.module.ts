import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WeeklyRoutingModule } from './weekly-routing.module';
import { WeeklyComponent } from './weekly.component';


@NgModule({
  declarations: [WeeklyComponent],
  imports: [
    CommonModule,
    WeeklyRoutingModule
  ]
})
export class WeeklyModule { }
