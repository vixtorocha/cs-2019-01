package com.github.vixtorocha.ufg.cs.aula01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Saida {

    /**
     * Retorna os primeiros quatro bytes do arquivo fornecido.
     * <p>
     * Os bytes são fornecidos no formato hexadecimal, letras maiúsculas.
     * </p>
     *
     * @param arquivo Nome do arquivo (path) cujos bytes serão lidos.
     * @return Sequência de 8 caracteres hexadecimais, letras maiúsculas,
     *         correspodentes aos quatro primeiros bytes do arquivo.
     *
     * @throws IOException
     */
    public static String imprimeHexadecimal(final String arquivo)
            throws IOException {
        final FileInputStream fis = new FileInputStream(arquivo);
        final DataInputStream dis = new DataInputStream(fis);

        final int valor = dis.readInt();
        dis.close();

        return Integer.toHexString(valor);
    }

    /**
     * Construtor privado para cobertura
     */
    private Saida() {

    }

}
