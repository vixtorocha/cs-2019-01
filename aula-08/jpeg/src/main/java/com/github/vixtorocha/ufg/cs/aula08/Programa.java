package com.github.vixtorocha.ufg.cs.aula08;

import java.io.IOException;

public class Programa {

    public static void main(String[] args) throws IOException {

        if (Arquivo.checaPNG(args[0])) {
            System.out.println("O arquivo é um jpeg!");
        } else {
            System.out.println("O arquivo não é um jpeg");
        }
    }

}
