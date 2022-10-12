package com.demo.ecommerce.Service;

import com.demo.ecommerce.Model.Calzado;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICalzadoService {

    public List<Calzado> getCalzados();

    public void  alternarFavorito(String codigo_producto);

    public Calzado findCalzado( String codigo_calzado);
}
