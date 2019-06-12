package com.github.vixtorocha.ufg.cs.aula01;

import java.io.IOException;

public class ProgramaSaida {

    public static void main(final String[] args) {
        try {
            System.out.println(Saida.imprimeHexadecimal(args[0]));
        } catch (final IOException e) {
            e.printStackTrace();
        }

    }

}
