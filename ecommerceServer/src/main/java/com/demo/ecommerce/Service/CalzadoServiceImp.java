package com.demo.ecommerce.Service;

import com.demo.ecommerce.Model.Calzado;
import com.demo.ecommerce.Repository.ICalzadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalzadoServiceImp implements  ICalzadoService{

    @Autowired
    private ICalzadoRepository iCalzadoRepository;

    @Override
    public List<Calzado> getCalzados() {
        return iCalzadoRepository.findAll();
    }

    @Override
    public void alternarFavorito(String codigo_producto) {
        iCalzadoRepository.alternarFavorito(codigo_producto);
    }

    @Override
    public Calzado findCalzado(String codigo_producto) {
        return iCalzadoRepository.findById(codigo_producto).orElse(null);
    }

}
