package com.ontimize.tuppereats.model.core.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.dto.EntityResultMapImpl;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IPermissionService;
import com.ontimize.tuppereats.model.core.dao.UserRoleDao;

@Service("PermissionService")
@Lazy

public class PermissionService implements IPermissionService {

	@Autowired private UserRoleDao userRoleDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;
	
	
	@Override
	public EntityResult permissionQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		EntityResult e = new EntityResultMapImpl();
		Map<String, String> map = new HashMap<String, String>();
		map.put("profile", authentication.getAuthorities().toArray()[0].toString());
		e.addRecord(map);
		
		return e;
		
		
	}

	
}
