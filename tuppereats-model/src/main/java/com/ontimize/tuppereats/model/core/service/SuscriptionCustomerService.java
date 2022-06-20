package com.ontimize.tuppereats.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.common.security.PermissionsProviderSecured;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.ISuscriptionCustomerService;
import com.ontimize.tuppereats.model.core.dao.SuscriptionCustomerDao;


@Service("SuscriptionCustomerService")
@Lazy
public class SuscriptionCustomerService implements ISuscriptionCustomerService {
    @Autowired
    private SuscriptionCustomerDao suscriptionCustomerDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
	@Secured({ PermissionsProviderSecured.SECURED })
    public EntityResult suscriptionCustomerQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList);
    }

	@Override
	public EntityResult suscriptionMenuQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList,
				SuscriptionCustomerDao.SUSCRIPTION_MENU_QUERY);
	}

	@Override
	public EntityResult graficaSuscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList,
				SuscriptionCustomerDao.GRAFICA_SUSCRIPTION);
	}
	
	
    @Override
    public EntityResult graficaProductQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList,
                SuscriptionCustomerDao.GRAFICA_PRODUCT);
    }


    @Override
	@Secured({ PermissionsProviderSecured.SECURED })
    public EntityResult suscriptionCustomerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.suscriptionCustomerDao, attrMap);
    }

    @Override
	@Secured({ PermissionsProviderSecured.SECURED })
    public EntityResult suscriptionCustomerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.suscriptionCustomerDao, attrMap, keyMap);
    }

    @Override
	@Secured({ PermissionsProviderSecured.SECURED })
    public EntityResult suscriptionCustomerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.suscriptionCustomerDao, keyMap);
    }

	@Override
	public EntityResult graficaDetalleSuscriptionQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.suscriptionCustomerDao, keyMap, attrList,
                SuscriptionCustomerDao.GRAFICA_DETALLE_SUSCRIPTION);
	}
}
