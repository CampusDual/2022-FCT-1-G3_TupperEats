import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomersDetailComponent } from './customers-detail/customers-detail.component';
import { CustomersHomeComponent } from './customers-home/customers-home.component';



const routes: Routes =  [{
  path : '',
  component: CustomersHomeComponent
},{
  path: ":customer_id",
  component: CustomersDetailComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomersRoutingModule { }

