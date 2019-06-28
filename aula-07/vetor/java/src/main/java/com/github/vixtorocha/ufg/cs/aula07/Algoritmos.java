package com.github.vixtorocha.ufg.cs.aula07;

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
     * Soma os números impares em um vetor
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
     * @param vetor1
     * @param vetor2
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
     * @param sequencia
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

//    public static String palavraMaisFrequente(final String string) {
//        String maisFrequente;
//
//        return maisFrequente;
//    }

    /**
     * Método construtor privado para que a classe não possa ser instânciada.
     */
    private Algoritmos() {
    }
}
