package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.ISuscriptionService;
import com.ontimize.tuppereats.model.core.dao.SuscriptionDao;

@Service("SuscriptionService")
@Lazy
public class SuscriptionService implements ISuscriptionService{
	@Autowired private SuscriptionDao suscriptionDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult suscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		 return this.daoHelper.query(this.suscriptionDao, keyMap, attrList);
	}

	@Override
	public EntityResult suscriptionInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.suscriptionDao, attrMap);
	}
	
	@Override
	public EntityResult suscriptionUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.suscriptionDao, attrMap, keyMap);
	}
	@Override
	public EntityResult suscriptionDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.suscriptionDao, keyMap);
	}
	
	

}
