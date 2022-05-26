package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.ISuscriptionService;



@RestController
@RequestMapping("/suscriptions")
public class SuscriptionRestController extends ORestController<ISuscriptionService> {

	@Autowired
	private ISuscriptionService suscriptionService;

	@Override
	public ISuscriptionService getService() {
		return this.suscriptionService;
	}
}
