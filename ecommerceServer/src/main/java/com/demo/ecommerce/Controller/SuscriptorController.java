package com.demo.ecommerce.Controller;

import com.demo.ecommerce.Exception.SuscriptorYaRegistradoException;
import com.demo.ecommerce.Model.Suscriptor;
import com.demo.ecommerce.Service.ISuscriptorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SuscriptorController {

    @Autowired
    private ISuscriptorService iSuscriptorService;

    @RequestMapping(value="api/suscriptor", method = RequestMethod.POST)
    public void saveNuevoSuscriptor(@Valid  @RequestBody Suscriptor nuevoSuscriptor) throws SuscriptorYaRegistradoException {
        if(iSuscriptorService.findSuscriptor(nuevoSuscriptor.getEmail_suscriptor())!=null) {
            throw new SuscriptorYaRegistradoException("El suscriptor ya se encuentra  registrado");
        }
        iSuscriptorService.saveSuscriptor(nuevoSuscriptor);
    }
}
