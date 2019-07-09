/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.domain;

import java.time.LocalDate;

/**
 * Reúne uma data e o dia da semana correspondente. Criada exclusivamente para
 * ilustrar a resposta via RESTFul API.
 */
public final class Diferenca {

    /**
     * A data inicial fornecida pelo usuário.
     */
    private final LocalDate dataInicial;
    /**
     * A data inicial fornecida pelo usuário.
     */
    private final LocalDate dataFinal;
    /**
     * A diferenca entre a data final e a inicial.
     */
    private final int diferenca;

    /**
     * Construtor.
     *
     * @param dataInicialArg A data inicial
     * @param dataFinalArg   A data inicial
     * @param diferencaArg   A diferença
     */
    public Diferenca(final LocalDate dataInicialArg,
            final LocalDate dataFinalArg, final int diferencaArg) {
        dataInicial = dataInicialArg;
        dataFinal = dataFinalArg;
        diferenca = diferencaArg;
    }

    /**
     * Retorna a data inicial.
     *
     * @return Data inicial
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Retorna a data final.
     *
     * @return A data final
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Retorna a diferença.
     *
     * @return A diferença
     */
    public int getDiferenca() {
        return diferenca;
    }
}
