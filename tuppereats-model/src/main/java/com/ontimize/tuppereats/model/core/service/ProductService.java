package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.common.security.PermissionsProviderSecured;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IProductService;
import com.ontimize.tuppereats.model.core.dao.ProductDao;

@Service("ProductService")
@Lazy
public class ProductService implements IProductService {

	@Autowired
	private ProductDao productDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productDao, keyMap, attrList);
	}

	@Override
	// @Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.productDao, attrMap);
	}

	@Override
	// @Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.productDao, attrMap, keyMap);
	}

	@Override
	// @Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.productDao, keyMap);
	}

}
