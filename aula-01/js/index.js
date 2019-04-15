console.log(Propriedade3025(3025));

//1. Propriedade 3025.
function Propriedade3025(n) {
    let i, j;

    //A função Math.truc() do javascript se livra do decimal e preserva somente a parte inteira.
    i = parseInt(n / 100);
    j = parseInt(n % 100);

    return (i + j) * (i + j) == n;
}

//2. Propriedade 153
function Propriedade153(n) {
    c = parseInt(n / 100);
    du = parseInt(n % 100);
    d = parseInt(du / 10);
    u = parseInt(du % 10);

    return (c * c * c) + (d * d * d) + (u * u * u) == n;
}

//3. Calcula o dia da semana, começando por 0 (segunda-feira)
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

// 4. Resto da Divisão inteira
function Mod(x, y) {
    if (y >= 0 || x > 0) {

        let s = x;

        while (y <= s) {
            s = s - y;
        }

        return s;

    }

}

//5. Soma dos números naturais até n
function SomaNaturais(n) {
    if (n >= 1) {

        let i = 2;
        let s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;

    }
}

//6. Fatorial de um número n
function Fatorial(n) {
    if (n >= 1) {
        let i = 2;
        let f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}

//7. Produto de inteiros usando soma.
function Produto(a, b) {
    if (a >= 0 && b >= 0) {
        let totalParcelas = a;
        let parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }

        i = 1;
        s = 0;

        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }

        return s;
    }
}

//8. Potências usando soma.
function Potencia(x, y) {
    if (x >= 0 && y >= 0) {
        let potencia = 1;
        let i = 1;

        while (i <= y) {
            potencia = Produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }
}

//9. Calcula o pi, 'n' determina a precisão.
function Pi(n) {
    if (n >= 1) {
        let i = 1;
        let s = -1;
        let d = -1;
        let p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }
}


// 10. Logaritmo Natural - NÃO FUNCIONA
function LogaritmoNatural(n, k) {
    if (n >= 1 && k >= 2) {
        let i = 2;
        let e = 1 + n;
        let numerador = n;
        let denominador = 1;

        while (i <= k) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }
}

// 11. Razão Áurea
function RazaoAurea(x, y, k) {
    if (x >= 0, x < y, k > 0) {
        c = y;
        a = x;
        i = 1;
        while (k >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }
}

// 12. Quadrado Perfeito. Checa se um número é um quadrado perfeito.
function QuadradoPerfeito(n) {
    if (n >= 1) {

        let i = 1;
        let s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return s == n;

    }
}

// 13. Raíz Quadrada. n é o radicando e i é a precisão
function Raiz(n, i) {
    if (n > 0) {
        let r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1
        }

        return r;
    }
}

//14. Número Primo. Checa se um número n é primo
function Primo(n) {
    if (n > 1) {

        i = 2;

        while (n > i) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1
        }

        return true;
    }
}

// 15. Crivo de Eratóstenes ????? PERGUNTAR PRO PROFESSOR SOBRE O RETURN.
function CrivoEratostenes(s, n) {
    if (n > 1) {

        a = s;
        // Checar se o vetor está zerado.
        for (i = 2; i <= n; i++) {
            if (a[i] == 0) {
                return false;
            }
        }

        let i = 2;
        limite = Math.floor(Math.sqrt(n));
        let multiplo;

        while (i <= limite) {
            if (a[i] == 0) {
                multiplo = i + i;
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        return a;

    }
}

//16. Maior Divisor Comum

function MDC(a, b) {
    if (b <= a && b > 0) {
        while (b != 0) {
            let m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}

//17. mdc 2
function MDC2(a, b) {

    if (a >= b && b > 0) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}

//18. Regra de Horner para avaliação de polinômio
function Horner(x, g, a) {
    if ((g >= 1)) {
        let p = a[g];
        let i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }
    }
}

//19. Fibonacci. obtém o n-ésimo número de fibonacci
function Fibonacci(n) {

    if (n >= 0) {
        throw new Error("O valor deve ser maior ou igual a 0")
    }

    a = 0;
    c = 1;

    if (n == 0 || n == 1) {
        return n
    }

    i = 2;
    let t;

    while (i <= n) {
        t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;

}

//20. Cadastro de Pessoas Físicas. d é lido como uma string.
function CPF(d) {
    // Checar se o vetor d tem 11 casas. D precisa ser uma string.
    if (d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    let j = d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8];
    let k = d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9];

    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;

    return (dj == d[9] && dk == d[10]);

}

//21. Outro método para o CPF.
function CPF2(d) {

    // Checar se o vetor d tem 11 casas
    if (d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    let c = 8;
    let p = d[9];
    let s = d[9];

    while (c >= 1) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    j = (s % 11) % 10;
    k = ((s - p + d[10]) % 11) % 10;

    return (j == d[10] && k == d[11]);

}