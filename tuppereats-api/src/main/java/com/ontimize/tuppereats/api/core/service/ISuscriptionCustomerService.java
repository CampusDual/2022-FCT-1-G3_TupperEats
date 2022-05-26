package com.ontimize.tuppereats.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface ISuscriptionCustomerService {

    public EntityResult suscriptionCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException;

    public EntityResult suscriptionCustomerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    public EntityResult suscriptionCustomerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException;

    public EntityResult suscriptionCustomerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}