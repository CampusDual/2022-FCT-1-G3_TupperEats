import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HowWorksRoutingModule } from './how-works-routing.module';
import { HowWorksComponent } from './how-works.component';


@NgModule({
  declarations: [HowWorksComponent],
  imports: [
    CommonModule,
    HowWorksRoutingModule
  ]
})
export class HowWorksModule { }
