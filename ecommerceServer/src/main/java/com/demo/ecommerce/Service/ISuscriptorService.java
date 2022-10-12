package com.demo.ecommerce.Service;

import com.demo.ecommerce.Model.Suscriptor;
import org.springframework.stereotype.Service;

public interface ISuscriptorService {
    public void  saveSuscriptor(Suscriptor suscriptor);

    public Suscriptor findSuscriptor(String email);
}
