package com.ontimize.tuppereats.model.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IMenuCustomerService;
import com.ontimize.tuppereats.model.core.dao.MenuCustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("MenuCustomerService")
@Lazy
public class MenuCustomerService implements IMenuCustomerService {
    @Autowired
    private MenuCustomerDao menuCustomerDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult menuCustomerQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.menuCustomerDao, keyMap, attrList);
    }


    @Override
    public EntityResult menuCustomerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.menuCustomerDao, attrMap);
    }

    @Override
    public EntityResult menuCustomerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.menuCustomerDao, attrMap, keyMap);
    }

    @Override
    public EntityResult menuCustomerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.menuCustomerDao, keyMap);
    }
}
