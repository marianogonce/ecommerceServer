package com.demo.ecommerce.Service;

import com.demo.ecommerce.Model.Suscriptor;
import com.demo.ecommerce.Repository.ISuscriptorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuscriptorServiceImp implements ISuscriptorService {

    @Autowired
    private ISuscriptorRepository iSuscriptorRepository;

    @Override
    public void saveSuscriptor(Suscriptor suscriptor) {
        iSuscriptorRepository.save(suscriptor);
    }

    @Override
    public Suscriptor findSuscriptor(String email) {
        return iSuscriptorRepository.findById(email).orElse(null);
    }
}
