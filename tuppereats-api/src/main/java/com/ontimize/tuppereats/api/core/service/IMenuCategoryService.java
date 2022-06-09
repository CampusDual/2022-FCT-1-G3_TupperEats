package com.ontimize.tuppereats.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IMenuCategoryService {

    // PRODUCT CATEGORY
    public EntityResult menuCategoryQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException;

    public EntityResult menuCategoryInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    public EntityResult menuCategoryUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException;

    public EntityResult menuCategoryDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
