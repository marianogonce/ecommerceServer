package com.demo.ecommerce.Controller;

import com.demo.ecommerce.Exception.ItemNoEncontradoException;
import com.demo.ecommerce.Model.ItemCarrito;
import com.demo.ecommerce.Model.ItemCarritoId;
import com.demo.ecommerce.Service.IItemCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ItemCarritoController {

    @Autowired
    private IItemCarritoService iItemCarritoService;

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.GET)
    public List<ItemCarrito> getItemCarrito() {
        return iItemCarritoService.getItemsCarrito();
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.POST)
    public void addItemCarrito(@Valid @RequestBody ItemCarrito nuevoItemCarrito) {
        iItemCarritoService.saveItemCarrito(nuevoItemCarrito);
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.PUT)
    public void updateItemCarrito(@Valid @RequestBody ItemCarrito itemCarrito) throws ItemNoEncontradoException {
        if (iItemCarritoService.findItemCarrito(itemCarrito)==null) {
            throw new ItemNoEncontradoException("El item no ha sido encontrado");
        }
        iItemCarritoService.saveItemCarrito(itemCarrito);
    }

    @RequestMapping(value="api/itemCarrito", method = RequestMethod.DELETE)
    public void deleteItemCarrito(@Valid @RequestBody ItemCarrito itemCarrito) throws ItemNoEncontradoException {
        if (iItemCarritoService.findItemCarrito(itemCarrito)==null) {
            throw new ItemNoEncontradoException("El item no ha sido encontrado");
        }
        iItemCarritoService.deleteItemCarrito(itemCarrito);
    }


}
