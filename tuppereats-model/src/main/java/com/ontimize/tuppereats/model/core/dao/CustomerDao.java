package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("CustomerDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/CustomerDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class CustomerDao extends OntimizeJdbcDaoSupport {

	public static final String CUSTOMER_ID = "customer_id";
	public static final String CUSTOMER_NAME = "customer_name";
	public static final String CUSTOMER_SURNAME = "customer_surname";
	public static final String CUSTOMER_ADRESS = "customer_adress";
	public static final String CUSTOMER_EMAIL = "customer_email";
	public static final String CUSTOMER_PHONE = "customer_phone";
 	public static final String CUSTOMER_CITY = "customer_city";
	public static final String CUSTOMER_SUSCRIPTION_QUERY = "customer_suscriptionQuery";
	public static final String CUSTOMER_MENU_QUERY = "customer_menuQuery";

}