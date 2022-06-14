package com.ontimize.tuppereats.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "RoleDao")
@ConfigurationFile(
        configurationFile = "dao/RoleDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class RoleDao extends OntimizeJdbcDaoSupport {


    public static final String ROLENAME = "rolename";
    public static final String ID_ROLENAME         = "id_rolename";
    public static final String PERMISSION      = "xmlclientpermission";

}
