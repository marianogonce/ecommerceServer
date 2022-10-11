package com.demo.ecommerce.dao;

import com.demo.ecommerce.model.ItemCarrito;
import com.demo.ecommerce.model.ItemCarritoId;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DaoItemCarritoImplement implements  Dao<ItemCarrito>{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ItemCarrito> getAll() {
        String query ="FROM ItemCarrito";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void save(ItemCarrito itemCarrito) {
        ItemCarrito managedEntity = entityManager.merge(itemCarrito);
    }

    @Override
    public void update(ItemCarrito itemCarrito) {
        ItemCarrito itemAModificar = entityManager.find(ItemCarrito.class, new ItemCarritoId(itemCarrito.getCalzado(), itemCarrito.getColor(), itemCarrito.getTalla()));
        entityManager.detach(itemAModificar);
        itemAModificar = itemCarrito;
        entityManager.merge(itemAModificar);
    }

    @Override
    public void delete(ItemCarrito itemCarrito) {
        ItemCarrito itemAEliminar = entityManager.find(ItemCarrito.class, new ItemCarritoId(itemCarrito.getCalzado(), itemCarrito.getColor(), itemCarrito.getTalla()));
        entityManager.remove(itemAEliminar);
    }


}
