package com.github.vixtorocha.exemplo.application.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumeroPorExtensoTest {
    NumeroPorExtenso numero = new NumeroPorExtenso(12, "Doze");

    @Test
    void getNumeroAbsoluto() {
        assertEquals(12, numero.getNumeroArg());
    }

    @Test
    void getNumeroExtenso() {
        assertEquals("Doze", numero.getNumeroPorExtenso());
    }
}
