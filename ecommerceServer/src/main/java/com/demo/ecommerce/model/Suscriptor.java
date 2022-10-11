package com.demo.ecommerce.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suscriptor")
public class Suscriptor {

    @Id
    @Column(name="email_suscriptor")
    @Getter
    private String email_suscriptor;

}
