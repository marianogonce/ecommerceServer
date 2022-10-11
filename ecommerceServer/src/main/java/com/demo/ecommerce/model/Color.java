package com.demo.ecommerce.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @Getter
    @Column(name="codigo_color")
    private String codigo_color;

    @Getter
    @Column(name="descripcion")
    private String descripcion;

}
