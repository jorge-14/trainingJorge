package com.mc4.trainingjorge.infrastructure.web.controllers.dto.response;

import com.mc4.commons.base.infrastructure.web.dto.response.ResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

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
public class PricesResponseDto extends ResponseDTO<Short> {
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private BigDecimal price;
    private Integer priority;
    private String curr;
    private Short brandId;
    private Short productId;
}
