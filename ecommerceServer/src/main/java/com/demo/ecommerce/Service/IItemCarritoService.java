package com.demo.ecommerce.Service;

import com.demo.ecommerce.Model.ItemCarrito;

import java.util.List;

public interface IItemCarritoService {
    public List<ItemCarrito> getItemsCarrito();

    public void saveItemCarrito(ItemCarrito itemCarrito);

    public void deleteItemCarrito(ItemCarrito itemCarrito);

    public ItemCarrito findItemCarrito(ItemCarrito itemCarrito);
}
