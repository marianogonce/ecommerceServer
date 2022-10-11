package com.demo.ecommerce.Controller;

import com.demo.ecommerce.Dao.DaoItemCarritoImplement;
import com.demo.ecommerce.Model.ItemCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public void addItemCarrito(@Valid @RequestBody ItemCarrito nuevoItemCarrito) {
        daoItemCarritoImplement.save(nuevoItemCarrito);
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.PUT)
    public void updateItemCarrito(@Valid @RequestBody ItemCarrito itemCarrito) {
        daoItemCarritoImplement.update(itemCarrito);
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.DELETE)
    public void deleteItemCarrito(@Valid @RequestBody ItemCarrito itemCarrito) {
        daoItemCarritoImplement.delete(itemCarrito);
    }


}
