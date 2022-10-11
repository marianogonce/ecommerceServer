package com.demo.ecommerce.Model;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "talla")
public class Talla {

    @Id
    @Column(name="numero_talla")
    @Getter
    @NotBlank(message = "El campo numero_talla es obligatorio")
    private String numero_talla;
}
