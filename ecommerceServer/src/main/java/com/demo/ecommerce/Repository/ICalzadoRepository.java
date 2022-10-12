package com.demo.ecommerce.Repository;

import com.demo.ecommerce.Model.Calzado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ICalzadoRepository extends JpaRepository<Calzado, String> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Calzado SET Calzado.es_favorito=!Calzado.es_favorito WHERE Calzado.codigo_producto=:codigo_producto", nativeQuery = true)
    public void alternarFavorito(@Param("codigo_producto") String codigo_producto);
}
