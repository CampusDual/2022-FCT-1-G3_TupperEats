import { ChangeDetectorRef, Component, ElementRef, forwardRef, Injector, NgZone } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {OFormComponent, OComponent, OntimizeService, dataServiceFactory } from 'ontimize-web-ngx';


@Component({ // <- Include the `@OComponent` decorator
  selector: 'sign-in-form',
  providers: [
    {
      provide: OntimizeService,
      useFactory: dataServiceFactory, deps: [Injector]
    }, {
      // Include the `OFormComponent` class as a provider of your component
      provide: OFormComponent,
      useExisting: forwardRef(() => SigninComponent)
    }
  ],
  templateUrl: './signin.component.html',
})
export class SigninComponent  extends OFormComponent{

  protected recaptchaResponseToken: string;

  constructor(
    router: Router, actRoute: ActivatedRoute, zone: NgZone, cd: ChangeDetectorRef, injector: Injector, elRef: ElementRef
  ) {
    super(router, actRoute, zone, cd, injector, elRef);
    this.recaptchaResponseToken = undefined;
  }

  /* Override methods depending on your requirements */

  protected postCorrectInsert(result: any) {
    if (result && result.confirmation_key) {
      this.dialogService.alert('CONFIRM_PENDING', 'CONFIRM_PENDING_MESSAGE')
        .then(res => this.router.navigate(['home']));
    } else {
      this.dialogService.alert('ERROR', 'ERROR_SIGN_IN');
    }
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
    } else if (typeof(this.recaptchaResponseToken) === 'undefined') {
      this.dialogService.alert('ERROR', 'ERROR_CAPTCHA');
    } else {
      this._insertAction();
    }
  }

}

// import { ElementRef, forwardRef, Injector, NgZone } from '@angular/core';
// import { Location } from '@angular/common';
// import { ActivatedRoute, Router } from '@angular/router';

// import { OComponent, dataServiceFactory, AuthService, OFormComponent, OntimizeService  } from 'ontimize-web-ngx';

// @OComponent({ // <- Include the `@OComponent` decorator
//   selector: 'sign-in-form',
//   providers: [
//     {
//       provide: OntimizeService,
//       useFactory: dataServiceFactory
//     }, {
//       // Include the `OFormComponent` class as a provider of your component
//       provide: OFormComponent,
//       useExisting: forwardRef(() => SignInFormComponent)
//     }
//   ]
// })
// // Make your component extend the `OFormComponent` class
// export class SignInFormComponent extends OFormComponent {

//   protected recaptchaResponseToken: string;

//   constructor(
//     _router: Router,
//     _actRoute: ActivatedRoute, _zone: NgZone, _loginService: AuthService,
//     injector: Injector, elref: ElementRef
//   ) {
//     super(_router, _actRoute, _zone, _loginService, injector, elref);
//     this.recaptchaResponseToken = undefined;
//   }

//   /* Override methods depending on your requirements */

//   protected postCorrectInsert(result: any) {
//     if (result && result.confirmation_key) {
//       this.dialogService.alert('CONFIRM_PENDING', 'CONFIRM_PENDING_MESSAGE')
//         .then(res => this._router.navigate(['home']));
//     } else {
//       this.dialogService.alert('ERROR', 'ERROR_SIGN_IN');
//     }
//   }

//   protected postIncorrectInsert(result: any) {
//     let msg = 'ERROR_SIGN_IN';
//     if (result && 'json' in result) {
//       let res = result.json();
//       if (res.message) {
//         msg = res.message;
//       }
//     }
//     this.dialogService.alert('ERROR', msg);
//   }

//   /* Add new methods depending on your requirements */

//   protected getCaptcha(response: any) {
//     this.recaptchaResponseToken = response;
//   }

//   public send() {
//     if (this.formGroup.controls['password'].value !== this.formGroup.controls['password2'].value) {
//       this.dialogService.alert('ERROR', 'ERROR_PASSWORDS_NOT_MATCH');
//     } else if (typeof(this.recaptchaResponseToken) === 'undefined') {
//       this.dialogService.alert('ERROR', 'ERROR_CAPTCHA');
//     } else {
//       this._insertAction();
//     }
//   }

// }

