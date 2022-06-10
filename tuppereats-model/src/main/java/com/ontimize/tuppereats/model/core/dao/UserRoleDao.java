package com.ontimize.tuppereats.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Repository(value = "UserRoleDao")
@Lazy
@ConfigurationFile(
	configurationFile = "dao/UserRoleDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class UserRoleDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID_USER_ROLE = "id_user_role";
	public static final String ATTR_ID_ROLENAME = "id_rolename";
	public static final String ATTR_USER = "user_";
	public static final int CLIENT_ROLE_VALUE = 2;

}
