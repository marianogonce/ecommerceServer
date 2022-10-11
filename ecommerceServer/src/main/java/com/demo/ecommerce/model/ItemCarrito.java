package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item_carrito")
public class ItemCarrito implements Serializable {


    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_producto")
    private Calzado calzado;

    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_color")
    private Color color;

    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "numero_talla")
    private Talla talla;

    @Getter
    @Column(name="cantidad")
    private int cantidad;

}
