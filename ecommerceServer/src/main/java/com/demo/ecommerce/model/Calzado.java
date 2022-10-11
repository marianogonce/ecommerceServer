package com.demo.ecommerce.Model;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "calzado")
public class Calzado implements Serializable {

    @Id
    @Column(name = "codigo_producto")
    @Getter
    @NotBlank(message = "El campo codigo_producto es obligatorio")
    private String codigo_producto;

    @Column(name = "nombre")
    @Getter
    @NotBlank(message = "El campo nombre es obligatorio")
    private String nombre;

    @Column(name = "precio")
    @Getter
    @Min(value = 1)
    @NotNull(message = "El campo precio es obligatorio")
    private Long precio;

    @Column(name = "referencia")
    @Getter
    @NotBlank(message = "El campo referencia es obligatorio")
    private String referencia;

    @Column(name = "detalle")
    @Getter
    @NotBlank(message = "El campo detalle es obligatorio")
    private String detalle;

    @Column(name = "es_favorito")
    @Getter
    @NotNull(message = "El campo es_favorito es obligatorio")
    private Boolean es_favorito;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nombre_genero")
    @NotNull(message = "El campo genero es obligatorio")
    private Genero genero;

    @Column(name = "fecha_lanzamiento")
    @Getter
    @NotBlank(message = "El campo fecha_lanzamiento es obligatorio")
    private String fecha_lanzamiento;


    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_tecnologia")
    @NotNull(message = "El campo codigo_tecnologia es obligatorio")
    private Tecnologia tecnologia;

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_material")
    @NotNull(message = "El campo material es obligatorio")
    private Material material;

    @Getter
    @OneToMany(mappedBy = "calzado")
    @NotEmpty(message = "El campo fotos es obligatorio")
    private List<Foto> fotos = new ArrayList<Foto>();

    @Getter
    @OneToMany(mappedBy = "calzado")
    @NotEmpty(message = "El campo tallas es obligatorio")
    private List<TallaCalzado> tallas = new ArrayList<TallaCalzado>();

    @Getter
    @OneToMany(mappedBy = "calzado")
    @NotEmpty(message = "El campo colores es obligatorio")
    private List<CalzadoColor> colores = new ArrayList<CalzadoColor>();

}
