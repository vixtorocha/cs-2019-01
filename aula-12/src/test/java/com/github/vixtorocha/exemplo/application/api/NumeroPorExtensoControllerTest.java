package com.github.vixtorocha.exemplo.application.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class NumeroPorExtensoControllerTest {
    @Test
    void retornaNumeroPorExtenso() {
        assertNotNull(NumeroPorExtensoController.numeroPorExtenso(100));
    }
}
