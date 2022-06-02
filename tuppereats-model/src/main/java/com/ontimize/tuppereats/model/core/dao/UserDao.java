package com.ontimize.tuppereats.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "UserDao")
@ConfigurationFile(
	configurationFile = "dao/UserDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class UserDao extends OntimizeJdbcDaoSupport {

	public static final String USER = "user_";
	public static final String EMAIL         = "email";
	public static final String PASSWORD      = "password";
	public static final String NAME          = "name";
	public static final String SURNAME       = "surname";
	public static final String NIF       	 = "nif";
	public static final String USERBLOCKED 		 	  = "userblocked";
	public static final String LASTPASSWORDUPDATE     = "lastpasswordupdate";
	public static final String FIRSTLOGIN 			  = "firstlogin";

}
