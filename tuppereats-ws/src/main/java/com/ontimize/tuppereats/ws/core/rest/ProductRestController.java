package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController extends ORestController<IProductService> {

	@Autowired
	private IProductService productService;

	@Override
	public IProductService getService() {
		return this.productService;
	}
}
