package com.demo.ecommerce.Controller;

import com.demo.ecommerce.dao.Dao;
import com.demo.ecommerce.dao.DaoCalzadoImplement;
import com.demo.ecommerce.model.Calzado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CalzadoController {

    @Autowired
    private DaoCalzadoImplement daoCalzado;

    @RequestMapping(value="api/calzados", method = RequestMethod.GET)
    public List<Calzado> getCalzados() {
        return daoCalzado.getAll();
    }
    
}