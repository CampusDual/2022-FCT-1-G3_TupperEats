package com.ontimize.tuppereats.model.core.service;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.ontimize.tuppereats.model.core.dao.ProductAllergicDao;
import com.ontimize.tuppereats.model.core.dao.ProductDao;

@Service("ProductService")
@Lazy
public class ProductService implements IProductService {

	@Autowired
	private ProductDao productDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;
	
	@Autowired
    private ProductAllergicDao productAllergicDao;

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {		
		return this.daoHelper.query(this.productDao, keyMap, attrList);
	}

	@Override
	public EntityResult plateTypeQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productDao, keyMap, attrList, ProductDao.QUERY_PLATE_TYPE);
	}

	@Override
	public EntityResult dessertTypeQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productDao, keyMap, attrList, ProductDao.QUERY_DESSERT_TYPE);
	}

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	 public EntityResult productInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
	     ArrayList<Object> allergic_id = new ArrayList<>();
	     EntityResult insertProduct = this.daoHelper.insert(this.productDao, attrMap);
	     Map<String, Object> datos = new HashMap<>();
	     for (String clave : attrMap.keySet()) {
	         if (clave.equalsIgnoreCase("allergic_id"))
	             allergic_id = (ArrayList<Object>) attrMap.get(clave);
	     }
	     for (Object id_allergic : allergic_id) {
	         datos.put("id_allergic", id_allergic);
	         datos.put("id_product", insertProduct.get("product_id"));
	         this.daoHelper.insert(this.productAllergicDao,datos);
	     }

	     return insertProduct;
	 }
	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.productDao, attrMap, keyMap);
	}

	@Override
	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult productDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.productDao, keyMap);
	}

	@Override
	public EntityResult allergicProductQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productDao, keyMap, attrList, ProductDao.QUERY_ALLERGIC);
	}
}
