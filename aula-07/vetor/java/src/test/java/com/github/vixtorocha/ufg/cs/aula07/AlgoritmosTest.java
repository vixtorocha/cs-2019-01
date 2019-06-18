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
	assertEquals(5, Algoritmos.temperatura(vetor));
    }

    @Test
    public void menorTempNegativa() {
	int vetor[] = {20, -3, 10, 8};
	assertEquals(-3, Algoritmos.temperatura(vetor));
    }

    @Test
    public void tempUnica() {
	int vetor[] = {20};
	assertEquals(20, Algoritmos.temperatura(vetor));
    }

    @Test
    public void tempVazia() {
	int vetor[] = {};
	assertThrows(IllegalArgumentException.class,
		() -> Algoritmos.temperatura(vetor));
    }
}
