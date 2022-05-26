package com.ontimize.tuppereats.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository("MenuCustomerDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MenuCustomerDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class MenuCustomerDao extends OntimizeJdbcDaoSupport {
    public static final String MENU_CUSTOMER_ID = "menu_customer_id";
    public static final String ID_MENU = "id_menu";
    public static final String ID_CUSTOMER = "id_customer";

}
