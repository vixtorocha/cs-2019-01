package com.github.vixtorocha.ufg.cs.aula07;

import java.util.Random;

/**
 * Implementação de alguns algoritmos de iteração.
 */
public final class Algoritmos {

    /**
     * Encontra a menor temperatura em um vetor de temperaturas.
     *
     * @param vetTemp Vetor de temperaturas.
     * @return A menor temperatura.
     */
    public static int menorTemperatura(final int[] vetTemp) {

        if (vetTemp.length < 1) {
            throw new IllegalArgumentException(
                    "Deve ser passado um vetor com pelo menos um elemento");
        }

        int menorTemp = vetTemp[0];

        for (int currentTemp : vetTemp) {

            if (currentTemp < menorTemp) {
                menorTemp = currentTemp;
            }
        }

        return menorTemp;
    }

    /**
     * Soma os números impares em um vetor.
     *
     * @param vetNumeros O vetor
     * @return A soma dos números impares
     */
    public static int somaImpares(final int[] vetNumeros) {

        if (vetNumeros.length < 1) {
            throw new IllegalArgumentException(
                    "Deve ser passado um vetor com pelo menos um elemento");
        }

        int soma = 0;

        for (int num : vetNumeros) {
            if (num % 2 != 0) {
                soma += num;
            }
        }

        return soma;
    }

    /**
     * Conta a quantidade de elementos no primeiro vetor que está no segundo
     * vetor.
     *
     * @param vetor1 O primeiro vetor
     * @param vetor2 O segundo vetor
     * @return A quantidade elementos do vetor1 repetido no vetor2
     */
    public static int qntElementosIguais(final int[] vetor1,
            final int[] vetor2) {

        int qntValoresIguais = 0;

        for (int valor1 : vetor1) {
            for (int valor2 : vetor2) {
                if (valor1 == valor2) {
                    qntValoresIguais++;
                    break;
                }
            }
        }

        return qntValoresIguais;
    }

    /**
     * Calcula a quantidade de cada letra em uma sequencia e armazena a
     * quantidade em um vetor em que o indice corresponde com a posição da letra
     * na sequencia.
     *
     * @param sequencia A sequencia de letras.
     * @return O vetor com a quantidade de cada letra.
     * @throws IllegalArgumentException se o argumento for uma sequencia vazia.
     */
    public static int[] qntdLetras(final String sequencia) {

        if (sequencia.length() < 1) {
            throw new IllegalArgumentException(
                    "A sequencia não pode ser vazia.");
        }

        int[] vetorDeQuantidades = new int[sequencia.length()];

        // zerar os valores do vetor de quantidade
        for (int posicao : vetorDeQuantidades) {
            posicao = 0;
        }

        for (int i = 0; i < sequencia.length(); i++) {

            for (int o = i; o < sequencia.length(); o++) {
                if (sequencia.charAt(i) == sequencia.charAt(o)) {
                    vetorDeQuantidades[i]++;
                    if (o != i) {
                        vetorDeQuantidades[o]++;
                    }
                }
            }
        }

        return vetorDeQuantidades;
    }

    /**
     * Encontra a palavra mais frequente em uma frase.
     *
     * @param frase a frase
     * @return a palavra mais frequente
     */
    public static String palavraMaisFrequente(final String frase) {

        if (frase.length() < 1) {
            throw new IllegalArgumentException(
                    "A sequencia não pode ser vazia.");
        }

        String maisFrequente = " ";
        int maiorfrequencia = 0;

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            int frequencia = 0;

            for (String palavra2 : palavras) {

                if (palavra.equals(palavra2)) {
                    frequencia++;

                    if (frequencia > maiorfrequencia) {
                        maiorfrequencia = frequencia;
                        maisFrequente = palavra;
                    }
                }
            }
        }

        return maisFrequente;
    }

    /**
     * Sorteia um milhão de números entre zero e mil e retorna o mais sorteado.
     *
     * @return o numero mais sorteado
     */
    public static int numeroMaisSorteado() {
        final int valorMaxSorteado = 1000;
        final int qntd = 1000000;
        int[] contagem = new int[valorMaxSorteado];

        Random random = new Random();

        for (int i = 0; i < qntd; i++) {
            int numero = random.nextInt(valorMaxSorteado);
            contagem[numero]++;
        }

        /**
         * Procura de acordo com o índice do vetor "contagem", qual foi o número
         * mais rápido.
         */
        int maisFrequente = 0;
        int indiceFrequente = 0;

        for (int indice = 0; indice < valorMaxSorteado; indice++) {
            if (contagem[indice] > maisFrequente) {
                maisFrequente = contagem[indice];
                indiceFrequente = indice;
            }
        }

        return indiceFrequente;
    }

    /**
     * Método construtor privado para que a classe não possa ser instânciada.
     */
    private Algoritmos() {
    }
}
