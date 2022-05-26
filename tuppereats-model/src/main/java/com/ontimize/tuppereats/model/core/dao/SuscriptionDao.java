package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("SuscriptionDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/SuscriptionDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class SuscriptionDao extends OntimizeJdbcDaoSupport {

	public static final String SUSCRIPTION_ID = "suscription_id";
	public static final String SUSCRIPTION_NAME = "suscription_name";
	public static final String SUSCRIPTION_PRICE = "suscription_price";

}