package com.github.vixtorocha.ufg.cs.aula08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ArquivoTest {

    @Test
    void byteCodesIniciamPorCafeBabe() throws IOException {
        assertEquals("cafebabe", Arquivo
                .encontrePalavra("src/test/resources/poema.txt", "pedra"));
    }

}
