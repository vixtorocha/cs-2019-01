package com.github.vixtorocha.exemplo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumerosTest {

    @Test
    void testaOrdem() {
        assertEquals("Dois Mil", Numeros.getExtenso(2000));
    }
}
