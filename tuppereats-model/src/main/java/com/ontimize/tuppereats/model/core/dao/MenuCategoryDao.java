package com.ontimize.tuppereats.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
@Repository("MenuCategoryDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MenuCategoryDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class MenuCategoryDao extends OntimizeJdbcDaoSupport{



    public static final String ID_MENU_CATEGORY = "id_menu_category";
    public static final String MENU_NAME_CATEGORY = "menu_name_category";

}
