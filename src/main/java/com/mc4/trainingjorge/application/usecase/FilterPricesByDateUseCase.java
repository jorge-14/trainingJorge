package com.mc4.trainingjorge.application.usecase;

import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.PricesResponseDto;

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
 *   05.01.2025 | Jorge Luis Choque Callizaya | Creación Inicial
 *----------------------------------------
 */
public interface FilterPricesByDateUseCase {
    List<PricesModel> execute(Date startDate, String curr ,Short productId);
}
