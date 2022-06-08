package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ProductAllergicDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ProductAllergicDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ProductAllergicDao extends OntimizeJdbcDaoSupport {

	public static final String PRODUCT_ALLERGIC_ID = "product_allergic_id";
	public static final String ID_ALLERGIC = "id_allergic";
	public static final String ID_PRODUCT = "id_product";
}
