import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientPersonalDataComponent } from './client-personal-data.component';


const routes: Routes = [
  {
    path: '',
    component: ClientPersonalDataComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientPersonalDataRoutingModule { }
