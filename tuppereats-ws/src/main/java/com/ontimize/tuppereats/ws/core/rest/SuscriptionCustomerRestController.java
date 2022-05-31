package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.ISuscriptionCustomerService;

@RestController
@RequestMapping("/suscriptionCustomers")
public class SuscriptionCustomerRestController extends ORestController<ISuscriptionCustomerService> {

    @Autowired
    private ISuscriptionCustomerService suscriptionCustomerService;

    @Override
    public ISuscriptionCustomerService getService() {
        return this.suscriptionCustomerService;

    }
}
