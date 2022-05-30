import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { SuscriptionsDetailComponent } from "./suscriptions-detail/suscriptions-detail.component";
import { SuscriptionsHomeComponent } from "./suscriptions-home/suscriptions-home.component";

const routes: Routes = [{ path: "", component: SuscriptionsHomeComponent },{
  path: ":suscription_customer_id",
  component: SuscriptionsDetailComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SuscriptionsRoutingModule {}

