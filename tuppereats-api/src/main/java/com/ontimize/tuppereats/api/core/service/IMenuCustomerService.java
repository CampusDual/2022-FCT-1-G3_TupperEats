package com.ontimize.tuppereats.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IMenuCustomerService {

    public EntityResult menuCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException;

    public EntityResult menuCustomerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    public EntityResult menuCustomerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException;

    public EntityResult menuCustomerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}
