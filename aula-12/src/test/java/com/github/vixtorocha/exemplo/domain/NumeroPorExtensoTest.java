package com.github.vixtorocha.exemplo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumeroPorExtensoTest {
    NumeroPorExtenso numero = new NumeroPorExtenso(12, "Doze");

    @Test
    void getNumeroAbsoluto() {
        assertEquals(12, NumeroPorExtenso.getNumeroArg());
    }

    @Test
    void getNumeroExtenso() {
        assertEquals("Doze", NumeroPorExtenso.getNumeroPorExtenso());
    }
}
