package com.mc4.trainingjorge.domain.services.impl;

import com.mc4.commons.base.domain.service.impl.BaseServiceImpl;
import com.mc4.trainingjorge.domain.services.PricesService;
import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.infrastructure.persistence.entities.Prices;
import com.mc4.trainingjorge.infrastructure.persistence.repositories.PricesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, Short, PricesModel> implements PricesService {

    public PricesServiceImpl(ModelMapper modelMapper, PricesRepository pricesRepository){
        super(modelMapper, pricesRepository);
    }
}
