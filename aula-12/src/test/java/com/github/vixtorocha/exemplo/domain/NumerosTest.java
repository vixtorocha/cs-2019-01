package com.github.vixtorocha.exemplo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class NumerosTest {

    @Test
    void Um() {
        assertEquals("Um", Numeros.getExtenso(1));
    }

    @Test
    void Dez() {
        assertEquals("Dez", Numeros.getExtenso(10));
    }

    @Test
    void Doze() {
        assertEquals("Doze", Numeros.getExtenso(12));
    }

    @Test
    void Trinta() {
        assertEquals("Vinte", Numeros.getExtenso(20));
    }

    @Test
    void TrintaEUm() {
        assertEquals("Trinta e Um", Numeros.getExtenso(31));
    }

    @Test
    void Cem() {
        assertEquals("Cem", Numeros.getExtenso(100));
    }

    @Test
    void Duzentos() {
        assertEquals("Duzentos", Numeros.getExtenso(200));
    }

    @Test
    void Mil() {
        assertEquals("Mil", Numeros.getExtenso(1000));
    }

    @Test
    void testaOrdem() {
        assertEquals("Dois Mil", Numeros.getExtenso(2000));
    }

    @Test
    void doisMilEUm() {
        assertEquals("Dois Mil e Um", Numeros.getExtenso(2001));
    }

    @Test
    void doisMilEDoze() {
        assertEquals("Dois Mil e Doze", Numeros.getExtenso(2012));
    }

    @Test
    void doisMilETrinta() {
        assertEquals("Dois Mil e Trinta", Numeros.getExtenso(2030));
    }

    @Test
    void doisMilETrintaEUm() {
        assertEquals("Dois Mil e Trinta e Um", Numeros.getExtenso(2031));
    }

    @Test
    void doisMilECem() {
        assertEquals("Dois Mil e Cem", Numeros.getExtenso(2100));
    }

    @Test
    void doisMilCentoeUm() {
        assertEquals("Dois Mil Cento e Um", Numeros.getExtenso(2101));
    }

    @Test
    void doisMilEDuzentos() {
        assertEquals("Dois Mil e Duzentos", Numeros.getExtenso(2200));
    }

    @Test
    void NoveMilNovecentosENoventaENove() {
        assertEquals("Nove Mil Novecentos e Noventa e Nove",
                Numeros.getExtenso(9999));
    }

    @Test
    void argumentoGrande() {
        assertThrows(IllegalArgumentException.class,
                () -> Numeros.getExtenso(10000));
    }

    @Test
    void argumentoPequeno() {
        assertThrows(IllegalArgumentException.class,
                () -> Numeros.getExtenso(-1));
    }
}
