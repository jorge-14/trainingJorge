package com.mc4.trainingjorge.application.usecase.impl;

import com.mc4.commons.base.application.usecases.impl.CrudUseCaseImpl;
import com.mc4.trainingjorge.application.usecase.PricesCrudUseCase;
import com.mc4.trainingjorge.domain.model.PricesModel;
import com.mc4.trainingjorge.domain.services.PricesService;
import org.springframework.stereotype.Component;

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
@Component
public class PricesCrudUseCaseImpl extends CrudUseCaseImpl<Short, PricesModel> implements PricesCrudUseCase {
    public PricesCrudUseCaseImpl(PricesService baseService) {
        super(baseService);
    }
}
