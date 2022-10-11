package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "suscriptor")
public class Suscriptor {

    @Id
    @Column(name="email_suscriptor")
    @Getter
    @NotBlank(message = "El campo email_suscriptor es obligatorio")
    @Email(message = "El campo email_suscriptor tiene que tener formato de email")
    private String email_suscriptor;

}
