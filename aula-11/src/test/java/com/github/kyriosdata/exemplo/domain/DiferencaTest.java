package com.github.kyriosdata.exemplo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.github.vixtorocha.exemplo.domain.Diferenca;

public class DiferencaTest {
    LocalDate dataInicial = LocalDate.of(2019, 07, 9);
    LocalDate dataFinal = LocalDate.of(2019, 07, 10);

    Diferenca diferenca = new Diferenca(dataInicial, dataFinal, 1);

    @Test
    void getDataInicial() {
        assertEquals(dataInicial, diferenca.getDataInicial());
    }

    @Test
    void getDataFinal() {
        assertEquals(dataFinal, diferenca.getDataFinal());
    }

    @Test
    void getDiferenca() {
        assertEquals(1, diferenca.getDiferenca());
    }
}
