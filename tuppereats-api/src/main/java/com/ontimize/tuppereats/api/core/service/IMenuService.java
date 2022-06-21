package com.ontimize.tuppereats.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IMenuService {

	// MENU

		public EntityResult menuQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult menuRenderQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult menuInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

		public EntityResult menuUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
				throws OntimizeJEERuntimeException;

		public EntityResult menuDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
