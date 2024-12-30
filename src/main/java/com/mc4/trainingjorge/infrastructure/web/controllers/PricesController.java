package com.mc4.trainingjorge.infrastructure.web.controllers;

import com.mc4.commons.base.infrastructure.web.controllers.BaseController;
import com.mc4.trainingjorge.application.usecase.PricesCrudUseCase;
import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.request.PricesRequestDto;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.PricesResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestController;

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

@RestController("api/v1/prices")
public class PricesController extends BaseController<Short, PricesModel, PricesRequestDto, PricesResponseDto>{

    public PricesController(PricesCrudUseCase pricesCrudUseCase, ModelMapper modelMapper, MessageSource messageSource){
        super(pricesCrudUseCase, modelMapper, messageSource);
    }
}
