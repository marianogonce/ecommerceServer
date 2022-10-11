package com.demo.ecommerce.dao;

import com.demo.ecommerce.model.ItemCarrito;
import com.demo.ecommerce.model.Suscriptor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DaoSuscriptorImplement implements  Dao<Suscriptor>{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Suscriptor> getAll() {
        return null;
    }

    @Override
    public void save(Suscriptor suscriptor) {
        Suscriptor managedEntity = entityManager.merge(suscriptor);
    }

    @Override
    public void update(Suscriptor suscriptor) {

    }

    @Override
    public void delete(Suscriptor suscriptor) {

    }
}
