package com.github.vixtorocha.ufg.cs.aula08;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ArquivoTest {

    @Test
    void byteCodesSaoJPEG() throws IOException {
        assertTrue(Arquivo.checaPNG("src/test/resources/lhamas.jpeg"));
    }

    @Test
    void byteCodesNaoSaoJPEG() throws IOException {
        assertFalse(Arquivo.checaPNG("src/test/resources/gatinho.png"));
    }

}
