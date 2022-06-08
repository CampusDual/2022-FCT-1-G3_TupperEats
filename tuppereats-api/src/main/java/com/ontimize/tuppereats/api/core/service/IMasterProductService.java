package com.ontimize.tuppereats.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IMasterProductService {

	// PRODUCT CATEGORY
	public EntityResult categoryQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult categoryInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult categoryUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult categoryDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// PRODUCT TYPE
	public EntityResult typeQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

	public EntityResult typeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult typeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult typeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	
	
}


