import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductsRoutingModule } from './products-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { ProductsHomeComponent } from './products-home/products-home.component';
import { ProductsDetailComponent } from './products-detail/products-detail.component';
import { ProductsNewComponent } from './products-new/products-new.component';


@NgModule({
  declarations: [ProductsHomeComponent, ProductsDetailComponent, ProductsNewComponent],
  imports: [
    CommonModule,
    ProductsRoutingModule,
    OntimizeWebModule
  ]
})
export class ProductsModule { }
