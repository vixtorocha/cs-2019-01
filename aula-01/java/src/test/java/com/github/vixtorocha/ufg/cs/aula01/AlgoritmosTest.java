package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    /**
     * Testes pra a função propriedade3025.
     */
    @Test
    public void propriedade3025isTrue() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

    @Test
    public void propriedade3025isfalse() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

    @Test
    public void propriedade3025Pequeno() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade3025(-1));
    }

    @Test
    public void propriedade3025Grande() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade3025(10000));
    }

    /**
     * Testes para a propriedade153
     */
    @Test
    public void propriedade153Verdadeiro() {
        assertEquals(true, Algoritmos.propriedade153(153));
    }

    @Test
    public void propriedade153Falso() {
        assertEquals(false, Algoritmos.propriedade153(154));
    }

    @Test
    public void propriedade153Pequeno() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade153(-1));
    }

    @Test
    public void propriedade153Grande() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade153(1000));
    }

    /**
     * Testes para a função diaDaSemana
     */
    @Test
    public void diaDaSemanaCasoComum() {
        assertEquals(1, Algoritmos.diaDaSemana(14, 5, 2019));
    }

    @Test
    public void diaDaSemanaJaneiro() {
        assertEquals(1, Algoritmos.diaDaSemana(1, 1, 2019));
    }

    @Test
    public void diaDaSemanaAnoBissextoCorreto() {
        assertEquals(5, Algoritmos.diaDaSemana(29, 2, 2020));
    }

    @Test
    public void diaDaSemanaAnoBissextoCorretoPor400() {
        assertEquals(1, Algoritmos.diaDaSemana(29, 2, 2000));
    }

    @Test
    public void diaDaSemanaAnoBissextoIncorreto() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(29, 2, 2019));
    }

    @Test
    public void diaDaSemanaAnoBissextoIncorretoPor400() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(29, 2, 1900));
    }

    @Test
    public void diaDaSemanaAnoForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(1, 1, 1752));
    }

    @Test
    public void diaDaSemanaMesPequenoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(1, -1, 2019));
    }

    @Test
    public void diaDaSemanaMesGrandeInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(1, 13, 2019));
    }

    @Test
    public void diaDaSemanaDiaForadaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(0, 1, 2019));
    }

    /**
     * Testes para calcular o resto
     */
    @Test
    public void modValido() {
        assertEquals(1, Algoritmos.mod(10, 3));
    }

    @Test
    public void modYForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mod(-1, 4));
    }

    @Test
    public void modXIgualAZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mod(4, 0));
    }

    /**
     * Testes para somaNaturais
     */
    @Test
    public void somaNaturalCasoComum() {
        assertEquals(15, Algoritmos.somaNaturais(5));
    }

    @Test
    public void somaNaturaisForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.somaNaturais(0));
    }

    /**
     * Testes para Algoritmos.fatorial
     */
    @Test
    public void fatorialCasoComum() {
        assertEquals(120, Algoritmos.fatorial(5));
    }

    @Test
    public void fatorialForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.fatorial(0));
    }

    /**
     * Testes para Algoritmos.fatorial
     */
    @Test
    public void produtoCasoComum() {
        assertEquals(6, Algoritmos.produto(3, 2));
    }

    @Test
    public void produtoAForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.produto(-1, 2));
    }

    @Test
    public void produtoBForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.produto(2, -3));
    }

    /**
     * Testes para Algoritmos.potencia
     */
    @Test
    public void potenciaCasoComum() {
        assertEquals(9, Algoritmos.potencia(3, 2));
    }

    @Test
    public void potenciaXForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.potencia(-1, 2));
    }

    @Test
    public void potenciaYForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.potencia(2, -3));
    }

    /**
     * Testes para Algoritmos.pi
     */
    @Test
    public void piCasoComum() {
        assertEquals(3.3396823, Algoritmos.pi(5), 0.0000009);
    }

    @Test
    public void piPrecisaoForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.pi(0));
    }

    /**
     * Testes para Algoritmos.logaritmoNatural
     */
    @Test
    public void logaritmoNaturalCasoComum() {
        assertEquals(8.5, Algoritmos.logaritmoNatural(3, 2));
    }

    @Test
    public void logaritmoNaturalNForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.logaritmoNatural(0, 2));
    }

    @Test
    public void logaritmoNaturalKForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.logaritmoNatural(3, 1));
    }

    /**
     * Testes para razaoAurea
     */
    @Test
    public void razaoAureaCasoCoum() {
        assertEquals(1.618034, Algoritmos.razaoAurea(1, 2, 20), 0.000001);
    }

    @Test
    public void razaoAureaXForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.razaoAurea(-1, 2, 20));
    }

    @Test
    public void razaoAureaYMenorQueX() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.razaoAurea(4, 2, 20));
    }

    @Test
    public void razaoAureaKForadaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.razaoAurea(1, 2, 0));
    }

    /**
     * Testes para quadradoPerfeito
     */
    @Test
    public void quadradoPerfeitoIsTrue() {
        assertEquals(true, Algoritmos.quadradoPerfeito(9));
    }

    @Test
    public void quadradoPerfeitoIsFalse() {
        assertEquals(false, Algoritmos.quadradoPerfeito(8));
    }

    @Test
    public void quadradoPerfeitoPequeno() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.quadradoPerfeito(-2));
    }

    /**
     * Testes para raiz
     */

    @Test
    public void raizCasoClassico() {
        assertEquals(2, Algoritmos.raiz(4, 25));
    }

    @Test
    public void raizPequena() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.raiz(-2, 25));
    }

    /**
     * Testes para primo
     */

    @Test
    public void primoCasoClassico() {
        assertEquals(true, Algoritmos.primo(7));
    }

    @Test
    public void primoFalso() {
        assertEquals(false, Algoritmos.primo(4));
    }

    @Test
    public void primoNForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(1));
    }

    /**
     * Testes para o Crivo
     */
    @Test
    public void crivoEratostenes() {
        final int correto[] = {0, 0, 0, 0, 1, 0, 1};
        final int vetor[] = {0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(correto, Algoritmos.crivoEratostenes(vetor));
    }

    @Test
    public void crivoArrayNaoZerada() {
        final int vetor[] = {0, 1, 0, 0, 1, 0, 1};
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.crivoEratostenes(vetor));
    }

    @Test
    public void crivoTamanhoInvalido() {
        final int vetor[] = {};
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.crivoEratostenes(vetor));
    }

    /**
     * Testes para mdc
     */
    @Test
    public void mdcCasoComum() {
        assertEquals(3, Algoritmos.mdc(9, 6));
    }

    @Test
    public void mdcBForaDeFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mdc(9, -1));
    }

    @Test
    public void mdcAMenorQueB() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mdc(4, 8));
    }

    /**
     * Testes para mdc2
     */
    @Test
    public void mdc2CasoComum() {
        assertEquals(3, Algoritmos.mdc2(9, 6));
    }

    @Test
    public void mdc2BForaDeFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mdc2(9, -1));
    }

    @Test
    public void mdc2AMenorQueB() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.mdc2(4, 8));
    }

    /**
     * Teste para o horner
     */
    @Test
    public void Horner() {
        final int vetor[] = {0, 1, 2};
        assertEquals(3, Algoritmos.horner(1, 2, vetor));
    }

    @Test
    public void HornerGForaDaFaixa() {
        final int vetor[] = {0, 1, 2};
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.horner(1, -2, vetor));
    }

    /**
     * Testes para fibonacci
     */

    @Test
    public void fibonacciCasoComum() {
        assertEquals(3, Algoritmos.fibonacci(4));
    }

    @Test
    public void fibonacciUm() {
        assertEquals(1, Algoritmos.fibonacci(1));
    }

    @Test
    public void fibonacciZero() {
        assertEquals(0, Algoritmos.fibonacci(0));
    }

    @Test
    public void fibonacciForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.fibonacci(-4));
    }

    /**
     * Teste para cpf
     */
    @Test
    public void cpfCasoComum() {
        assertTrue(Algoritmos.cpf("85813526005"));
    }

    @Test
    public void cpfCasoFalso() {
        assertFalse(Algoritmos.cpf("85813526010"));
    }

    @Test
    public void cpfCasoFalso2() {
        assertFalse(Algoritmos.cpf("85813526006"));
    }

    @Test
    public void cpfForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.cpf("8581352601"));
    }

    /**
     * Teste para cpf2
     */
    @Test
    public void cpf2CasoComum() {
        assertTrue(Algoritmos.cpf2("85813526005"));
    }

    @Test
    public void cpf2CasoFalso() {
        assertFalse(Algoritmos.cpf2("85813526010"));
    }

    @Test
    public void cpf2CasoFalso2() {
        assertFalse(Algoritmos.cpf2("85813526006"));
    }

    @Test
    public void cpf2ForaDaFaixa() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.cpf2("8581352601"));
    }
}