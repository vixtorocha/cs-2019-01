/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.vixtorocha.exemplo.domain.NumeroPorExtenso;
import com.github.vixtorocha.exemplo.domain.Numeros;

@RestController
public class NumeroPorExtensoController {

    @CrossOrigin
    @RequestMapping("ds")
    public NumeroPorExtenso diferencaDoisDias(@RequestParam(value = "numero",
            defaultValue = "não fornecida") int numeroArg) {

        return new NumeroPorExtenso(numeroArg, Numeros.getExtenso(numeroArg));
    }
}
