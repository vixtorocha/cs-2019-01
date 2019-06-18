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
     * Método construtor privado para que a classe não possa ser instânciada.
     */
    private Algoritmos() {
    }
}
