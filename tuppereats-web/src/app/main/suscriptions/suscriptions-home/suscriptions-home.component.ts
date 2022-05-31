import { Component, OnInit } from '@angular/core';
import { Expression, FilterExpressionUtils } from 'ontimize-web-ngx';

@Component({
  selector: 'app-suscriptions-home',
  templateUrl: './suscriptions-home.component.html',
  styleUrls: ['./suscriptions-home.component.css']
})
export class SuscriptionsHomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  createFilter(values: Array<{ attr, value }>): Expression {
    let filters: Array<Expression> = [];
    values.forEach(fil => {
       if (fil.value) {
          if (fil.attr === 'STARTDATE_I') {
             filters.push(FilterExpressionUtils.buildExpressionMoreEqual('start_date_suscription_customer', fil.value));
          }
          if (fil.attr === 'STARTDATE_E') {
             filters.push(FilterExpressionUtils.buildExpressionLessEqual('start_date_suscription_customer', fil.value));
          }
          if (fil.attr === 'ENDDATE_I') {
             filters.push(FilterExpressionUtils.buildExpressionMoreEqual('end_date_suscription_customer', fil.value));
          }
          if (fil.attr === 'ENDDATE_E') {
             filters.push(FilterExpressionUtils.buildExpressionLessEqual('end_date_suscription_customer', fil.value));
          }
       }
    });

    if (filters.length > 0) {
       return filters.reduce((exp1, exp2) => FilterExpressionUtils.buildComplexExpression(exp1, exp2, FilterExpressionUtils.OP_AND));
    } else {
       return null;
    }
 }

}

