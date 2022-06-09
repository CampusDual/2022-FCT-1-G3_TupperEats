package com.ontimize.tuppereats.ws.core.rest;

import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tuppereats.api.core.service.IMenuCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorymenus")
public class MenuCategoryRestController extends ORestController<IMenuCategoryService> {
    @Autowired
    private IMenuCategoryService menuCategoryService;
    @Override
    public IMenuCategoryService getService() {
        return this.menuCategoryService;
    }
}
