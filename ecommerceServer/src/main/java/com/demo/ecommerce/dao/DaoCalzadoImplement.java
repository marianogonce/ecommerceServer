package com.demo.ecommerce.dao;

import com.demo.ecommerce.model.Calzado;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DaoCalzadoImplement implements Dao<Calzado> {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Calzado> getAll() {
        String query ="FROM calzados";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void save(Calzado o) {

    }

    @Override
    public void update(Calzado o) {

    }

    @Override
    public void delete(Calzado o) {

    }
}