/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.application.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.vixtorocha.exemplo.domain.Calendario;
import com.github.vixtorocha.exemplo.domain.Diferenca;

@RestController
public final class DiferencaController {

    @CrossOrigin
    @RequestMapping("ds")
    public static Diferenca diferencaDoisDias(
            @RequestParam(value = "dataInicial",
                    defaultValue = "não fornecida") final String dataInicialArg,
            @RequestParam(value = "dataFinal",
                    defaultValue = "não fornecida") final String dataFinalArg) {

        LocalDate dataInicial = localDateFromString(dataInicialArg);
        LocalDate dataFinal = localDateFromString(dataFinalArg);

        int diferenca = Calendario.calculaDiferenca(dataInicial, dataFinal);

        return new Diferenca(dataInicial, dataFinal, diferenca);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência de
     * caracteres.
     *
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     *         não está no formato esperado (por exemplo, "01-01-2018")
     */
    public static LocalDate localDateFromString(final String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
