import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { OChartModule } from 'ontimize-web-ngx-charts';

@NgModule({
  imports: [
    OntimizeWebModule,
    OChartModule
  ],
  declarations: [
  ],
  exports: [
    CommonModule,
    OChartModule
  ]
})
export class SharedModule { }
