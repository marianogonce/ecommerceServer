package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "talla_calzado")
public class TallaCalzado {

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="codigo_producto")
    private Calzado calzado;

    @Getter
    @Column(name="codigo_talla")
    private String codigo_talla;

}
