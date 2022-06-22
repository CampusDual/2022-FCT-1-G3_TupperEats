import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { MonthlyRoutingModule } from "./monthly-routing.module";
import { MonthlyComponent } from "./monthly.component";
import { OntimizeWebModule } from "ontimize-web-ngx";
import { MenuNamePhotoRenderComponent } from "./menu-name-photo-render/menu-name-photo-render.component";
import { MenuNamePhoto3RenderComponent } from "./menu-name-photo3-render/menu-name-photo3-render.component";
import { MenuNamePhoto2RenderComponent } from "./menu-name-photo2-render/menu-name-photo2-render.component";
import { AlergicRenderComponent } from "./alergic-render/alergic-render.component";


@NgModule({
  declarations: [
    MonthlyComponent,
    MenuNamePhotoRenderComponent,
    MenuNamePhoto2RenderComponent,
    MenuNamePhoto3RenderComponent,
    AlergicRenderComponent
  ],
  imports: [CommonModule, MonthlyRoutingModule, OntimizeWebModule],
})
export class MonthlyModule {}
