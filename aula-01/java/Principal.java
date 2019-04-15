public class Principal {

    public static void main(String[] args) {
        System.out.println(Mod(5, 3));
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
}