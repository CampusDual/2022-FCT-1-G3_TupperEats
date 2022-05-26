package com.ontimize.tuppereats.model.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.ISuscriptionCustomerService;
import com.ontimize.tuppereats.model.core.dao.SuscriptionCustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("SuscriptionCustomerService")
@Lazy
public class SuscriptionCustomerService implements ISuscriptionCustomerService {
    @Autowired
    private SuscriptionCustomerDao suscriptionCustomerDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;
    @Override
    public EntityResult suscriptionCustomerQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList);

    }

    @Override
    public EntityResult suscriptionCustomerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.suscriptionCustomerDao, attrMap);
    }

    @Override
    public EntityResult suscriptionCustomerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.suscriptionCustomerDao, attrMap, keyMap);
    }

    @Override
    public EntityResult suscriptionCustomerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.suscriptionCustomerDao, keyMap);
    }
}
