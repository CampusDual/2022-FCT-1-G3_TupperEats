package com.ontimize.tuppereats.api.core.service;

import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IPublicService {

	public EntityResult userInsert(Map<String, Object> attrMap)
			throws OntimizeJEERuntimeException;
}
