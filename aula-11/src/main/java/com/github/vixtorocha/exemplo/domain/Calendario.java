/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.domain;

import java.time.LocalDate;
import java.time.Period;

/**
 * Implementação do cálculo de diferença entre dois dias.
 */
public final class Calendario {

    /**
     * Não é esperada criação de instâncias desta classe.
     */
    private Calendario() {
        // Apenas para agradar análise de cobertura
    }

    /**
     * Calcula a diferença entre duas datas
     *
     * @param dataInicial A primeira data.
     * @param dataFinal   A segunda data.
     * @return A diferença entre as duas datas.
     */
    public static int calculaDiferenca(final LocalDate dataInicial,
            final LocalDate dataFinal) {

        Period period = Period.between(dataInicial, dataFinal);

        return Math.abs(period.getDays());
    }

}
