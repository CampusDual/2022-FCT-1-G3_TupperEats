import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenusHomeComponent } from './menus-home/menus-home.component';


const routes: Routes = [{
  path : '',
  component: MenusHomeComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MenusRoutingModule { }
