package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ProgramaSaidaTest {

    @Test
    void byteCodesIniciamPorCafeBabe() throws IOException {
        String[] path = {"src/test/resources/Saida.class"};
        assertTrue(ProgramaSaida.main(path));
    }

}
