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
    public static int temperatura(final int[] vetTemp) {

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
     * Método construtor privado para que a classe não possa ser instânciada.
     */
    private Algoritmos() {
    }
}
