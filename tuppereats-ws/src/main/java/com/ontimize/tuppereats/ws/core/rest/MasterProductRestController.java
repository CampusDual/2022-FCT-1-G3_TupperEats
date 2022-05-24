package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IMasterProductService;

@RestController
@RequestMapping("/masterproducts")
public class MasterProductRestController extends ORestController<IMasterProductService> {

	@Autowired
	private IMasterProductService masterProductService;

	@Override
	public IMasterProductService getService() {
		return this.masterProductService;
	}
}
