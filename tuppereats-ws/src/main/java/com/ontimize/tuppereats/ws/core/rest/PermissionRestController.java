package com.ontimize.tuppereats.ws.core.rest;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ontimize.jee.common.dto.EntityResult;
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
	
	/*@RequestMapping(value="/permissionRoles",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject permissionRoles(){
		if(permissionService.permissionQuery(null, null).getRecordValues(0).get("profile").equals("admin")) {
			JSONObject j = new JSONObject("{\"menu\": [{ \"attr\": \"home\", \"visible\": true, \"enabled\": true },{ \"attr\": \"plates\", \"visible\": true, \"enabled\": true },{ \"attr\": \"menus\", \"visible\": true, \"enabled\": true },{ \"attr\": \"users\", \"visible\": true, \"enabled\": true },{ \"attr\": \"customers\", \"visible\": true, \"enabled\": true },{ \"attr\": \"suscriptions\", \"visible\": true, \"enabled\": true },{ \"attr\": \"logout\", \"visible\": true, \"enabled\": true }]}");
			return j;
		}else {
			return new JSONObject("{\"menu\": [{ \"attr\": \"home\", \"visible\": true, \"enabled\": true },{ \"attr\": \"plates\", \"visible\": true, \"enabled\": true },{ \"attr\": \"menus\", \"visible\": true, \"enabled\": true },{ \"attr\": \"users\", \"visible\": false, \"enabled\": false },{ \"attr\": \"customers\", \"visible\": false, \"enabled\": false },{ \"attr\": \"suscriptions\", \"visible\": false, \"enabled\": false },{ \"attr\": \"logout\", \"visible\": true, \"enabled\": true }]}");
		}
		
	}*/
	
	@RequestMapping(value="/permissionRoles",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String permission(){
		if(permissionService.permissionQuery(null, null).getRecordValues(0).get("profile").equals("admin")) {
			String a = "{\"menu\": [{ \"attr\": \"home\", \"visible\": true, \"enabled\": true },{ \"attr\": \"plates\", \"visible\": true, \"enabled\": true },{ \"attr\": \"menus\", \"visible\": true, \"enabled\": true },{ \"attr\": \"users\", \"visible\": true, \"enabled\": true },{ \"attr\": \"customers\", \"visible\": true, \"enabled\": true },{ \"attr\": \"suscriptions\", \"visible\": true, \"enabled\": true },{ \"attr\": \"logout\", \"visible\": true, \"enabled\": true }]}";
			return a;
		}else {
			String b = "{\"menu\": [{ \"attr\": \"home\", \"visible\": true, \"enabled\": true },{ \"attr\": \"plates\", \"visible\": true, \"enabled\": true },{ \"attr\": \"menus\", \"visible\": true, \"enabled\": true },{ \"attr\": \"users\", \"visible\": false, \"enabled\": false },{ \"attr\": \"customers\", \"visible\": false, \"enabled\": false },{ \"attr\": \"suscriptions\", \"visible\": false, \"enabled\": false },{ \"attr\": \"logout\", \"visible\": true, \"enabled\": true }]}";
			return b;
		}
		
	}
	
}
