/**
 * Verifica ...
 *
 * @param {number} n Pode até copiar da versão em Java...
 * @returns {boolean} Se o argumento ...
 *
 * @throws {RangeError} Se ...
 */

function propriedade3025(n) {
    if (n < 0 || n > 9999) {
        throw new RangeError("O parâmetro deve estar entre 0 e 9999.");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}

//2. Propriedade 153
function propriedade153(n) {
    if (n < 100 || n > 999) {
        throw new RangeError("O parâmetro deve estar entre 100 e 999.");
    }

    const c = Math.floor(n / 100);
    const du = Math.floor(n % 100);
    const d = Math.floor(du / 10);
    const u = Math.floor(du % 10);

    return (c * c * c) + (d * d * d) + (u * u * u) == n;
}

//3. Calcula o dia da semana, começando por 0 (segunda-feira)
function diaDaSemana(d, m, a) {
    if (dataInvalida(d, m, a)) {
        throw new RangeError("a data não está no formato correto");
    }

    let dia = d;
    let mes = m;
    let ano = a;
    let s;

    if (m == 1 || m == 2) {
        m = m + 12;
        a = a - 1;
    }

    s = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);

    return (s % 7);

}

function dataInvalida(d, m, a) {

    if (m < 1 || m > 12) {
        return false;
    }

    if (d < 1 || d > 31) {
        return false;
    }

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

// 4. Resto da Divisão inteira
function mod(x, y) {
    if (y < 0 || x <= 0) {
        throw new RangeError("Y deve ser ser maior ou igual a 0, X deve ser maior que 0");
    }

    let s = x;

    while (y <= s) {
        s = s - y;
    }

    return s;
}

//5. Soma dos números naturais até n
function somaNaturais(n) {
    if (n < 1) {
        throw new RangeError("N deve ser maior ou igual a 1");
    }

    let i = 2;
    let s = 1;

    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

//6. Fatorial de um número n
function fatorial(n) {
    if (n < 1) {
        throw new RangeError("N deve ser maior ou igual a 1");
    }

    let i = 2;
    let f = 1;

    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

//7. Produto de inteiros usando soma.
function produto(a, b) {
    if (a < 0 || b < 0) {
        throw new RangeError("A e B devem ser maior ou igual a 0");
    }

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

//8. Potências usando soma.
function potencia(x, y) {
    if (x < 0 || y < 0) {
        throw new RangeError("X e Y devem ser maior ou igual a 0");
    }

    let potencia = 1;
    let i = 1;

    while (i <= y) {
        potencia = Produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}

//9. Calcula o pi, 'n' determina a precisão.
function pi(n) {
    if (n < 1) {
        throw new RangeError("n deve ser maior ou igual a 1.");
    }

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


// 10. Logaritmo Natural - NÃO FUNCIONA
function logaritmoNatural(n, k) {
    if (n < 1 || k < 2) {
        throw new RangeError("n deve ser maior ou igual a >= 1 e k >= 2.");
    }

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

// 11. Razão Áurea
function razaoAurea(x, y, k) {
    if (x < 0 || x >= y || k <= 0) {
        throw new RangeError("X deve ser maior ou igual a 0, x > y, e k > 0.");
    }

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

// 12. Quadrado Perfeito. Checa se um número é um quadrado perfeito.
function quadradoPerfeito(n) {
    if (n < 1) {
        throw new RangeError("N deve ser maior ou igual a 1");
    }

    let i = 1;
    let s = 1;

    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s == n;
}

// 13. Raíz Quadrada. n é o radicando e i é a precisão
function raiz(n, i) {
    if (n < 0) {
        throw new RangeError("n deve ser maior que 0.");
    }

    let r = 1;

    while (i >= 0) {
        r = (r + n / r) / 2;
        i = i - 1
    }

    return r;
}

//14. Número Primo. Checa se um número n é primo
function primo(n) {
    if (n <= 1) {
        throw new RangeError("n deve ser maior que 1.");
    }

    i = 2;

    while (n > i) {
        if (n % i == 0) {
            return false;
        }
        i = i + 1
    }

    return true;
}

// 15. Crivo de Eratóstenes ????? PERGUNTAR PRO PROFESSOR SOBRE O RETURN.
function crivoEratostenes(s, n) {
    if (s.length > 1) {
        throw new Error("O tamanho da Array deve ser maior que 1.");
    }

    for (let i = 0; i < s.length; i++) {
        if (a[i] != 0) {
            throw new RangeError("A array deve estar zerada.");
        }
    }

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

function mdc(a, b) {
    if (a >= b || b > 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0")
    }

    while (b != 0) {
        let m = a % b;
        a = b;
        b = m;
    }

    return a;
}

//17. mdc 2
function mdc2(a, b) {
    if (a >= b || b > 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0")
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

//18. Regra de Horner para avaliação de polinômio
function horner(x, g, a) {
    if (g < 1) {
        throw new Error('G deve ser maior ou igual a 1.');
    }

    let p = a[g];
    let i = g - 1;

    while (i >= 0) {
        p = p * x + a[i];
        i = i - 1;
    }
}

//19. Fibonacci. obtém o n-ésimo número de fibonacci
function fibonacci(n) {
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
function cpf(d) {
    if (d == null || d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }

    //FIXME: nao foi feita verificacao se são dígitos 0..9????

    //TODO: fazer conversao apenas uma vez por digito
    let j = parseInt(d[0]) + 2 * parseInt(d[1]) + 3 * parseInt(d[2]) + 4 * parseInt(d[3]) + 5 * parseInt(d[4]) + 6 * parseInt(d[5]) + 7 * parseInt(d[6]) + 8 * parseInt(d[7]) + 9 * parseInt(d[8]);
    let k = parseInt(d[1]) + 2 * parseInt(d[2]) + 3 * parseInt(d[3]) + 4 * parseInt(d[4]) + 5 * parseInt(d[5]) + 6 * parseInt(d[6]) + 7 * parseInt(d[7]) + 8 * parseInt(d[8]) + 9 * parseInt(d[9]);

    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;

    return (dj == parseInt(d[9]) && dk == parseInt(d[10]));

}

//21. Outro método para o CPF.
function cpf2(d) {

    // Checar se o vetor d tem 11 casas
    if (d.length != 11) {
        throw new RangeError("O CPF deve ser uma string que contem 11 dígitos");
    }

    let c = 7;
    let p = parseInt(d[8]);
    let s = parseInt(d[8]);

    while (c >= 0) {
        p = p + parseInt(d[c]);
        s = s + p;
        c = c - 1;
    }

    j = (s % 11) % 10;
    k = ((s - p + 9 * parseInt(d[9])) % 11) % 10;

    return (j == parseInt(d[9]) && k == parseInt(d[10]));

}