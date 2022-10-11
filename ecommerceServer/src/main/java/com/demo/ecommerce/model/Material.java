package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @Column(name="codigo_material")
    @Getter
    private String codigo_material;
}
