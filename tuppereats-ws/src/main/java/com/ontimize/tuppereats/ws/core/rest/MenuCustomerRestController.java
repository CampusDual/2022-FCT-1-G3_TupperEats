package com.ontimize.tuppereats.ws.core.rest;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IMenuCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menuCustomers")
public class MenuCustomerRestController extends ORestController<IMenuCustomerService> {

    @Autowired
    private IMenuCustomerService menuCustomerService;

    @Override
    public IMenuCustomerService getService() {
        return this.menuCustomerService;
    }
}
