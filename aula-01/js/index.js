module.exports = {
    propriedade3025: propriedade3025,
    propriedade153: propriedade153,
    diaDaSemana: diaDaSemana,
    mod: mod,
    somaNaturais: somaNaturais,
    fatorial: fatorial,
    produto: produto,
    potencia: potencia,
    pi: pi,
    logaritmoNatural: logaritmoNatural,
    razaoAurea: razaoAurea,
    quadradoPerfeito: quadradoPerfeito,
    raiz: raiz,
    primo: primo,
    crivoEratostenes: crivoEratostenes,
    mdc: mdc,
    mdc2: mdc2,
    horner: horner,
    fibonacci: fibonacci,
    cpf: cpf,
    cpf2: cpf2,
};

/**
 * 1. Verifica se um número respeita a propriedade 3025
 *
 * @param {number} n O número a ser testado
 * 
 * @returns {boolean} Se o argumento respeita a propriedade ou não.
 *
 * @throws {RangeError} Se o parâmetro não estiver entre 0 e 9999
 */

function propriedade3025(n) {
    if (n < 0 || n > 9999) {
        throw new RangeError("O parâmetro deve estar entre 0 e 9999.");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}

/**
 * 2. Verifica se um número respeita a propriedade 153
 *
 * @param {number} n O número a ser testado
 * 
 * @returns {boolean} Se o argumento respeita a propriedade ou não.
 *
 * @throws {RangeError} Se o parâmetro não estiver entre 100 e 999.
 */

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

/**
 * 3. Calcula o dia da semana.
 *
 * @param {number} d O dia
 * @param {number} m O mês
 * @param {number} a O ano
 * 
 * @returns {number} Um número equivalente ao dia da semana. 0 = Segunda.
 *
 * @throws {RangeError} Se a data não existir ou se o ano for menor que 1753.
 */

function diaDaSemana(d, m, a) {
    if (dataInvalida(d, m, a) == false) {
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

/**
 *  Calcula se a data é válida.
 *
 * @param {number} d O dia
 * @param {number} m O mês
 * @param {number} a O ano
 * 
 * @returns {boolean} Se a data é válida ou não.
 */

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

/**
 * 4. Resto da Divisão inteira
 *
 * @param {number} x O dividendo
 * @param {number} y O divisor
 * 
 * @returns {number} O resto.
 *
 * @throws {RangeError} Se y for negativo ou se x for negativo ou zero.
 */

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

/**
 * 5. Soma dos números naturais até n
 *
 * @param {number} n Até onde os números serão somados
 * 
 * @returns {number} A soma.
 *
 * @throws {RangeError} Se n for menor que 1.
 */

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

/**
 * 6. Fatorial de um número n
 *
 * @param {number} n O fatorial.
 * 
 * @returns {number} O resultado do fatorial.
 *
 * @throws {RangeError} Se n for menor que 1.
 */
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

/**
 * 7. Produto de inteiros usando soma.
 *
 * @param {number} a O primeiro número.
 * @param {number} b O segundo número.
 * 
 * @returns {number} O resultado da multiplicação.
 *
 * @throws {RangeError} Se A e B forem menores que 0.
 */
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

    let i = 1;
    let s = 0;

    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}

/**
 * 8. Potências usando soma.
 *
 * @param {number} x A base.
 * @param {number} y O expoente.
 * 
 * @returns {number} O resultado da potência.
 *
 * @throws {RangeError} Se A e B forem menores que 0.
 */
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

/**
 * 9. Calcula o pi, 'n' determina a precisão.
 *
 * @param {number} n A precisão.
 * 
 * @returns {number} O valor de pi de acordo com a precisão.
 *
 * @throws {RangeError} Se n for menor que 1.
 */
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

/**
 * 10. Logaritmo Natural
 *
 * @param {number} n O logaritmando.
 * @param {number} k A precisão.
 * 
 * @returns {number} O valor do logaritmo natural de acordo com a precisão.
 *
 * @throws {RangeError} Se n for menor que 1 ou k menor que 2.
 */
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

/**
 * 11. Razão Áurea
 *
 * @param {number} x Número inteiro
 * @param {number} y Número inteiro
 * @param {number} k Soma dos dois números anteriores
 * 
 * @returns {number} O valor da razão áurea.
 *
 * @throws {RangeError} Se x < 0, x >=y ou se k <=0.
 */
function razaoAurea(x, y, k) {
    if (x < 0 || x >= y || k <= 0) {
        throw new RangeError("X deve ser maior ou igual a 0, x > y, e k > 0.");
    }

    let c = y;
    let a = x;
    let i = 1;
    let t;

    while (k >= i) {
        t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c / a;
}

/**
 * 12. Quadrado Perfeito. Checa se um número é um quadrado perfeito.
 *
 * @param {number} n Numero
 * 
 * @returns {boolean} Se o número for um quadrado perfeito.
 *
 * @throws {RangeError} Se o número for menor que 1.
 */
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

/**
 * 13. Qualcula a Raíz Quadrada. n é o radicando e i é a precisão
 *
 * @param {number} n Radicando
 * @param {number} i Precisão
 * 
 * @returns {number} O resultado da raiz de acordo com a precisão
 *
 * @throws {RangeError} Se n for menor que 0.
 */
function raiz(n, i) {
    if (n < 0) {
        throw new RangeError("n deve ser maior que 0.");
    }

    let r = 1;

    while (i >= 0) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

/**
 * 14. Número Primo. Checa se um número n é primo
 *
 * @param {number} n Número a ser testado.
 * 
 * @returns {boolean} Se o número é primo.
 *
 * @throws {RangeError} Se n for menor ou igual a 1.
 */
function primo(n) {
    if (n <= 1) {
        throw new RangeError("n deve ser maior que 1.");
    }

    let i = 2;

    while (n > i) {
        if (n % i == 0) {
            return false;
        }
        i = i + 1;
    }

    return true;
}

/**
 * 15. Crivo de Eratóstenes.
 *
 * @param {String} s A String.
 * @param {Number} n O tamanho da String
 * 
 * @returns {String} O resultado.
 *
 * @throws {RangeError} Se o tamanho da String for menor que 1.
 * @throws {Error} Se a string não estiver zerada. Todas as posições devem ser zero.
 */
function crivoEratostenes(s, n) {
    if (n > 1) {
        throw new RangeError("O tamanho da String deve ser maior que 1.");
    }

    let a;
    for (let i = 0; i < n; i++) {
        if (a[i] != 0) {
            throw new Error("A string deve estar zerada.");
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
        let limite = Math.floor(Math.sqrt(n));
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

/**
 * 16. Maior Divisor Comum
 *
 * @param {Number} a O primeiro número
 * @param {Number} b O segundo número
 * 
 * @returns {Number} O resultado do MDC.
 *
 * @throws {Error} Se b for menor que zero e a >= b.
 */
function mdc(a, b) {
    if (a >= b || b < 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0");
    }

    while (b != 0) {
        let m = a % b;
        a = b;
        b = m;
    }

    return a;
}

/**
 * 17. Outro método para calcular o MDC.
 *
 * @param {Number} a O primeiro número
 * @param {Number} b O segundo número
 * 
 * @returns {Number} O resultado do MDC.
 *
 * @throws {Error} Se b for menor que zero e a >= b.
 */
function mdc2(a, b) {
    if (a >= b || b > 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0");
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

/**
 * 18. Regra de Horner para avaliação de polinômio
 *
 * @param {Number} x Uma constante presente no polinômio
 * @param {Number} g O tamanho do polinômio
 * @param {String} a O polinômio
 * 
 * @returns {Number} O resultado do polinômio.
 *
 * @throws {Error} Se g for menor que 1.
 */
function horner(x, g, a) {
    if (g < 1) {
        throw new Error("G deve ser maior ou igual a 1.");
    }

    let p = a[g];
    let i = g - 1;

    while (i >= 0) {
        p = p * x + a[i];
        i = i - 1;
    }
}

/**
 * 19. Fibonacci. obtém o n-ésimo número de fibonacci
 *
 * @param {Number} n A posição do valor a ser encontrado
 * 
 * @returns {Number} O n-ésimo número de fibonacci.
 *
 * @throws {Error} Se n for menor a 0.
 */
function fibonacci(n) {
    if (n < 0) {
        throw new Error("O valor deve ser maior ou igual a 0");
    }

    let a = 0;
    let c = 1;

    if (n == 0 || n == 1) {
        return n;
    }

    let i = 2;
    let t;

    while (i <= n) {
        t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;

}

/**
 * Converte o CPF de String para um Vetor numérico.
 *
 * @param {String} d O CPF.
 * 
 * @returns {Array} O CPF como um vetor
 */

function cpfStringToArray(d) {
    let cpf = [];

    for (let i = 0; i < d.length; i++) {
        cpf[i] = parseInt(d[i]);
    }

    return cpf;
}

/**
 * 20. Cadastro de Pessoas Físicas.
 *
 * @param {String} d O CPF.
 * 
 * @returns {boolean} Se o CPF é válido
 * 
 * @throws {TypeError} Se o CPF não for uma String.
 * @throws {RangeError} Se o CPF não conter 11 dígitos
 */
function cpf(d) {

    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }

    if (d == null || d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    const cpf = cpfStringToArray(d);

    let j = cpf[0] + 2 * cpf[1] + 3 * cpf[2] + 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5] + 7 * cpf[6] + 8 * cpf[7] + 9 * cpf[8];
    let k = cpf[1] + 2 * cpf[2] + 3 * cpf[3] + 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6] + 7 * cpf[7] + 8 * cpf[8] + 9 * cpf[9];

    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;

    return (dj == cpf[9] && dk == cpf[10]);

}

/**
 * 21. Outro método para validar o CPF.
 *
 * @param {String} d O CPF.
 * 
 * @returns {boolean} Se o CPF é válido
 * 
 * @throws {TypeError} Se o CPF não for uma String.
 * @throws {RangeError} Se o CPF não conter 11 dígitos
 */
function cpf2(d) {

    // Checa de D é uma string.
    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }

    // Checar se o vetor d tem 11 casas.
    if (d == null || d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    const cpf = cpfStringToArray(d);

    let c = 7;
    let p = cpf[8];
    let s = cpf[8];

    while (c >= 0) {
        p = p + cpf[c];
        s = s + p;
        c = c - 1;
    }

    let j = (s % 11) % 10;
    let k = ((s - p + 9 * cpf[9]) % 11) % 10;

    return (j == cpf[9] && k == cpf[10]);

}