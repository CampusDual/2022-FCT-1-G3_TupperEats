package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("MenuDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MenuDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class MenuDao extends OntimizeJdbcDaoSupport {

	public static final String MENU_ID = "menu_id";
	public static final String MENU_NAME = "menu_name";
	public static final String PRICE = "price";
	public static final String FIRST_PLATE = "first_plate";
	public static final String SECOND_PLATE = "second_plate";
	public static final String DESSERT = "dessert";
}
