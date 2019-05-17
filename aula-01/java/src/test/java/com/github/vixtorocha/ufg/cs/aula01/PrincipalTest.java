package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PrincipalTest {

    /**
     * Testes pra a função propriedade3025.
     */
    @Test
    public void propriedade3025isTrue() {
        assertEquals(true, Principal.propriedade3025(3025));
    }

    @Test
    public void propriedade3025isfalse() {
        assertEquals(false, Principal.propriedade3025(3024));
    }

    @Test
    public void propriedade3025Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Principal.propriedade3025(-1));
    }

    @Test
    public void propriedade3025Grande() {
        assertThrows(IllegalArgumentException.class, () -> Principal.propriedade3025(10000));
    }

    /**
     * Testes para a propriedade153
     */
    @Test
    public void propriedade153Verdadeiro() {
        assertEquals(true, Principal.propriedade153(153));
    }

    @Test
    public void propriedade153Falso() {
        assertEquals(false, Principal.propriedade153(154));
    }

    @Test
    public void propriedade153Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Principal.propriedade153(-1));
    }

    @Test
    public void propriedade153Grande() {
        assertThrows(IllegalArgumentException.class, () -> Principal.propriedade153(1000));
    }

    /**
     * Testes para a função diaDaSemana
     */
    @Test
    public void diaDaSemanaCasoComum() {
        assertEquals(1, Principal.diaDaSemana(14, 5, 2019));
    }

    @Test
    public void diaDaSemanaJaneiro() {
        assertEquals(1, Principal.diaDaSemana(1, 1, 2019));
    }

    @Test
    public void diaDaSemanaAnoBissextoCorreto() {
        assertEquals(5, Principal.diaDaSemana(29, 2, 2020));
    }

    @Test
    public void diaDaSemanaAnoBissextoCorretoPor400() {
        assertEquals(1, Principal.diaDaSemana(29, 2, 2000));
    }

    @Test
    public void diaDaSemanaAnoBissextoIncorreto() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(29, 2, 2019));
    }

    @Test
    public void diaDaSemanaAnoBissextoIncorretoPor400() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(29, 2, 1900));
    }

    @Test
    public void diaDaSemanaAnoForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(1, 1, 1752));
    }

    @Test
    public void diaDaSemanaMesPequenoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(1, -1, 2019));
    }

    @Test
    public void diaDaSemanaMesGrandeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(1, 13, 2019));
    }

    @Test
    public void diaDaSemanaDiaForadaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.diaDaSemana(0, 1, 2019));
    }

    /**
     * Testes para calcular o resto
     */
    @Test
    public void modValido() {
        assertEquals(1, Principal.mod(10, 3));
    }

    @Test
    public void modYForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.mod(-1, 4));
    }

    @Test
    public void modXIgualAZero() {
        assertThrows(IllegalArgumentException.class, () -> Principal.mod(4, 0));
    }

    /**
     * Testes para somaNaturais
     */
    @Test
    public void somaNaturalCasoComum() {
        assertEquals(15, Principal.somaNaturais(5));
    }

    @Test
    public void somaNaturaisForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.somaNaturais(0));
    }

    /**
     * Testes para Principal.fatorial
     */
    @Test
    public void fatorialCasoComum() {
        assertEquals(120, Principal.fatorial(5));
    }

    @Test
    public void fatorialForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.fatorial(0));
    }

    /**
     * Testes para Principal.fatorial
     */
    @Test
    public void produtoCasoComum() {
        assertEquals(6, Principal.produto(3, 2));
    }

    @Test
    public void produtoAForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.produto(-1, 2));
    }

    @Test
    public void produtoBForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.produto(2, -3));
    }

    /**
     * Testes para Principal.potencia
     */
    @Test
    public void potenciaCasoComum() {
        assertEquals(9, Principal.potencia(3, 2));
    }

    @Test
    public void potenciaXForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.potencia(-1, 2));
    }

    @Test
    public void potenciaYForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.potencia(2, -3));
    }

    /**
     * Testes para Principal.pi
     */
    @Test
    public void piCasoComum() {
        assertEquals(3.3396823, Principal.pi(5), 0.0000009);
    }

    @Test
    public void piPrecisaoForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.pi(0));
    }

    /**
     * Testes para Principal.logaritmoNatural
     */
    @Test
    public void logaritmoNaturalCasoComum() {
        assertEquals(8.5, Principal.logaritmoNatural(3, 2));
    }

    @Test
    public void logaritmoNaturalNForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.logaritmoNatural(0, 2));
    }

    @Test
    public void logaritmoNaturalKForaDaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Principal.logaritmoNatural(3, 1));
    }

    /**
     * Testes para razaoAurea
     */
    @Test
    public void razaoAureaCasoCoum() {
        assertEquals(1.618034, Principal.razaoAurea(1, 2, 20), 0.000001);
    }
}
