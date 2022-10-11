package com.demo.ecommerce.Model;


import lombok.Getter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@IdClass(ItemCarritoId.class)
@Table(name = "item_carrito")
public class ItemCarrito {


    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_producto")
    @NotNull(message = "El campo calzado es obligatorio")
    @Valid
    private Calzado calzado;

    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_color")
    @NotNull(message = "El campo color es obligatorio")
    @Valid
    private Color color;

    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "numero_talla")
    @NotNull(message = "El campo talla es obligatorio")
    @Valid
    private Talla talla;

    @Getter
    @Column(name="cantidad")
    @Min(value = 1)
    @NotNull(message = "El campo cantidad es obligatorio")
    private int cantidad;

}
