package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "calzado_color")
public class CalzadoColor {

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="codigo_producto")
    private Calzado calzado;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="codigo_color")
    private Color color;

    @Getter
    @Column(name="foto_miniatura_url")
    private String foto_miniatura_url;

}
