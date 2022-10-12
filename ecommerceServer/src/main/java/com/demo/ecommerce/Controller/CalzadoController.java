package com.demo.ecommerce.Controller;


import com.demo.ecommerce.Exception.CalzadoNoEncontradoException;
import com.demo.ecommerce.Model.Calzado;
import com.demo.ecommerce.Service.ICalzadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class CalzadoController {

    @Autowired
    private ICalzadoService iCalzadoService;

    @RequestMapping(value="api/calzados", method = RequestMethod.GET)
    public List<Calzado> getCalzados() {
        return iCalzadoService.getCalzados();
    }

    @RequestMapping(value="api/calzados", method = RequestMethod.PUT)
    public void alternarFavoritoCalzado(@Valid @RequestBody Calzado calzado) throws CalzadoNoEncontradoException {
        if(iCalzadoService.findCalzado(calzado.getCodigo_producto())==null) {
            throw new CalzadoNoEncontradoException("El calzado no ha sido encontrado");
        }
        iCalzadoService.alternarFavorito(calzado.getCodigo_producto());
    }

}