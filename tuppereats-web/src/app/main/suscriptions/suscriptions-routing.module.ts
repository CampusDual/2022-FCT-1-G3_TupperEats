import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { SuscriptionsHomeComponent } from "./suscriptions-home/suscriptions-home.component";

const routes: Routes = [{ path: "", component: SuscriptionsHomeComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SuscriptionsRoutingModule {}

