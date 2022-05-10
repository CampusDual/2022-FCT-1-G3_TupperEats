package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IMenuService;


@RestController
@RequestMapping("/menus")
public class MenuRestCrontroller extends ORestController<IMenuService> {

		@Autowired
		private IMenuService menuService;

		@Override
		public IMenuService getService() {
			return this.menuService;

		}
	}
