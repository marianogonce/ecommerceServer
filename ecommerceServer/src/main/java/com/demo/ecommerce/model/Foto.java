package com.demo.ecommerce.Model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "foto")
public class Foto {

    @Id
    @Getter
    @Column(name="foto_url")
    private String foto_url;

    @Getter
    @Column(name="descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_producto")
    private Calzado calzado;
}
