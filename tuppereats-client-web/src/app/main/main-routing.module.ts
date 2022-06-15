import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from 'ontimize-web-ngx';

import { MainComponent } from './main.component';

export const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    canActivate: [AuthGuardService],
    children: [
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', loadChildren: () => import('./home/home.module').then(m => m.HomeModule) },
      { path: 'weekly', loadChildren: () => import('./weekly/weekly.module').then(m => m.WeeklyModule) },
      { path: 'monthly', loadChildren: () => import('./monthly/monthly.module').then(m => m.MonthlyModule) },
      { path: 'personal', loadChildren: () => import('./client-personal-data/client-personal-data.module').then(m => m.ClientPersonalDataModule)},
      { path: 'history', loadChildren: () => import('./client-history/client-history.module').then(m => m.ClientHistoryModule)},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule { }
