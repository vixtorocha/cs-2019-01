/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.domain;

/**
 * Implementação do cálculo de diferença entre dois dias.
 */
public final class Numeros {

    final static int tamanhoMilhar = 4;
    final static int casaMilhar = 3;
    final static int casaCentena = 2;
    final static int casaDezena = 1;
    final static int casaUnidade = 0;
    final static String[] escritaCentena = {"", "Cento", "Duzentos",
            "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",
            "Setessentos", "Oitocentos", "Novecentos"};

    final static String[] escritaDezena = {"", "Dez", "Vinte", "Trinta",
            "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta",
            "Noventa"};

    final static String[] escDezAVinte = {"Dez", "Onze", "Doze", "Treze",
            "Quartoze", "Quinze", "Dezesseis", "Dezessete", "Dezoito",
            "Dezenove"};

    final static String[] escritaUnidade = {"Zero", "Um", "Dois", "Três",
            "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};

    /**
     * Não é esperada criação de instâncias desta classe.
     */
    private Numeros() {
        // Apenas para agradar análise de cobertura
    }

    /**
     * Trata da escrita dos Milhares. Também serve de ponto inicial.
     *
     * @param numeroVetor
     * @return
     */
    public static String milhares(int[] numeroVetor) {
        if (numeroVetor.length < tamanhoMilhar
                || numeroVetor[casaMilhar] == 0) {
            return centenas(numeroVetor);
        }

        if (numeroVetor[casaMilhar] == 1) {
            return "Mil" + centenas(numeroVetor);
        }

        return escritaUnidade[numeroVetor[casaMilhar]] + " Mil"
                + centenas(numeroVetor);
    }

    /**
     * Trata da escrita das centenas.
     *
     * @param numeroVetor
     * @return
     */
    public static String centenas(int[] numeroVetor) {
        if (numeroVetor[casaCentena] == 0) {
            return unidade(numeroVetor);
        }
        if (numeroVetor[casaDezena] == 0 && numeroVetor[casaUnidade] == 0) {
            if (numeroVetor[casaCentena] == 1) {
                return "Cem";
            }
            return escritaCentena[numeroVetor[casaCentena]];
        }

        return " e " + escritaCentena[numeroVetor[casaCentena]]
                + dezenas(numeroVetor);
    }

    /**
     * Trata da escrita das dezenas.
     *
     * @param numeroVetor
     * @return
     */
    public static String dezenas(int[] numeroVetor) {
        if (numeroVetor[casaDezena] == 0) {
            return unidade(numeroVetor);
        }
        if (numeroVetor[casaDezena] == 1) {
            return escDezAVinte[numeroVetor[casaUnidade]];
        }
        if (numeroVetor.length <= 1) {
            return escritaDezena[numeroVetor[casaDezena]]
                    + unidade(numeroVetor);
        }

        return " e " + escritaDezena[numeroVetor[casaDezena]]
                + unidade(numeroVetor);
    }

    /**
     * Trata da escrita das unidades.
     *
     * @param numeroVetor
     * @return
     */
    public static String unidade(int[] numeroVetor) {
        if (numeroVetor.length > 1 && numeroVetor[casaUnidade] == 0) {
            return "";
        }
        if (numeroVetor.length > 1) {
            return "e" + escritaUnidade[casaUnidade];
        }
        return escritaUnidade[casaUnidade];
    }

    public static String getExtenso(final int numeroArg) {
        if (numeroArg > 9999) {
            throw new IllegalArgumentException(
                    "O número deve conter no máximo 4 dígitos");
        }

        String temp = Integer.toString(numeroArg);
        int[] vetorNumero = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            vetorNumero[i] = temp.charAt(i) - '0';
        }

        return milhares(vetorNumero);
    }

}
