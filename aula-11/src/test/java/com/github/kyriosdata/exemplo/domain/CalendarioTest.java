package com.github.kyriosdata.exemplo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.github.vixtorocha.exemplo.domain.Calendario;

public class CalendarioTest {

    @Test
    void testeSeteDias() {
        LocalDate dataInicial = LocalDate.of(2019, 07, 8);
        LocalDate dataFinal = LocalDate.of(2019, 07, 1);
        assertEquals(7, Calendario.calculaDiferenca(dataInicial, dataFinal));
    }
}
