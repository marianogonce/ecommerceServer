package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @Getter
    @Column(name="codigo_color")
    @NotBlank(message = "el campo codigo_color es obligatorio")
    private String codigo_color;

    @Getter
    @Column(name="descripcion")
    @NotBlank(message = "el campo descripción es obligatorio")
    private String descripcion;

}
