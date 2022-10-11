package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "item_carrito")
public class ItemCarrito {


    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_producto")
    private Calzado calzado;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_color")
    private Color color;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "numero_talla")
    private Talla talla;

    @Getter
    @Column(name="cantidad")
    private int cantidad;

}
