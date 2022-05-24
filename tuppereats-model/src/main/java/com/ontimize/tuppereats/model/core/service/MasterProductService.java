package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IMasterProductService;
import com.ontimize.tuppereats.model.core.dao.ProductCategoryDao;
import com.ontimize.tuppereats.model.core.dao.ProductTypeDao;

@Service("MasterProductService")
@Lazy
public class MasterProductService implements IMasterProductService {

	@Autowired
	private ProductCategoryDao productCategoryDao;
	@Autowired
	private ProductTypeDao productTypeDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	// PRODUCT CATEGORY
	@Override
	public EntityResult categoryQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productCategoryDao, keyMap, attrList);
	}

	@Override
	public EntityResult categoryInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.productCategoryDao, attrMap);
	}

	@Override
	public EntityResult categoryUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.productCategoryDao, attrMap, keyMap);
	}

	@Override
	public EntityResult categoryDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.productCategoryDao, keyMap);
	}

	// PRODUCT TYPE
	@Override
	public EntityResult typeQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productTypeDao, keyMap, attrList);
	}

	@Override
	public EntityResult typeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.productTypeDao, attrMap);
	}

	@Override
	public EntityResult typeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.productTypeDao, attrMap, keyMap);
	}

	@Override
	public EntityResult typeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.productTypeDao, keyMap);
	}

}
