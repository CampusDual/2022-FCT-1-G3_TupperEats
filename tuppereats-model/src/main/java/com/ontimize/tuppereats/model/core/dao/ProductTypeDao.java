package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ProductTypeDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ProductTypeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ProductTypeDao extends OntimizeJdbcDaoSupport {

	public static final String PRODUCT_TYPE_ID = "product_type_id";
	public static final String NAME_TYPE = "name_type";

}
