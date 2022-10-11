package com.demo.ecommerce.model;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "calzado")
public class Calzado implements Serializable {

    @Id
    @Column(name = "codigo_producto")
    @Getter
    private String codigo_producto;

    @Column(name = "nombre")
    @Getter
    private String nombre;

    @Column(name = "precio")
    @Getter
    private Long precio;

    @Column(name = "referencia")
    @Getter
    private String referencia;

    @Column(name = "detalle")
    @Getter
    private String detalle;

    @Column(name = "es_favorito")
    @Getter
    private Boolean es_favorito;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nombre_genero")
    private Genero genero;

    @Column(name = "fecha_lanzamiento")
    @Getter
    private String fecha_lanzamiento;


    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_tecnologia")
    private Tecnologia tecnologia;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_material")
    private Material material;

    @Getter
    @OneToMany(mappedBy = "calzado")
    private List<Foto> fotos = new ArrayList<Foto>();

    @Getter
    @OneToMany(mappedBy = "calzado")
    private List<TallaCalzado> tallas = new ArrayList<TallaCalzado>();

    @Getter
    @OneToMany(mappedBy = "calzado")
    private List<CalzadoColor> colores = new ArrayList<CalzadoColor>();

}
