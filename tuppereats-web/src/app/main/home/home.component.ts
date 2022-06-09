import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ChartSeries, PieChartConfiguration } from 'ontimize-web-ngx-charts';
import { D3LocaleService } from '../../shared/d3-locale/d3Locale.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  public movementTypesChartParams: PieChartConfiguration;

  constructor(
    private router: Router,
    private actRoute: ActivatedRoute,
    private d3LocaleService: D3LocaleService
  ) {
    const d3Locale = this.d3LocaleService.getD3LocaleConfiguration();
    this._configurePieChart(d3Locale);
   }

  ngOnInit() {
    // nothing to do
  }

  navigate() {
    this.router.navigate(['../', 'login'], { relativeTo: this.actRoute });
  }

  private _configurePieChart(locale: any): void {
    this.movementTypesChartParams = new PieChartConfiguration();
    this.movementTypesChartParams.margin.top = 0;
    this.movementTypesChartParams.margin.right = 0;
    this.movementTypesChartParams.margin.bottom = 0;
    this.movementTypesChartParams.margin.left = 0;
    this.movementTypesChartParams.legendPosition = 'bottom';
    this.movementTypesChartParams.legend.vers = 'furious';
    this.movementTypesChartParams.labelType = 'value';
    //this.movementTypesChartParams.valueType=locale.numberFormat('.0f')
  }

}
