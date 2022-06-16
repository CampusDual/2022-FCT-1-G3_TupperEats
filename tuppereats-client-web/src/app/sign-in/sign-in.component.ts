import { ChangeDetectorRef, Component, ElementRef, Injector, NgZone} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OFormComponent } from 'ontimize-web-ngx';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent extends OFormComponent  {

  constructor(
    router: Router,
    actRoute: ActivatedRoute,
    zone: NgZone,
    cd: ChangeDetectorRef,
    injector: Injector,
    elRef: ElementRef
  ) {
    super(router, actRoute, zone, cd, injector, elRef);
  }

}
