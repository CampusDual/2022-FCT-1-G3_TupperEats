package com.ontimize.tuppereats.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;



@Repository("SuscriptionCustomerDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/SuscriptionCustomerDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class SuscriptionCustomerDao extends OntimizeJdbcDaoSupport{

    public static final String SUSCRIPTION_CUSTOMER_ID ="suscription_customer_id";
    public static final String ID_CUSTOMER="id_customer";
    public static final String ID_SUSCRIPTION="id_suscription";
    public static final String START_DATE_SUSCRIPTION_CUSTOMER="start_date_suscription_customer";
    public static final String END_DATE_SUSCRIPTION_CUSTOMER="end_date_suscription_customer";

}

