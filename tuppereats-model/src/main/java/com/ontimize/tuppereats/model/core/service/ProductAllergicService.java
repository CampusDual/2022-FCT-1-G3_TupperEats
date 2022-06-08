package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IProductAllergicService;
import com.ontimize.tuppereats.model.core.dao.ProductAllergicDao;


@Service("ProductAllergicService")
@Lazy
public class ProductAllergicService implements IProductAllergicService {

	@Autowired
	private ProductAllergicDao productAlergicDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;
	
	@Override
	public EntityResult productAllergicQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.productAlergicDao, keyMap, attrList);
	}

	@Override
	public EntityResult productAllergicInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.productAlergicDao, attrMap);
	}

	@Override
	public EntityResult productAllergicUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.productAlergicDao, attrMap, keyMap);
	}

	@Override
	public EntityResult productAllergicDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.productAlergicDao, keyMap);
	}

}
