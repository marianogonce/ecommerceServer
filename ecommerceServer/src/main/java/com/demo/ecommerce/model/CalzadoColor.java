package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "calzado_color")
public class CalzadoColor implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="codigo_producto")
    private Calzado calzado;

    @Id
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="codigo_color")
    private Color color;

    @Getter
    @Column(name="foto_miniatura_url")
    private String foto_miniatura_url;

}
