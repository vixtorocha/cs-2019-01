package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class SaidaTest {

    @Test
    void byteCodesIniciamPorCafeBabe() throws IOException {
        assertEquals("cafebabe",
                Saida.imprimeHexadecimal("src/test/resources/Saida.class"));
    }

    @Test
    void marcadorTXT() throws IOException {
        assertEquals("73757274",
                Saida.imprimeHexadecimal("src/test/resources/teste.txt"));
    }

    @Test
    void argumentoVazio() throws IOException {
        assertEquals("73757274",
                Saida.imprimeHexadecimal("src/test/resources/teste.txt"));
    }

}
