public class Principal {

    public static void main(String[] args) {
        System.out.println(Pi(50));
    }

    // 1. Função que verifica se a propriedade 3025 é verdade para um número.
    public static boolean Propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
        }

        int i = n / 100;
        int j = n % 100;

        return (i + j) * (i + j) == n;
    }

    // 2. Função que verifica se a propriedade 153 é verdade para um inteiro.
    public static boolean Propriedade153(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 9999");
        }

        int c = n / 100;
        int du = n % 100;
        int d = du / 10;
        int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

    // 3. Função que retorna o dia da semana. Começando por 0, que ´se
    // segunda-feira.
    public static int DiaDaSemana(int d, int m, int a) {
        if (d < 1 || d > 31 || m < 1 || m > 12 || a < 1753) {
            throw new IllegalArgumentException("a data não está no formato correto");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + (2 * m) + (3 * (m + 1)) / 5 + a + (a / 4) - (a / 100) + (a / 400);
        return s % 7;
    }

    // 4 Calcula o resto da divisão de X por Y.
    public static int Mod(int x, int y) {
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

    // 5. Realiza a soma dos primeiros número naturais, de 1 até n.
    public static int SomaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O número deve ser um inteiro positivo maior que 0.");
        }

        int i = 2;
        int s = 1;

        while (n >= i) {
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

    // 12. Razão áurea. quanto maior o k maior a precisão.
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
}