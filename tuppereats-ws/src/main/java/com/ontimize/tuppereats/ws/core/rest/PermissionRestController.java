package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IPermissionService;

@RestController
@RequestMapping("/permissions")
public class PermissionRestController extends ORestController<IPermissionService> {
	
	@Autowired
	private IPermissionService permissionService;

	@Override
	public IPermissionService getService() {
		return this.permissionService;
	}
}
