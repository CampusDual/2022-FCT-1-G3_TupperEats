package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.common.security.PermissionsProviderSecured;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IMenuService;
import com.ontimize.tuppereats.model.core.dao.MenuDao;

@Service("MenuService")
@Lazy

public class MenuService implements IMenuService{
	@Autowired private MenuDao menuDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult menuQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		 return this.daoHelper.query(this.menuDao, keyMap, attrList);
	}

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult menuInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.menuDao, attrMap);
	}
	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult menuUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.menuDao, attrMap, keyMap);
	}
	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult menuDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.menuDao, keyMap);
	}
	
	

}
