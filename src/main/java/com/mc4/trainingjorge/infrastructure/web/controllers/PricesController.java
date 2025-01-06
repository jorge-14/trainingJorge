package com.mc4.trainingjorge.infrastructure.web.controllers;

import com.mc4.commons.base.infrastructure.web.controllers.BaseController;
import com.mc4.trainingjorge.application.usecase.FilterPricesByDateUseCase;
import com.mc4.trainingjorge.application.usecase.PricesCrudUseCase;
import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.request.PricesRequestDto;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.FilterByDateResponseDto;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.PricesResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.ZonedDateTime;
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

@RestController("api/v1/prices")
public class PricesController extends BaseController<Short, PricesModel, PricesRequestDto, PricesResponseDto> {

    private final FilterPricesByDateUseCase filterPricesByDateUseCase;

    public PricesController(PricesCrudUseCase pricesCrudUseCase, ModelMapper modelMapper, MessageSource messageSource,
                            FilterPricesByDateUseCase filterPricesByDateUseCase) {
        super(pricesCrudUseCase, modelMapper, messageSource);
        this.filterPricesByDateUseCase = filterPricesByDateUseCase;
    }

    @GetMapping("/filter-prices-date")
    public List<FilterByDateResponseDto> findByDateFilter(@RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX") ZonedDateTime startDate,
                                                    @RequestParam("curr") String curr,
                                                    @RequestParam("productId") Short productId) {

        return filterPricesByDateUseCase.execute(Date.from(startDate.toInstant()), curr, productId)
                .stream().map(prices -> modelMapper.map(prices, FilterByDateResponseDto.class)).toList();

    }
}
