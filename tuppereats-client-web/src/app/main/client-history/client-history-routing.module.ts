import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientHistoryComponent } from './client-history.component';


const routes: Routes = [
  {
    path: '',
    component: ClientHistoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientHistoryRoutingModule { }
