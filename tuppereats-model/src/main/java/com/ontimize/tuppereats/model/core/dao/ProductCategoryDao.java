package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ProductCategoryDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ProductCategoryDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ProductCategoryDao extends OntimizeJdbcDaoSupport {

	public static final String ID_PRODUCT_CATEGORY = "id_product_category";
	public static final String NAME_CATEGORY = "name_category";

}
