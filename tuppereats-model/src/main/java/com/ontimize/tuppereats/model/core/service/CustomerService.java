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
import com.ontimize.tuppereats.api.core.service.ICustomerService;
import com.ontimize.tuppereats.model.core.dao.CustomerDao;


@Service("CustomerService")
@Lazy
public class CustomerService implements ICustomerService{
	@Autowired private CustomerDao customerDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult customerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		 return this.daoHelper.query(this.customerDao, keyMap, attrList);
	}

	@Override
	public EntityResult customerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.customerDao, attrMap);
	}
	
	@Override
	public EntityResult customerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.customerDao, attrMap, keyMap);
	}
	@Override
	public EntityResult customerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.customerDao, keyMap);
	}
	
	

}