package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ProductDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ProductDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ProductDao extends OntimizeJdbcDaoSupport {

	public static final String PRODUCT_ID = "product_id";
	public static final String NAME = "name";
	public static final String PHOTO = "photo";
	public static final String INGREDIENTS = "ingredients";
	public static final String PRODUCT_CATEGORY_ID = "product_category_id";
	public static final String ID_PRODUCT_TYPE = "id_product_type";
	public static final String QUERY_PLATE_TYPE = "plate_type";
	public static final String QUERY_DESSERT_TYPE = "dessert_type";

}
