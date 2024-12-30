package com.mc4.trainingjorge.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
@Entity
@Getter
@Setter
public class Prices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private Integer priceList;

    @Column
    private Integer priority;

    @Column
    private BigDecimal price;

    @Column
    private String curr;

    @Column
    private Short productId;

    @Column
    private Short brandId;
}
