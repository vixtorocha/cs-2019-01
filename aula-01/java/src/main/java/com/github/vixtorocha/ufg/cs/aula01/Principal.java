package com.github.vixtorocha.ufg.cs.aula01;

/**
 * Implementação de algumas funções matemáticas.
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(diaDaSemana(10, 5, 2019));
    }

    /**
     * Verifica se a Propriedade 3025 é válida para um inteiro.
     * 
     * @param n O inteiro.
     * @return Se o número satisfaz a propriedade.
     * @throws IllegalArgumentException Se o número estiver fora da faixa aceita.
     */
    public static boolean propriedade3025(final int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
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
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
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
     * @param d O dia
     * @param m O mês
     * @param a O ano
     * @return O dia da semana. Começando por 0 (Domingo).
     * @throws IllegalArgumentException Se a data não estive no formato correto.
     */
    public static int diaDaSemana(final int d, final int m, final int a) {
        if (dataInvalida(d, m, a)) {
            throw new IllegalArgumentException("a data não está no formato correto");
        }

        int dia = d;
        int mes = m;
        int ano = a;

        if (mes == 1 || mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        int s = dia + (2 * mes) + (3 * (mes + 1)) / 5 + ano + (ano / 4) - (ano / 100) + (ano / 400);
        return s % 7;
    }

    /**
     * Verifica se a data é válida
     * 
     * @param d O dia.
     * @param m O mês.
     * @param a O ano.
     * @return Se a data é inválida
     */
    private static boolean dataInvalida(final int d, final int m, final int a) {

        if (m < 1 || m > 12) {
            return false;
        }

        if (d < 1 || d > 31) {
            return false;
        }

        // FIXME mudar a abordagem do switch.
        switch (m) {
        case 2:
            if (d != 28) {
                return false;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if (d != 30) {
                return false;
            }
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            if (d != 31) {
                return false;
            }
            break;
        }

        if (a < 1753) {
            return false;
        }

        return true;
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
        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException(
                    "O primeiro valor deve ser maior que zero e o segundo deve ser maior ou igual a zero.");
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
            throw new IllegalArgumentException("O número deve ser maior que 1.");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    // 6. Retorna o Fatorial de um número n
    public static int fatorial(final int n) {
        if (n < 1) {
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
    public static int produto(final int a, final int b) {
        if (a < 0 && b < 0) {
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
    public static int potencia(final int x, final int y) {
        if (x > 0 || y < 0) {
            throw new IllegalArgumentException("Ambos os valores precisam ser maiores ou iguals a 0");
        }

        int potencia = 1;
        int i = 1;

        while (y >= i) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    // 9. Valor de pi com n termos somatórios
    public static float pi(final float n) {
        if (n > 1) {
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
    public static float logaritmoNatural(final float n, final float k) {
        if (n < 1 || k < 2) {
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
    public static float razaoAurea(final float x, final float y, final float k) {
        if (x < 0 || y <= x || k <= 0) {
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
    public static boolean quadradoPerfeito(final int n) {
        if (n < 1) {
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
    public static float raiz(final float n, final float j) {
        if (n < 0) {
            throw new IllegalArgumentException("Para calcular a raiz, n deve ser maior que 0");
        }

        float r = 1;
        float i = j;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    // 14. Numero Primo, checa se um número é primo
    public static boolean primo(final int n) {
        if (n <= 1) {
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
    public static int[] crivoEratostenes(final int a[]) {
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
    public static int mdc(final int a, final int b) {
        if (a < b || b <= 0) {
            throw new IllegalArgumentException("B deve ser > 0 e a >= b");
        }

        int numero1 = a;
        int numero2 = b;
        int m;

        while (b != 0) {
            m = numero1 % b;
            numero1 = numero2;
            numero2 = m;
        }

        return a;
    }

    // 17. Outro método de MDC.
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

        return a;
    }

    // 18. Regra de Horner para avaliação de um polinômio
    public static int horner(final int x, final int g, final int a[]) {
        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    // 19. Fibonacci, retorna o n-ésimo número da sequência.
    public static int fibonacci(final int n) {
        if (n < 0) {
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
    public static int[] cpfStringToArray(final String d) {
        int[] cpf = new int[11];

        for (int i = 0; i < d.length(); i++) {
            cpf[i] = Character.getNumericValue(d.charAt(i));
        }

        return cpf;
    }

    public static boolean cpf(final String cpf) {

        if (!(cpf.length() == 11)) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos");
        }

        int[] d = cpfStringToArray(cpf);

        final int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
        final int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];

        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;

        return (dj == d[9] && dk == d[10]);

    }

    // 21. Outro método pra checar o CPF
    public static boolean cpf2(final String cpf) {

        // Checar se o vetor d tem 11 casas
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ser uma string que contem 11 dígitos");
        }

        int[] d = cpfStringToArray(cpf);

        int c = 7;
        int p = d[8];
        int s = d[8];

        while (c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + 9 * d[9]) % 11) % 10;

        return (j == d[9] && k == d[10]);

    }

}