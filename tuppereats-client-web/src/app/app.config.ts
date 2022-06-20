import { Config } from 'ontimize-web-ngx';

import { MENU_CONFIG } from './shared/app.menu.config';
import { SERVICE_CONFIG } from './shared/app.services.config';
import { TupperEatsService } from './shared/services/tupperEats.service';

export const CONFIG: Config = {
  // The base path of the URL used by app services.
  apiEndpoint: 'http://localhost:33333',
  bundle: {
    path: 'bundle'
  },
  // Application identifier. Is the unique package identifier of the app.
  // It is used when storing or managing temporal data related with the app.
  // By default is set as 'ontimize-web-uuid'.
  uuid: 'com.ontimize.web.tuppereats.web',

  // Title of the app
  title: 'Tupper Eats Client',

  //  Language of the application.
  locale: 'es',

  // The service type used (Ontimize REST standart, Ontimize REST JEE
  // or custom implementation) in the whole application.
  serviceType: TupperEatsService,

  // Configuration parameters of application services.
  servicesConfiguration: SERVICE_CONFIG,

  appMenuConfiguration: MENU_CONFIG,

  applicationLocales: ['es', 'en']
};
