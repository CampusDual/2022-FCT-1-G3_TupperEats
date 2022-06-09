package com.ontimize.tuppereats.model.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tuppereats.api.core.service.IMenuCategoryService;
import com.ontimize.tuppereats.model.core.dao.MenuCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("MenuCategoryService")
@Lazy
public class MenuCategoryService implements IMenuCategoryService {
    @Autowired
    private MenuCategoryDao menuCategoryDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult menuCategoryQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.menuCategoryDao,keyMap,attrList);
    }

    @Override
    public EntityResult menuCategoryInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.menuCategoryDao,attrMap);
    }

    @Override
    public EntityResult menuCategoryUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.menuCategoryDao,attrMap,keyMap);
    }

    @Override
    public EntityResult menuCategoryDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.menuCategoryDao,keyMap);
    }
}
