package com.github.vixtorocha.ufg.cs.aula01;

/**
 * Implementação de algumas funções matemáticas.
 */
public final class Principal {

    /**
     * Verifica se a Propriedade 3025 é válida para um inteiro.
     *
     * @param n O inteiro.
     * @return Se o número satisfaz a propriedade.
     * @throws IllegalArgumentException Se estiver fora da faixa aceita.
     */
    public static boolean propriedade3025(final int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Argumento fora da faixa.");
        }

        final int i = n / 100;
        final int j = n % 100;

        return (i + j) * (i + j) == n;
    }

    /**
     * Verifica se a propriedade 153 é válida para um inteiro.
     *
     * @param n O inteiro.
     * @return Se o inteiro satisfaz a propriedade
     * @throws IllegalArgumentException Se o número está fora da faixa aceita.
     */
    public static boolean propriedade153(final int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("Argumento fora da faixa.");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

    /**
     * Função que retorna o Dia da Semana.
     *
     * @param dia O dia
     * @param mes O mês
     * @param ano O ano
     * @return O dia da semana. Começando por 0 (Domingo).
     * @throws IllegalArgumentException Se não estiver no formato correto
     */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {
        if (dataInvalida(dia, mes, ano)) {
            throw new IllegalArgumentException("A data é inválida");
        }

        final int d = dia;
        int m = mes;
        int a = ano;

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        final int calculoBissexto = (a / 4) - (a / 100) + (a / 400);
        final int s = d + (2 * m) + (3 * (m + 1)) / 5 + a + calculoBissexto;
        return s % 7;
    }

    /**
     * Verifica se a data é válida.
     *
     * @param d O dia.
     * @param m O mês.
     * @param a O ano.
     * @return Se a data é inválida
     */
    private static boolean dataInvalida(final int d, final int m, final int a) {

        if (a < 1753) {
            return true;
        }

        if (m < 1 || m > 12) {
            return true;
        }

        final int[] numeroMaxDias = new int[] {0, 31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        // Se o ano for bissexto muda o max para fevereiro
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
            numeroMaxDias[2] = 29;
        }

        if (d <= 0 || d > numeroMaxDias[m]) {
            return true;
        }

        return false;
    }

    /**
     * Calcula o resto da divisão de um inteiro por outro.
     *
     * @param x O dividendo
     * @param y O divisor
     * @return O resultado da divisão
     * @throws IllegalArgumentException Se o divisor for menor que zero ou se o
     *                                  dividendo for menor ou igual a 0.
     */
    public static int mod(final int x, final int y) {
        if (x <= 0) {
            throw new IllegalArgumentException(
                    "O primeiro argumento deve ser maior que zero");
        }
        if (y <= 0) {
            throw new IllegalArgumentException(
                    "O segundo argumento deve ser maior ou igual a zero.");
        }

        int s = x;

        while (s >= y) {
            s -= y;
        }

        return s;
    }

    /**
     * Realiza a soma dos primeiros números naturais, de 1 a n.
     *
     * @param n O inteiro
     * @return O valor da soma dos naturais até n.
     * @throws IllegalArgumentException se O número for menor que 1.
     */
    public static int somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "O número deve ser maior que 1.");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    /**
     * Retorna o fatorial de um número inteiro.
     *
     * @param n O inteiro
     * @return O fatorial
     * @throws IllegalArgumentException se i inteiro não for maior que 1.
     */
    public static int fatorial(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "O parâmetro deve ser maior ou igual a 1");
        }

        int i = 2;
        int f = 1;

        while (n >= i) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    /**
     * Produto de dois inteiros usando somas.
     *
     * @param a Um inteiro
     * @param b Um inteiro
     * @return O produto dos dois inteiros
     * @throws IllegalArgumentException se um dos dois inteiros forem menor que
     *                                  1.
     */
    public static int produto(final int a, final int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Ambos os valores precisam ser maior ou igual a zero.");
        }

        int i, s;
        int totalParcelas = a;
        int parecela = b;

        if (b < a) {
            totalParcelas = b;
            parecela = a;
        }

        i = 1;
        s = 0;

        while (i <= totalParcelas) {
            s = s + parecela;
            i = i + 1;
        }

        return s;
    }

    /**
     * Faz um calculo de potência usando somas.
     *
     * @param x A base
     * @param y A potência
     * @return O resultado
     * @throws IllegalArgumentException se um dos dois argumentos for menor que
     *                                  1.
     */
    public static int potencia(final int x, final int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException(
                    "Ambos os valores precisam ser maiores ou iguals a 0");
        }

        int potencia = 1;
        int i = 1;

        while (y >= i) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    /**
     * Calcula o valor de pi com uma precisão de n.
     *
     * @param n A precisão
     * @return O valor de pi obtido
     * @throws IllegalArgumentException se a precisão for menor que 1.
     */
    public static float pi(final float n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "O argumento deve ser maior ou igual a 1.");
        }

        float i = 1;
        float s = -1;
        float d = -1;
        float p = 0;

        while (n >= i) {
            d = d + 2;
            s = -1 * s;
            p = p + (4 * s) / d;
            i = i + 1;
        }

        return p;
    }

    /**
     * Calcula o Logaritmo Natural de um n com precisão de k.
     *
     * @param n O logaritmando
     * @param k A precisão
     * @return O resultado
     * @throws IllegalArgumentException se n for menor que 1 e k menor que 2.
     */
    public static float logaritmoNatural(final float n, final float k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException(
                    "O primeiro argumento ser maior ou igual a 1");
        }
        if (k < 2) {
            throw new IllegalArgumentException(
                    "O segundo argumento deve ser maior ou igual a 2.");
        }
        float i = 2;
        float e = 1 + n;
        float numerador = n;
        float denominador = 1;

        while (k >= i) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }

    /**
     * Calcula a razão áurea usando uma sequência.
     *
     * @param x O primeiro termo da sequência
     * @param y O segundo termo
     * @param k A precisão
     * @return A razão aurea.
     * @throws IllegalArgumentException se x for menor que 0, y menor ou igual
     *                                  que x, ou se k for menor ou igual a
     *                                  zero.
     */
    public static float razaoAurea(final float x, final float y,
            final float k) {
        if (x < 0 || y <= x || k <= 0) {
            throw new IllegalArgumentException(
                    "x deve ser >= 0, y > x e k > 0");
        }

        float c = y;
        float a = x;
        float i = 1;
        float t;

        while (k >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }

    /**
     * Checa se um inteiro é um quadrado perfeito.
     *
     * @param n O inteiro
     * @return True se for um quadrado perfeito.
     * @throws IllegalArgumentException Se o número for menor que 1.
     */
    public static boolean quadradoPerfeito(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "O número deve ser igual ou maior que 1.");
        }

        int i = 1;
        int s = 1;

        while (n > s) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }

    /**
     * Calcula a raiz quadrada de um número.
     *
     * @param n O número.
     * @param j A precisão do cálculo.
     * @return A raiz quadrada.
     * @throws IllegalArgumentException se o número for menor que zero.
     */
    public static float raiz(final float n, final float j) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Para calcular a raiz, n deve ser maior que 0");
        }

        float r = 1;
        float i = j;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    /**
     * Checa se um inteiro é primo.
     *
     * @param n O inteiro
     * @return True se ele for primo
     * @throws IllegalArgumentException se o argumento for menor ou igual a 1.
     */
    public static boolean primo(final int n) {
        if (n <= 1) {
            throw new IllegalArgumentException(
                    "O argumento deve ser maior que 1.");
        }

        int i = 2;

        while (n > i) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    /**
     * Crivo de Erastóstenes.
     *
     * @param a Um vetor de zeros com o tamanho do número a ser checado
     * @return Um vetor com o resultado.
     * @throws IllegalArgumentException se o tamanho do vetor for menor ou igual
     *                                  a 1.
     * @throws IllegalArgumentException Se o vetor não estiver zerado.
     */
    public static int[] crivoEratostenes(final int[] a) {
        if (a.length < 1) {
            throw new IllegalArgumentException(
                    "O tamanho da Array deve ser maior que 1.");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException(
                        "A array deve estar zerada.");
            }
        }

        int i = 2;
        final int limite = (int) Math.floor(Math.sqrt(a.length));
        int multiplo;

        while (i <= limite) {
            multiplo = i + i;
            while (multiplo < a.length) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
            i = i + 1;
        }

        return a;
    }

    /**
     * Máximo divisor comum de dois inteiros.
     *
     * @param a O primeiro número.
     * @param b O segundo número
     * @return O máximo divisor.
     * @throws IllegalArgumentException Se o segundo argumento for zero ou
     *                                  menor, ou se o primeiro argumento for
     *                                  menor que o segundo.
     */
    public static int mdc(final int a, final int b) {
        if (a < b || b <= 0) {
            throw new IllegalArgumentException("B deve ser > 0 e a >= b");
        }

        int numero1 = a;
        int numero2 = b;
        int m;

        while (numero2 > 0) {
            m = numero1 % numero2;
            numero1 = numero2;
            numero2 = m;
        }

        return numero1;
    }

    /**
     * Máximo divisor comum de dois inteiros.
     *
     * @param a O primeiro número.
     * @param b O segundo número
     * @return O máximo divisor.
     * @throws IllegalArgumentException Se o segundo argumento for zero ou
     *                                  menor, ou se o primeiro argumento for
     *                                  menor que o segundo.
     */
    public static int mdc2(final int a, final int b) {
        if (a < b || b <= 0) {
            throw new IllegalArgumentException("B deve ser > 0 e a >= b");
        }

        int numero1 = a;
        int numero2 = b;

        while (numero1 != numero2) {
            if (numero1 > numero2) {
                numero1 = numero1 - numero2;
            } else {
                numero2 = numero2 - numero1;
            }
        }

        return numero1;
    }

    /**
     * Regra de Horner para avaliação de um polinômio.
     *
     * @param x A constante do polinômio.
     * @param g O tamanho.
     * @param a O vetor com o valor 'a' de cada termo.
     * @return O resultado.
     * @throws IllegalArgumentException Se g for menor que 1.
     */
    public static int horner(final int x, final int g, final int[] a) {
        if (g < 1) {
            throw new IllegalArgumentException(
                    "g deve ser maior ou igual a 1.");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    /**
     * Obtêm um número da sequência de fibonacci.
     *
     * @param n A posição do número
     * @return O número
     * @throws IllegalArgumentException se o argumento for menor que n.
     */
    public static int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "N deve ser maior ou igual a 0.");
        }

        int a = 0;
        int c = 1;
        int i, t;

        if (n == 0 || n == 1) {
            return n;
        }

        i = 2;

        while (n >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    /**
     * Transforma o cpf de String para Vetor.
     *
     * @param d o cpf como string.
     * @return o cpf como vetor
     */
    public static int[] cpfStringToArray(final String d) {
        final int[] cpf = new int[11];

        for (int i = 0; i < d.length(); i++) {
            cpf[i] = Character.getNumericValue(d.charAt(i));
        }

        return cpf;
    }

    /**
     * Checa a validade de um CPF.
     *
     * @param cpf O cpf
     * @return Se é válido
     * @throws IllegalArgumentException Se a string não tiver 11 casas.
     */
    public static boolean cpf(final String cpf) {

        if (cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);

        final int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4]
                + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
        final int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5]
                + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];

        final int dj = (j % 11) % 10;
        final int dk = (k % 11) % 10;

        return (dj == d[9] && dk == d[10]);

    }

    /**
     * Checa a validade de um CPF.
     *
     * @param cpf O cpf
     * @return Se é válido
     * @throws IllegalArgumentException Se a string não tiver 11 casas.
     */
    public static boolean cpf2(final String cpf) {

        // Checar se o vetor d tem 11 casas
        if (cpf.length() != 11) {
            throw new IllegalArgumentException(
                    "O CPF deve ser uma string que contem 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);

        int c = 7;
        int p = d[8];
        int s = d[8];

        while (c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        final int j = (s % 11) % 10;
        final int k = ((s - p + 9 * d[9]) % 11) % 10;

        return (j == d[9] && k == d[10]);

    }

    /**
     * Método construtor privado para que a classe não possa ser instânciada.
     */
    private Principal() {

    }

}
