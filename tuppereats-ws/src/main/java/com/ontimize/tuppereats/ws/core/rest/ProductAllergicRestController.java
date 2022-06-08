package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IProductAllergicService;

@RestController
@RequestMapping("/productAllergics")
public class ProductAllergicRestController extends ORestController<IProductAllergicService>{

	@Autowired

	private IProductAllergicService productAllergicService;
	
	@Override
	public IProductAllergicService getService() {
		
		return this.productAllergicService;
	}

}
