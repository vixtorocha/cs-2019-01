package com.github.vixtorocha.ufg.cs.aula08;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class Arquivo {

    /*
     * Checa se um arquivo é jpeg
     */
    public static boolean checaPNG(final String caminho) throws IOException {

        final int primeiroByte = 0xffd8ffe0;

        final FileInputStream fis = new FileInputStream(caminho);
        final DataInputStream dis = new DataInputStream(fis);

        final int valor = dis.readInt();
        dis.close();

        System.out.println(valor);

        if (valor == primeiroByte) {
            return true;
        }

        return false;
    }

    private Arquivo() {

    }

}
