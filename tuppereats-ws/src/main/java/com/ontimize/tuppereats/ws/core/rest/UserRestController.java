package com.ontimize.tuppereats.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IUserService;


@RestController
@RequestMapping("/users")
@ComponentScan(basePackageClasses={com.ontimize.tuppereats.api.core.service.IUserService.class})
public class UserRestController extends ORestController<IUserService> {

	@Autowired
	private IUserService userSrv;

	@Override
	public IUserService getService() {
		return this.userSrv;
	}

	@PostMapping(
		value = "/login",
		produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EntityResult> login() {
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
