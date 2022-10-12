package com.demo.ecommerce.Service;

import com.demo.ecommerce.Dao.Dao;
import com.demo.ecommerce.Model.ItemCarrito;
import com.demo.ecommerce.Model.ItemCarritoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCarritoServiceImp implements IItemCarritoService{

    @Autowired
    private Dao<ItemCarrito> itemCarritoDao;

    @Override
    public List<ItemCarrito> getItemsCarrito() {
        return itemCarritoDao.getAll();
    }

    @Override
    public void saveItemCarrito(ItemCarrito itemCarrito) {
       itemCarritoDao.save(itemCarrito);
    }

    @Override
    public void deleteItemCarrito(ItemCarrito itemCarrito) {
        itemCarritoDao.delete(itemCarrito);
    }

    @Override
    public ItemCarrito findItemCarrito(ItemCarrito itemCarrito) {
        return itemCarritoDao.find(itemCarrito);
    }
}
