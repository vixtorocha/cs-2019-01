package com.github.vixtorocha.ufg.cs.aula08;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arquivo {

    public static String encontrePalavra(final String endereco,
            final String busca) throws IOException {

        final Charset padrao = Charset.forName("UTF-8");
        final BufferedReader br = Files.newBufferedReader(Paths.get(endereco),
                padrao);
        final StringBuilder sb = new StringBuilder();
        String linhas;
        int numLinha = 1;
        int ocorrencia = 0;

        linhas = br.readLine();
        while (linhas != null) {
            final int numColuna = linhas.indexOf(busca);
            if (numColuna != -1) {
                sb.append(String.format("L%d C%d: %s%n", numLinha, numColuna,
                        linhas));
            }
            numLinha++;
            ocorrencia = ocorrencia + ocorrencias(busca, linhas);
            linhas = br.readLine();
        }
        br.close();

        System.out.println(String.format("Encontradas: %d%n%s", ocorrencia,
                sb.toString()));
        return String.format("Encontradas: %d%n%s", ocorrencia, sb.toString());
    }

    public static int ocorrencias(final String busca, final String texto) {
        final Pattern p = Pattern.compile(busca);
        final Matcher m = p.matcher(texto);

        int ocorrencias = 0;
        while (m.find()) {
            ocorrencias++;
        }

        return ocorrencias;
    }
}
