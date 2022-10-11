package com.demo.ecommerce.dao;

import com.demo.ecommerce.model.ItemCarrito;
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
        String query ="FROM item_carrito";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void save(ItemCarrito itemCarrito) {
        ItemCarrito managedEntity = entityManager.merge(itemCarrito);
    }

    @Override
    public void update(ItemCarrito itemCarrito) {
        entityManager.createQuery("UPDATE item_carrito SET codigo_producto=" + itemCarrito.getCalzado().getCodigo_producto() + ", codigo_color=" + itemCarrito.getColor().getCodigo_color() +  ",numero_talla=" + itemCarrito.getTalla().getNumero_talla()).executeUpdate();
    }

    @Override
    public void delete(ItemCarrito itemCarrito) {
       entityManager.createQuery("DELETE FROM item_carrito WHERE codigo_producto=" + itemCarrito.getCalzado().getCodigo_producto() + "AND codigo_color=" + itemCarrito.getColor().getCodigo_color() +  "AND numero_talla=" + itemCarrito.getTalla().getNumero_talla()).executeUpdate();
    }
}
