import { Injectable, Injector } from "@angular/core";
import { OntimizeEEService, SessionInfo } from "ontimize-web-ngx";

@Injectable()
export class TupperEatsService extends OntimizeEEService{

  sessionInfo:SessionInfo ;

  constructor(protected injector:Injector){
    super(injector);
    this.sessionInfo = this.authService.getSessionInfo()
  }

  clientUser(kv?: object, av?: string[], entity?: string, sqltypes?: object){
    kv["user_"] = this.sessionInfo.user
    return this.query(kv,av, entity,sqltypes)
  }
}
