import { ChangeDetectorRef, Component, ElementRef, forwardRef, Injector, NgZone, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { dataServiceFactory, DEFAULT_INPUTS_O_FORM, DEFAULT_OUTPUTS_O_FORM, OFormComponent, OntimizeService } from 'ontimize-web-ngx';
import {MatSnackBarModule} from '@angular/material/snack-bar';


@Component({
  selector: 'sign-in-form',
  templateUrl:'./sign-in-form.component.html',
  inputs: DEFAULT_INPUTS_O_FORM,
  outputs: DEFAULT_OUTPUTS_O_FORM,
  providers: [
    {
      provide: OntimizeService,
      useFactory: dataServiceFactory,
      deps: [Injector]

    },
    {
      provide: OFormComponent,
      useExisting: forwardRef(() => SignInFormComponent)
    }
  ]
})
export class SignInFormComponent extends OFormComponent implements OnInit {
  protected recaptchaResponseToken: string;
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


  /* Override methods depending on your requirements */

  protected postCorrectInsert(result: any) {
    this.snackBarService.open('Registrado correctamente')
    this.router.navigate(['login'])

  }

  protected postIncorrectInsert(result: any) {
    let msg = 'ERROR_SIGN_IN';
    if (result && 'json' in result) {
      let res = result.json();
      if (res.message) {
        msg = res.message;
      }
    }
    this.dialogService.alert('ERROR', msg);
  }

  /* Add new methods depending on your requirements */

  protected getCaptcha(response: any) {
    this.recaptchaResponseToken = response;
  }

  public send() {
    if (this.formGroup.controls['password'].value !== this.formGroup.controls['password2'].value) {
      this.dialogService.alert('ERROR', 'ERROR_PASSWORDS_NOT_MATCH');
    }  else {
      this.insert();
    }
  }

  public signin(){
    this.insert();
  }

}
