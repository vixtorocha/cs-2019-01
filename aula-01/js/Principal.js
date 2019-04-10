function Propriedade3025(n) {
    let i, j;

    //A função Math.truc() do javascript se livra do decimal e preserva somente a parte inteira.
    i = Math.trunc(n / 100);
    j = Math.trunc(n % 100);

    return (i + j) * (i + j) == n;
}

function Propriedade153(n) {
    c = Math.trunc(n / 100);
    du = Math.trunc(n % 100);
    d = Math.trunc(du / 10);
    u = Math.trunc(du % 10);

    return (c * c * c) + (d * d * d) + (u * u * u) == n;
}

function DiaDaSemana(d, m, a) {
    if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && a > 1753) {

        let s;

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        s = d + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400);

        return (s % 7);

    }

    return false;
}