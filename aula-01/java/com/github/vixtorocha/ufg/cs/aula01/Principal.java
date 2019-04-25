package com.github.vixtorocha.ufg.cs.aula01;

import java.lang.*;

public class Principal {

    public static void main(String[] args) {
        // função main usada para testar as funções
        System.out.println("Chame uma função aqui");
    }

    /**
     * Verifica se o argumento fornecido é um número que satisfaz a
     * "Propriedade 3025".
     *
     * @param n Número que possivelmente satisfaz a propriedade.
     * @return {@code true} se e somente se o argumento fornecido satisfaz a
     * "propriedade 3025".
     * @throws IllegalArgumentException Se o argumento fornecido não está na
     *                                  faixa permitida.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
        }

        int i = n / 100;
        int j = n % 100;

        return (i + j) * (i + j) == n;
    }

    // 2. Função que verifica se a propriedade 153 é verdade para um inteiro.
    public static boolean Propriedade153(final int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

    // 3. Função que retorna o dia da semana. Começando por 0, que ´se
    // segunda-feira.
    public static int DiaDaSemana(int d, int m, int a) {
        if (dataInvalida(d, m, a)) {
            throw new IllegalArgumentException("a data não está no formato correto");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + (2 * m) + (3 * (m + 1)) / 5 + a + (a / 4) - (a / 100) + (a / 400);
        return s % 7;
    }

    private static boolean dataInvalida(int d, int m, int a) {
        // FIXME retorna true para 31/04/2019
        return d < 1 || d > 31 || m < 1 || m > 12 || a < 1753;
    }

    // 4 Calcula o resto da divisão de X por Y.
    public static int Mod(int x, int y) {
        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException(
                    "O primeiro valor deve ser maior que zero e o segundo "
                            + "deve ser maior ou igual a zero.");
        }

        int s = x;

        while (s >= y) {
            s -= y;
        }

        return s;
    }

    // 5. Realiza a soma dos primeiros número naturais, de 1 até n.
    public static int SomaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O número deve ser um inteiro positivo maior que 0.");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s += i;
            i += 1;
        }

        return s;
    }

    // 6. Retorna o Fatorial de um número n
    public static int Fatorial(int n) {
        if (!(n >= 1)) {
            throw new IllegalArgumentException("O parâmetro deve ser maior ou igual a 1");
        }

        int i = 2;
        int f = 1;

        while (n >= i) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    // 7. Produto de inteiros usando somas
    public static int Produto(int a, int b) {
        if (!(a >= 0 || b >= 0)) {
            throw new IllegalArgumentException("Ambos os valores precisam ser maior ou igual a zero.");
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

    // 8. Potências Usando Somas
    public static int Potencia(int x, int y) {
        if (!(x >= 0 || y >= 0)) {
            throw new IllegalArgumentException("Ambos os valores precisam ser maiores ou iguals a 0");
        }

        int potencia = 1;
        int i = 1;

        while (y >= i) {
            potencia = Produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    // 9. Valor de pi com n termos somatórios
    public static float Pi(float n) {
        if (!(n >= 1)) {
            throw new IllegalArgumentException(
                    "Para calcular o valor de pi, N deve ter um input de maior ou igual a 1.");
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

    // 10. Logaritmo Natural
    public static float LogaritmoNatural(float n, float k) {
        if (!(n >= 1 || k >= 2)) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 1 e k deve ser maior ou igual a 2.");
        }
        float i = 2;
        float e = 1 + n;
        float numerador = n;
        float denominador = 1;

        while (k >= 1) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }

    // 11. Razão áurea. quanto maior o k maior a precisão.
    public static float RazaoAurea(float x, float y, float k) {
        if (!(x >= 0 || y > x || k > 0)) {
            throw new IllegalArgumentException("x deve ser >= 0, y > x e k > 0");
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

    // 12. Checa se um número é um quadrado perfeito;
    public static boolean QuadradoPerfeito(int n) {
        if (!(n >= 1)) {
            throw new IllegalArgumentException("O número deve ser igual ou maior que 1.");
        }

        int i = 1;
        int s = 1;

        while (n > s) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }

    // 13. Calcula a raiz de um número 'n' com 'i' de precisão
    public static float Raiz(float n, float i) {
        if (!(n > 0)) {
            throw new IllegalArgumentException("Para calcular a raiz, n deve ser maior que 0");
        }

        float r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    // 14. Numero Primo, checa se um número é primo
    public static boolean Primo(int n) {
        if (!(n > 1)) {
            throw new IllegalArgumentException();
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

    // 15. Crivo de Eratóstenes
    public static int[] CrivoEratostenes(int a[]) {
        if (a.length > 1) {
            throw new IllegalArgumentException("O tamanho da Array deve ser maior que 1.");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("A array deve estar zerada.");
            }
        }

        int i = 2;
        int limite = (int) Math.floor(Math.sqrt(a.length));
        int multiplo;

        while (i <= limite) {
            if (a[i] == 0) {
                multiplo = i + i;
                while (multiplo <= a.length) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        return a;
    }

    // 16. Maior Divisor Comum.
    public static int MDC(int a, int b) {
        if (!(a >= b || b > 0)) {
            throw new IllegalArgumentException("B deve ser > 0 e a >= b");
        }

        int m;

        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    // 17. Outro método de MDC.
    public static int MDC2(int a, int b) {
        if (!(a >= b || b > 0)) {
            throw new IllegalArgumentException("B deve ser > 0 e a >= b");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    // 18. Regra de Horner para avaliação de um polinômio
    public static int Horner(int x, int g, int a[]) {
        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    // 19. Fibonacci, retorna o n-ésimo número da sequência.
    public static int Fibonacci(int n) {
        if (!(n >= 0)) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 0.");
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

    // 20. Checa CPF.

    public static boolean CPF(String d) {

        if (!(d.length() == 11)) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos");
        }

        int j = Character.getNumericValue(d.charAt(0)) + 2 * Character.getNumericValue(d.charAt(1))
                + 3 * Character.getNumericValue(d.charAt(2)) + 4 * Character.getNumericValue(d.charAt(3))
                + 5 * Character.getNumericValue(d.charAt(4)) + 6 * Character.getNumericValue(d.charAt(5))
                + 7 * Character.getNumericValue(d.charAt(6)) + 8 * Character.getNumericValue(d.charAt(7))
                + 9 * Character.getNumericValue(d.charAt(8));

        System.out.println(j);
        int k = Character.getNumericValue(d.charAt(1)) + 2 * Character.getNumericValue(d.charAt(2))
                + 3 * Character.getNumericValue(d.charAt(3)) + 4 * Character.getNumericValue(d.charAt(4))
                + 5 * Character.getNumericValue(d.charAt(5)) + 6 * Character.getNumericValue(d.charAt(6))
                + 7 * Character.getNumericValue(d.charAt(7)) + 8 * Character.getNumericValue(d.charAt(8))
                + 9 * Character.getNumericValue(d.charAt(9));
        System.out.println(k);

        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;

        return dj == Character.getNumericValue(d.charAt(9)) && dk == Character.getNumericValue(d.charAt(10));

    }

    // 21. Outro método pra checar o CPF
    public static boolean CPF2(String d) {

        // Checar se o vetor d tem 11 casas
        if (d.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ser uma string que contem 11 dígitos");
        }

        int c = 7;
        int p = Character.getNumericValue(d.charAt(8));
        int s = Character.getNumericValue(d.charAt(8));

        while (c >= 0) {
            p = p + Character.getNumericValue(d.charAt(c));
            s = s + p;
            c = c - 1;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + 9 * Character.getNumericValue(d.charAt(9))) % 11) % 10;

        return (j == Character.getNumericValue(d.charAt(9)) && k == Character.getNumericValue(d.charAt(10)));

    }

}