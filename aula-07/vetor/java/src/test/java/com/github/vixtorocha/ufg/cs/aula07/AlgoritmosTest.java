package com.github.vixtorocha.ufg.cs.aula07;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    /**
     * Testes para Algoritmo.qntElementosIguais
     */
    @Test
    public void doisElementosRepetidos() {
        int vetor1[] = {1, 2, 3, 4};
        int vetor2[] = {1, 1, 2, 2};

        assertEquals(2, Algoritmos.qntElementosIguais(vetor1, vetor2));
    }

    @Test
    public void elementoVazio() {
        int vetor[] = {};
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.somaImpares(vetor));
    }

    /**
     * Testes para Algoritmo.qntdLetras
     */
    @Test
    public void qntdLetrasFuncionamentoCorreto() {
        int[] resultadoEsperado = {5, 5, 1, 5, 3, 5, 3, 3, 5};
        assertArrayEquals(resultadoEsperado,
                Algoritmos.qntdLetras("AABACACCA"));
    }

    @Test
    public void sequenciaVazia() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.qntdLetras(""));
    }

    /**
     * Testes para Algoritmo.palavraMaisFrequente
     */
    @Test
    public void palavraMaisFrequenteFuncionamentoCorreto() {
        assertEquals("como", Algoritmos
                .palavraMaisFrequente("Alo como vai como vai vcs como"));
    }

    @Test
    public void fraseVazia() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.palavraMaisFrequente(""));
    }

    /**
     * Testes para o Algoritmo.numeroMaisSorteado
     */
    @Test
    public void testaRange() {
        int num = Algoritmos.numeroMaisSorteado();
        assertTrue(num > 0 && num < 1000);
    }
}
