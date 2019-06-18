package com.github.vixtorocha.ufg.cs.aula07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Testes para os algoritmos implementados.
 */
public class AlgoritmosTest {

    /**
     * Testes de temperatura.
     */
    @Test
    public void menorTempEh5() {
	int vetor[] = {20, 5, 10, 8};
	assertEquals(5, Algoritmos.menorTemperatura(vetor));
    }

    @Test
    public void menorTempNegativa() {
	int vetor[] = {20, -3, 10, 8};
	assertEquals(-3, Algoritmos.menorTemperatura(vetor));
    }

    @Test
    public void tempUnica() {
	int vetor[] = {20};
	assertEquals(20, Algoritmos.menorTemperatura(vetor));
    }

    @Test
    public void tempVazia() {
	int vetor[] = {};
	assertThrows(IllegalArgumentException.class,
		() -> Algoritmos.menorTemperatura(vetor));
    }

    /**
     * Testes para Algoritmos.somaImpares
     */
    @Test
    public void somaCorreta() {
	int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8};
	assertEquals(16, Algoritmos.somaImpares(vetor));
    }

    @Test
    public void vetorVazio() {
	int vetor[] = {};
	assertThrows(IllegalArgumentException.class,
		() -> Algoritmos.somaImpares(vetor));
    }
}
