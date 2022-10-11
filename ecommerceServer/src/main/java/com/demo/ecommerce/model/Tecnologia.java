package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tecnologia")
public class Tecnologia {

    @Id
    @Column(name = "codigo_tecnologia")
    @Getter
    private String codigo_tecnologia;

    @Column(name = "nombre")
    @Getter
    private String nombre;

    @Column(name = "descripcion")
    @Getter
    private String descripcion;
}
