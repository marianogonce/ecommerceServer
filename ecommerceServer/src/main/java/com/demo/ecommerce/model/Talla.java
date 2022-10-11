package com.demo.ecommerce.model;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "talla")
public class Talla {

    @Id
    @Column(name="numero_talla")
    @Getter
    private String numero_talla;
}
