package com.mc4.trainingjorge.application.usecase.impl;

import com.mc4.trainingjorge.application.usecase.FilterPricesByDateUseCase;
import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.domain.services.PricesService;
import com.mc4.trainingjorge.infrastructure.persistence.repositories.PricesRepository;
import com.mc4.trainingjorge.infrastructure.web.controllers.dto.response.PricesResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

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
@Component
@RequiredArgsConstructor
public class FilterPricesByDateUseCaseImpl implements FilterPricesByDateUseCase {

    private final PricesService pricesService;

    private final ModelMapper modelMapper;

    private  final PricesRepository pricesRepository;
    @Override
    public List<PricesModel> execute(Date startDate, String curr ,Short productId) {
        return pricesRepository.findByDate(startDate, curr, productId)
                .stream().map( prices -> modelMapper.map(prices, PricesModel.class)).toList();
    }
}
