import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenusDetailsComponent } from './menus-details/menus-details.component';
import { MenusHomeComponent } from './menus-home/menus-home.component';
import { MenusNewComponent } from './menus-new/menus-new.component';


const routes: Routes = [{
  path : '',
  component: MenusHomeComponent
},
{
  path: "new",
  component: MenusNewComponent
},
{
  path: ":menu_id",
  component: MenusDetailsComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MenusRoutingModule { }
