package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.ICustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerRestController extends ORestController<ICustomerService> {

	@Autowired
	private ICustomerService customerService;

	@Override
	public ICustomerService getService() {
		return this.customerService;
	}
}
