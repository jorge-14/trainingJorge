package com.mc4.trainingjorge.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Data
public class PricesModel {

    private Short id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer priceList;
    private BigDecimal price;
    private Integer priority;
    private String curr;
    private Short brandId;
    private Short productId;
}
