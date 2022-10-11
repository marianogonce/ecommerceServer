package com.demo.ecommerce.Model;

import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

public class ItemCarritoId implements Serializable {

    @Getter
    private Calzado calzado;

    @Getter
    private Color color;

    @Getter
    private Talla talla;

    public ItemCarritoId() {

    }

    public ItemCarritoId(Calzado calzado, Color color, Talla talla) {
        this.calzado = calzado;
        this.color = color;
        this.talla = talla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemCarritoId)) return false;
        ItemCarritoId that = (ItemCarritoId) o;
        return Objects.equals(getCalzado().getCodigo_producto(), that.getCalzado().getCodigo_producto()) &&
                Objects.equals(getColor().getCodigo_color(), that.getColor().getCodigo_color()) && Objects.equals(getTalla().getNumero_talla(), that.getTalla().getNumero_talla());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCalzado().getCodigo_producto(), getColor().getCodigo_color(), getTalla().getNumero_talla());
    }


}



