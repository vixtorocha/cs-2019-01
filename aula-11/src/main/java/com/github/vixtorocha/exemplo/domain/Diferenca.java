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
public class Diferenca {

    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private final int diferenca;

    public Diferenca(LocalDate dataInicial, LocalDate dataFinal,
            int diferenca) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.diferenca = diferenca;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public int getDiferenca() {
        return diferenca;
    }
}
