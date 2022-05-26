import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { CustomersRoutingModule } from './customers-routing.module';
import { CustomersHomeComponent } from './customers-home/customers-home.component';



@NgModule({
  declarations: [CustomersHomeComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    CustomersRoutingModule
  ]
})
export class CustomersModule { }
