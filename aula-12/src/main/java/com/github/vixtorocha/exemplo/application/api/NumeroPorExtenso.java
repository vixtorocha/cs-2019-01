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
    private static int numeroArg;
    /**
     * A escrita por extenso.
     */
    private static String numeroPorExtenso;

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
    public static final int getNumeroArg() {
        return numeroArg;
    }

    /**
     * Retorna o número por extenso.
     *
     * @return o número por extenso
     */
    public static final String getNumeroPorExtenso() {
        return numeroPorExtenso;
    }
}
