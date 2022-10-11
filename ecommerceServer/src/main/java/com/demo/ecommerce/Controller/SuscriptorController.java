package com.demo.ecommerce.Controller;

import com.demo.ecommerce.dao.DaoSuscriptorImplement;
import com.demo.ecommerce.model.Suscriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuscriptorController {

    @Autowired
    private DaoSuscriptorImplement daoSuscriptorImplement;

    @RequestMapping(value="api/suscriptor", method = RequestMethod.POST)
    public void saveNuevoSuscriptor(@RequestBody Suscriptor nuevoSuscriptor) {
        daoSuscriptorImplement.save(nuevoSuscriptor);
    }
}
