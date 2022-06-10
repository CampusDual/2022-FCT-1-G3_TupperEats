package com.ontimize.tuppereats.model.core.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IPublicService;
import com.ontimize.tuppereats.model.core.dao.UserDao;
import com.ontimize.tuppereats.model.core.dao.UserRoleDao;

@Lazy
@Service("PublicService")
public class PublicService implements IPublicService{

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public EntityResult userInsert(Map<String, Object> attrMap)throws OntimizeJEERuntimeException {
		attrMap.put(UserDao.REGISTRATION_DATE, new Date());
		EntityResult er = this.daoHelper.insert(userDao, attrMap);
		Map<String, Object> attrUserMap = new HashMap<>();
		attrUserMap.put(UserRoleDao.ATTR_ID_ROLENAME, UserRoleDao.CLIENT_ROLE_VALUE);
		attrUserMap.put(UserRoleDao.ATTR_USER, attrMap.get(UserDao.USER));
		this.daoHelper.insert(userRoleDao, attrUserMap);
		return er;
	}

}
