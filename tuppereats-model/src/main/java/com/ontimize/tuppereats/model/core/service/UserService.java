package com.ontimize.tuppereats.model.core.service;


import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.dto.EntityResultMapImpl;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.common.security.PermissionsProviderSecured;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IUserService;
import com.ontimize.tuppereats.model.core.dao.RoleDao;
import com.ontimize.tuppereats.model.core.dao.UserDao;
import com.ontimize.tuppereats.model.core.dao.UserRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Lazy
@Service("UserService")
public class UserService implements IUserService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Secured({PermissionsProviderSecured.SECURED})
    public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList) {
        return this.daoHelper.query(userDao, keyMap, attrList);
    }

    @Override
    public EntityResult userSuscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.USER_SUSCRIPTION_QUERY);
    }

    @Override
    public EntityResult totalSpentQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.TOTAL_SPENT);
    }

    @Override
    public EntityResult userMenuQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.USER_MENU_QUERY);
    }

    @Override
    public EntityResult customerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.CUSTOMER_QUERY);
    }

    @Override
    public EntityResult noCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.NO_CUSTOMER_QUERY);
    }

    @Secured({PermissionsProviderSecured.SECURED})
    public EntityResult userInsert(Map<?, ?> attrMap) {
        EntityResult userrole = null;
        Map<String, Object> datos = new HashMap<>();
        boolean canInsert = true;
        List<String> list = new ArrayList();
        list.add(RoleDao.ID_ROLENAME);
        Map<String, String> rolename = new HashMap<>();
        rolename.put("rolename",attrMap.get("id_rolename").toString());
        EntityResult id_rolename = this.daoHelper.query(this.roleDao, rolename, list);
        if (id_rolename.getCode() != EntityResult.OPERATION_WRONG) {

            for (int i = 0; i < id_rolename.calculateRecordNumber(); i++) {
                Map<?, ?> recordValues = id_rolename.getRecordValues(i);
                datos.put("user_", attrMap.get("user_"));
                datos.put("id_rolename", recordValues.get("id_rolename"));
                 userrole= this.daoHelper.insert(this.userDao, attrMap);
                if (userrole.getCode() == EntityResult.OPERATION_WRONG) {
                    canInsert = false;
                    break;
                }
            }
        }

        if (canInsert) {
            this.daoHelper.insert(this.userRoleDao,datos);
            return userrole;


        }
        EntityResult toret = new EntityResultMapImpl();
        toret.setCode(EntityResult.OPERATION_WRONG);
        toret.setMessage("No se puede insetar el usuario ya que existe un problema con su rol de usuario");
        return toret;
    }

    @Secured({PermissionsProviderSecured.SECURED})
    public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
        return this.daoHelper.update(userDao, attrMap, keyMap);
    }

    @Secured({PermissionsProviderSecured.SECURED})
    @Transactional(rollbackFor = Exception.class)
    public EntityResult userDelete(Map<?, ?> keyMap) {

        boolean canDelete = true;
        List<String> attrList = new ArrayList<>();
        attrList.add(UserRoleDao.ATTR_ID_USER_ROLE);
        EntityResult query = this.daoHelper.query(this.userRoleDao, keyMap, attrList);

        if (query.getCode() != EntityResult.OPERATION_WRONG) {

            for (int i = 0; i < query.calculateRecordNumber(); i++) {
                Map<?, ?> recordValues = query.getRecordValues(i);
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

    @Override
    public EntityResult graficaCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.GRAFICA_CUSTOMER);
    }

    @Override
    public EntityResult comboUserQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.userDao, keyMap, attrList, UserDao.COMBO_USER);
    }


}
