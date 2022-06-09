import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { OChartModule } from 'ontimize-web-ngx-charts';

@NgModule({
  imports: [
    OntimizeWebModule,
    OChartModule,
    OChartModule

  ],
  declarations: [

  ],
  exports: [
    CommonModule,
    OChartModule,
    OChartModule

  ] ,

})
export class SharedModule { }
