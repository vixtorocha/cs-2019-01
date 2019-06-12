package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ProgramaSaidaTest {

    // TODO : Arrumar os tests
    @Test
    void byteCodesIniciamPorCafeBabe() throws IOException {
        assertEquals("CAFEBABE", Saida.imprimeHexadecimal("/dir/a.class"));
    }

    @Test
    void arquiteoJpegIniciaPorOutroMarcador() throws IOException {
        assertNotEquals("CAFEBABE", Saida.imprimeHexadecimal("/dir/cat.jpg"));
    }

}
