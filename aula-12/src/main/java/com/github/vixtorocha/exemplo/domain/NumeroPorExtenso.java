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

    private static int numeroArg;
    private static String numeroPorExtenso;

    public NumeroPorExtenso(int setNumero, String SetNumeroPorExtenso) {
        numeroArg = setNumero;
        numeroPorExtenso = SetNumeroPorExtenso;
    }

    public static int getNumeroArg() {
        return numeroArg;
    }

    public static String getNumeroPorExtenso() {
        return numeroPorExtenso;
    }
}
