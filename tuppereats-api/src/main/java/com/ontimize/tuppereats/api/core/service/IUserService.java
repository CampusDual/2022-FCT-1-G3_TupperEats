package com.ontimize.tuppereats.api.core.service;


import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;


public interface IUserService {

	public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList);

	public EntityResult userSuscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult totalSpentQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult userMenuQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult customerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult noCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;
	
	public EntityResult graficaCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;
	
	public EntityResult comboUserQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult userInsert(Map<?, ?> attrMap);
	public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);
	public EntityResult userDelete(Map<?, ?> keyMap);

}
