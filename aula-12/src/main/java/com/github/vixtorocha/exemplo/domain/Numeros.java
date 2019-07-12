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

    /**
     * Define o tamanho de um número que vai até a casa dos milhares.
     */
    static final int TAMANHOMILHAR = 4;
    /**
     * Define o tamanho de um número que vai até a casa das centenas.
     */
    static final int TAMANHOCENTENA = 3;
    /**
     * Define o indice da casa do milhar no vetor.
     */
    static final int CASAMILHAR = 3;
    /**
     * Define o indice da casa do milhar no vetor.
     */
    static final int CASACENTENA = 2;
    /**
     * Define o indice da casa das centenas no vetor.
     */
    static final int CASADEZENA = 1;
    /**
     * Define o indice da casa das unidades no vetor.
     */
    static final int CASAUNIDADE = 0;
    /**
     * Define a escrita das centenas.
     */
    static final String[] ESCRITACENTENA = {"", "Cento", "Duzentos",
            "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",
            "Setessentos", "Oitocentos", "Novecentos"};
    /**
     * Define a escrita das dezenas.
     */
    static final String[] ESCRITADEZENA = {"", "Dez", "Vinte", "Trinta",
            "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta",
            "Noventa"};
    /**
     * Define a escrita das dezenas de dez a vinte (onze, doze, etc).
     */
    static final String[] DEZ_A_VINTE = {"Dez", "Onze", "Doze", "Treze",
            "Quartoze", "Quinze", "Dezesseis", "Dezessete", "Dezoito",
            "Dezenove"};
    /**
     * Define a escrita das unidades.
     */
    static final String[] ESCRITAUNIDADE = {"Zero", "Um", "Dois", "Três",
            "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};

    /**
     * Trata da escrita dos Milhares. Também serve de ponto inicial.
     *
     * @param numeroVetor O número em formato de vetor.
     * @return a escrita e/ou a próxima etapa do algoritmo.
     */
    public static String milhares(final int[] numeroVetor) {
        // Se não for até milhar, pula para as centenas.
        if (numeroVetor.length < TAMANHOMILHAR) {
            return centenas(numeroVetor);
        }

        if (numeroVetor[CASAMILHAR] == 1) {
            return "Mil" + centenas(numeroVetor);
        }

        return ESCRITAUNIDADE[numeroVetor[CASAMILHAR]] + " Mil"
                + centenas(numeroVetor);
    }

    /**
     * Trata da escrita das centenas.
     *
     * @param numeroVetor O número em formato de vetor.
     * @return a escrita e/ou a próxima etapa do algoritmo.
     */
    public static String centenas(final int[] numeroVetor) {
        // Se não for até as centenas, ou a casa das centenas for 0, pula para
        // as dezenas
        if (numeroVetor.length < TAMANHOCENTENA
                || numeroVetor[CASACENTENA] == 0) {
            return dezenas(numeroVetor);
        }

        if (numeroVetor[CASADEZENA] == 0 && numeroVetor[CASAUNIDADE] == 0
                && numeroVetor.length == TAMANHOMILHAR) {
            if (numeroVetor[CASACENTENA] == 1) {
                return " e Cem";
            }
            return " e " + ESCRITACENTENA[numeroVetor[CASACENTENA]];
        }

        if (numeroVetor[CASADEZENA] == 0 && numeroVetor[CASAUNIDADE] == 0) {
            if (numeroVetor[CASACENTENA] == 1) {
                return "Cem";
            }
            return ESCRITACENTENA[numeroVetor[CASACENTENA]];
        }

        return " " + ESCRITACENTENA[numeroVetor[CASACENTENA]]
                + dezenas(numeroVetor);
    }

    /**
     * Trata da escrita das dezenas.
     *
     * @param numeroVetor O número em formato de vetor.
     * @return a escrita e/ou a próxima etapa do algoritmo.
     */
    public static String dezenas(final int[] numeroVetor) {
        // Se não tiver dezena, ou a dezena for zero, chama a unidade.
        if (numeroVetor.length < 2 || numeroVetor[CASADEZENA] == 0) {
            return unidade(numeroVetor);
        }

        // Se o número só for até a dezena, não coloca "e".
        if (numeroVetor.length == 2) {
            // Se a casa da dezena for 1, a escrita vai ser diferente
            if (numeroVetor[CASADEZENA] == 1) {
                return DEZ_A_VINTE[numeroVetor[CASAUNIDADE]];
            }
            return ESCRITADEZENA[numeroVetor[CASADEZENA]]
                    + unidade(numeroVetor);
        }

        // Se a casa da dezena for 1, a escrita vai ser diferente (onze, doze).
        if (numeroVetor[CASADEZENA] == 1) {
            return " e " + DEZ_A_VINTE[numeroVetor[CASAUNIDADE]];
        }

        return " e " + ESCRITADEZENA[numeroVetor[CASADEZENA]]
                + unidade(numeroVetor);
    }

    /**
     * Trata da escrita das unidades.
     *
     * @param numeroVetor O número em formato de vetor.
     * @return a escrita e/ou a próxima etapa do algoritmo.
     */
    public static String unidade(final int[] numeroVetor) {
        // Se a casa das unidades for 0, mas
        if (numeroVetor.length > 1 && numeroVetor[CASAUNIDADE] == 0) {
            return "";
        }
        if (numeroVetor.length > 1) {
            return " e " + ESCRITAUNIDADE[numeroVetor[CASAUNIDADE]];
        }
        return ESCRITAUNIDADE[numeroVetor[CASAUNIDADE]];
    }

    /**
     * Transforma um argumento númerico em seu equivalente por extenso.
     *
     * @param numeroArg O argumento numérico
     * @return uma String do número por extenso.
     */
    public static String getExtenso(final int numeroArg) {
        final int limiteSuperior = 9999;
        if (numeroArg > limiteSuperior || numeroArg < 0) {
            throw new IllegalArgumentException(
                    "O número deve conter no máximo 4 dígitos");
        }

        // Transforma o número em um vetor de dígitos
        String temp = Integer.toString(numeroArg);
        int[] vetorNumero = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            vetorNumero[i] = temp.charAt(i) - '0';
        }

        // Inverte o vetor para funcionar com o algoritmo
        for (int i = 0; i < vetorNumero.length / 2; i++) {
            int aux = vetorNumero[i];
            vetorNumero[i] = vetorNumero[vetorNumero.length - (1 + i)];
            vetorNumero[vetorNumero.length - (1 + i)] = aux;
        }

        return milhares(vetorNumero);
    }

    /**
     * Não é esperada criação de instâncias desta classe.
     */
    private Numeros() {
        // Apenas para agradar análise de cobertura
    }

}
