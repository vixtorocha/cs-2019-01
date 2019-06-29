package com.github.vixtorocha.ufg.cs.aula01;

import java.io.IOException;

public class ProgramaSaida {

    public static void main(final String[] args) throws IOException {

        System.out.println(Saida.imprimeHexadecimal(args[0]));

    }

    /**
     * Construtor privado para cobertura
     */
    private ProgramaSaida() {
    }

}
