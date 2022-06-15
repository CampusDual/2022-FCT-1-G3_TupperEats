import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MonthlyComponent } from './monthly.component';


const routes: Routes = [
  {
    path: '',
    component: MonthlyComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MonthlyRoutingModule { }
