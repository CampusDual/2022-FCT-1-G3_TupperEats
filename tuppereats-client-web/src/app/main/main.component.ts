import { Component} from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'ontimize-web-ngx';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent {

  constructor(public router: Router) { }

  logout() {
    const _this: any = this;
    const authService = _this.injector.get(AuthService);
    authService.clearSessionData();
    this.router.navigateByUrl("/homepage");
  }

  navigateToWeekly(){
    this.router.navigateByUrl("main/weekly");
  }

  navigateToMonthly(){
    this.router.navigateByUrl("/main/monthly");
  }
  navigateToHistory(){
    this.router.navigateByUrl("/main/history");
  }
  navigateToPersonal(){
    this.router.navigateByUrl("/main/personal");
  }
}
