/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.application.api;

/**
 * Reúne um número e a sua escrita por extenso. Criada exclusivamente para
 * ilustrar a resposta via RESTFul API.
 */
public class NumeroPorExtenso {

    /**
     * O número absoluto.
     */
    private final int numeroArg;
    /**
     * A escrita por extenso.
     */
    private final String numeroPorExtenso;

    protected NumeroPorExtenso(final int setNumero,
            final String setNumeroPorExtenso) {
        numeroArg = setNumero;
        numeroPorExtenso = setNumeroPorExtenso;
    }

    /**
     * Retorna o número absoluto.
     *
     * @return o número.
     */
    public int getNumeroArg() {
        return numeroArg;
    }

    /**
     * Retorna o número por extenso.
     *
     * @return o número por extenso
     */
    public String getNumeroPorExtenso() {
        return numeroPorExtenso;
    }
}
