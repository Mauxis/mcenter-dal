package org.mauxis.mcenter.helper;

import org.apache.commons.logging.Log;
import org.mauxis.mcenter.dao.CategoryDAO;
import org.mauxis.mcenter.model.Category;
import org.mauxis.mcenter.vo.CategoryCreateRequestVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryHelper")
public class CategoryHelper {

    @Autowired
    CategoryDAO categoryDAO;

    static Logger logger = LoggerFactory.getLogger(CategoryHelper.class);

    public void create(CategoryCreateRequestVO request) throws Exception{

        List<Category> results = categoryDAO.findByName(request.getName());
        if (!results.isEmpty()){
            throw new Exception("Esta categoria ya existe");
        }else{
            categoryDAO.save(new Category(request.getName()));
        }
    }

    public void replace(CategoryCreateRequestVO request) throws Exception{

        List<Category> results = categoryDAO.findByName(request.getName());
        if (!results.isEmpty()){
            throw new Exception("Esta categoria ya existe");
        }else{
            categoryDAO.save(new Category(request.getName()));
        }
    }

    public void update(CategoryCreateRequestVO request) throws Exception{

        List<Category> results = categoryDAO.findByName(request.getName());
        if (!results.isEmpty()){
            throw new Exception("Esta categoria ya existe");
        }else{
            categoryDAO.save(new Category(request.getName()));
        }
    }

    public void delete(CategoryCreateRequestVO request) throws Exception{

        List<Category> results = categoryDAO.findByName(request.getName());
        if (!results.isEmpty()){
            throw new Exception("Esta categoria ya existe");
        }else{
            categoryDAO.save(new Category(request.getName()));
        }
    }

}
