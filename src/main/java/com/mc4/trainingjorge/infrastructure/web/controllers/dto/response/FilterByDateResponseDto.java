package com.mc4.trainingjorge.infrastructure.web.controllers.dto.response;

import lombok.Data;

import java.util.Date;

/*
 *----------------------------------------
 *   Código de Aplicación:
 *   Código de Objeto:
 *   Descripción:
 *   Author Prog: Jorge Luis Choque Callizaya
 *----------------------------------------
 *   Fecha | Autor | Comentario
 *   05.01.2025 | Jorge Luis Choque Callizaya | Creación Inicial
 *----------------------------------------
 */
@Data
public class FilterByDateResponseDto {
    private Short brandId;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private Short productId;
    private Double price;
    private String curr;
}
