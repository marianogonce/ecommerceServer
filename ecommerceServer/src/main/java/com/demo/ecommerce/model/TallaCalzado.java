package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "talla_calzado")
public class TallaCalzado implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="codigo_producto")
    private Calzado calzado;

    @Id
    @Getter
    @Column(name="codigo_talla")
    private String codigo_talla;

}
