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
    protected Calendario() {
        // Apenas para agradar análise de cobertura
    }

    public static int calculaDiferenca(LocalDate dataInicial,
            LocalDate dataFinal) {

        Period period = Period.between(dataInicial, dataFinal);

        int diferenca = period.getDays();

        return Math.abs(diferenca);
    }

}
