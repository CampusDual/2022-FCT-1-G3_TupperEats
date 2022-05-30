package com.ontimize.tuppereats.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface ICustomerService {

		//Customer
	
		public EntityResult customerQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult customer_suscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult customer_menuQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult customerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

		public EntityResult customerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
				throws OntimizeJEERuntimeException;

		public EntityResult customerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
