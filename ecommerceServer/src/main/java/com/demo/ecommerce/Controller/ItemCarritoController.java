package com.demo.ecommerce.Controller;

import com.demo.ecommerce.dao.DaoItemCarritoImplement;
import com.demo.ecommerce.model.ItemCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemCarritoController {

    @Autowired
    private DaoItemCarritoImplement daoItemCarritoImplement;

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.GET)
    public List<ItemCarrito> getItemCarrito() {
        return daoItemCarritoImplement.getAll();
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.POST)
    public void addItemCarrito(@RequestBody ItemCarrito nuevoItemCarrito) {
        daoItemCarritoImplement.save(nuevoItemCarrito);
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.PUT)
    public void updateItemCarrito(@RequestBody ItemCarrito itemCarrito) {
        daoItemCarritoImplement.update(itemCarrito);
    }


    @RequestMapping(value="api/itemCarrito", method = RequestMethod.DELETE)
    public void deleteItemCarrito(@RequestBody ItemCarrito itemCarrito) {
        daoItemCarritoImplement.delete(itemCarrito);
    }


}