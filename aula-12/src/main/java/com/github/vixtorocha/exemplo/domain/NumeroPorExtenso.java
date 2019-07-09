/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.domain;

/**
 * Reúne um número e a sua escrita por extenso. Criada exclusivamente para
 * ilustrar a resposta via RESTFul API.
 */
public class NumeroPorExtenso {

    private int numeroArg;
    private String numeroPorExtenso;

    public NumeroPorExtenso(int numeroArg, String numeroPorExtenso) {
        this.numeroArg = numeroArg;
        this.numeroPorExtenso = numeroPorExtenso;
    }

    public int getNumeroArg() {
        return numeroArg;
    }

    public String getNumeroPorExtenso() {
        return numeroPorExtenso;
    }
}
