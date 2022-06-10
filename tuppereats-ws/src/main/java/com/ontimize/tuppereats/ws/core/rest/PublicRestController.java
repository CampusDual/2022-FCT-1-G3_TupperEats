package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IPublicService;

@RestController
@RequestMapping("/public")
public class PublicRestController extends ORestController<IPublicService> {

	@Autowired
	private IPublicService iPubSer;
	
	@Override
	public IPublicService getService() {
		return this.iPubSer;
	}
}