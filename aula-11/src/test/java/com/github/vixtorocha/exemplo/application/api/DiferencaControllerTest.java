package com.github.vixtorocha.exemplo.application.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DiferencaControllerTest {

    @Test
    void dataStringParaLocalDate() {
        LocalDate data = LocalDate.of(2019, 07, 9);
        assertEquals(data,
                DiferencaController.localDateFromString("09-07-2019"));
    }

    @Test
    void dataStringNull() {
        assertNull(DiferencaController.localDateFromString(" "));
    }

}
