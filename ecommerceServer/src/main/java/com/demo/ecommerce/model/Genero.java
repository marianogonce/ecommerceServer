package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @Getter
    @Column(name="nombre_genero")
    private String nombre_genero;
}
