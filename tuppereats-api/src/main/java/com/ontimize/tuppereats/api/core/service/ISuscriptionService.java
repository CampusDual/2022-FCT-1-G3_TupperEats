package com.ontimize.tuppereats.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface ISuscriptionService {

	// SUSCRIPTION
	
		public EntityResult suscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult suscriptionInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

		public EntityResult suscriptionUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
				throws OntimizeJEERuntimeException;

		public EntityResult suscriptionDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
