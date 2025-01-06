package com.mc4.trainingjorge.infrastructure.persistence.repositories;

import com.mc4.commons.base.infrastructure.persistence.repositories.BaseRepository;
import com.mc4.trainingjorge.infrastructure.persistence.entities.Prices;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.PricesResponseDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/*
 *----------------------------------------
 *   Código de Aplicación:
 *   Código de Objeto:
 *   Descripción:
 *   Author Prog: Jorge Luis Choque Callizaya
 *----------------------------------------
 *   Fecha | Autor | Comentario
 *   30.12.2024 | Jorge Luis Choque Callizaya | Creación Inicial
 *----------------------------------------
 */
public interface PricesRepository extends BaseRepository<Prices, Short> {

    @Query("SELECT p " +
            "FROM Prices p " +
            "WHERE p.startDate = :startDate " +
            "AND p.productId = :productId " +
            "AND p.curr = :curr")
    List<Prices> findByDate(@Param("startDate") Date startDate,
                            @Param("curr") String curr,
                            @Param("productId") Short productId);

}
