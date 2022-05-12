package com.ontimize.tuppereats.model.core.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.dto.EntityResultMapImpl;
import com.ontimize.jee.common.security.PermissionsProviderSecured;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IUserService;
import com.ontimize.tuppereats.model.core.dao.UserDao;
import com.ontimize.tuppereats.model.core.dao.UserRoleDao;


@Lazy
@Service("UserService")
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRoleDao userRoleDao;

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	public void loginQuery(Map<?, ?> key, List<?> attr) {
	}


	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList) {
		return this.daoHelper.query(userDao, keyMap, attrList);
	}

	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult userInsert(Map<?, ?> attrMap) {
		return this.daoHelper.insert(userDao, attrMap);
	}

	@Secured({ PermissionsProviderSecured.SECURED })
	public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
		return this.daoHelper.update(userDao, attrMap, keyMap);
	}

	@Secured({ PermissionsProviderSecured.SECURED })
	@Transactional(rollbackFor = Exception.class)
	public EntityResult userDelete(Map<?, ?> keyMap) {

		boolean canDelete = true;
		List<String> attrList = new ArrayList<String>();
		attrList.add(UserRoleDao.ATTR_ID_USER_ROLE);
		EntityResult query = this.daoHelper.query(this.userRoleDao, keyMap, attrList);

		if (query.getCode() != EntityResult.OPERATION_WRONG) {

			for (int i = 0; i < query.calculateRecordNumber(); i++) {
				Map recordValues = query.getRecordValues(i);
				EntityResult delete = this.daoHelper.delete(userRoleDao, recordValues);

				if (delete.getCode() == EntityResult.OPERATION_WRONG) {
					canDelete = false;
					break;
				}
			}
		}

		if (canDelete) {
			return this.daoHelper.delete(this.userDao, keyMap);
		}

		EntityResult toret = new EntityResultMapImpl();
		toret.setCode(EntityResult.OPERATION_WRONG);
		toret.setMessage("No se puede eliminar el usuario ya que existe un problema con su rol de usuario");
		return toret;

	}

}
