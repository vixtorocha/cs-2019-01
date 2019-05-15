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
}
