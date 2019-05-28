/**
 * Verifica se um número respeita a propriedade 3025
 *
 * @param {number} n O número a ser testado
 * 
 * @returns {boolean} Se o argumento respeita a propriedade ou não.
 *
 * @throws {TypeError} Se o argumento não for um número
 * @throws {RangeError} Se o argumento é um número não inteiro.
 * @throws {RangeError} Se o parâmetro não estiver entre 0 e 9999
 */
function propriedade3025(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n < 0 || n > 9999) {
        throw new RangeError("O argumento deve estar entre 0 e 9999.");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}

/**
 * Verifica se um número respeita a propriedade 153
 *
 * @param {number} n O número a ser testado
 * 
 * @returns {boolean} Se o argumento respeita a propriedade ou não.
 *
 * @throws {TypeError} Se o argumento não for um número
 * @throws {RangeError} Se o argumento é um número não inteiro.
 * @throws {RangeError} Se o parâmetro não estiver entre 100 e 999.
 */
function propriedade153(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
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
 * Calcula o dia da semana.
 *
 * @param {number} d O dia
 * @param {number} m O mês
 * @param {number} a O ano
 * 
 * @returns {number} Um número equivalente ao dia da semana. 0 = Domingo.
 *
 * @throws {TypeError} Se o argumento não for um número
 * @throws {RangeError} Se o argumento é um número não inteiro.
 * @throws {RangeError} Se a data não existir ou se o ano for menor que 1753.
 */
function diaDaSemana(d, m, a) {
    if (isNaN(d) || isNaN(m) || isNaN(a)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(d) || !Number.isInteger(m) || !Number.isInteger(a)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (dataInvalida(d, m, a)) {
        throw new RangeError("a data não está no formato correto");
    }

    let dia = d;
    let mes = m;
    let ano = a;

    if (mes == 1 || mes == 2) {
        mes = mes + 12;
        ano = ano - 1;
    }

    const s = dia + (2 * mes) + Math.floor(3 * (mes + 1) / 5) + ano + Math.floor(ano / 4) - Math.floor(ano / 100) + Math.floor(ano / 400);

    return s % 7;

}

/**
 * Calcula se a data é válida.
 *
 * @param {number} d O dia
 * @param {number} m O mês
 * @param {number} a O ano
 * 
 * @returns {boolean} True se a data for inválida.
 */
function dataInvalida(d, m, a) {
    if (a < 1753) {
        return true;
    }

    if (m < 1 || m > 12) {
        return true;
    }

    let numeroMaxDias = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    //Se o ano for bissexto muda o max de fevereiro
    if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
        numeroMaxDias[2] = 29;
    }

    return d < 0 || d > numeroMaxDias[m];
}

/**
 * Resto da Divisão inteira
 *
 * @param {number} x O dividendo
 * @param {number} y O divisor
 * 
 * @returns {number} O resto.
 *
 * @throws {TypeError} Se um dos argumentos não for um número
 * @throws {RangeError} Se um dos argumento for um número não inteiro
 * @throws {RangeError} Se y for negativo ou se x for negativo ou zero.
 */
function mod(x, y) {
    if (isNaN(x) || isNaN(y)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(x) || !Number.isInteger(y)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (x < 0 || y <= 0) {
        throw new RangeError("Y deve ser ser maior que 0, X deve ser maior ou igual a 0");
    }

    let s = x;

    while (s >= y) {
        s = s - y;
    }

    return s;
}

/**
 * Soma dos números naturais até n
 *
 * @param {number} n Até onde os números serão somados
 * 
 * @returns {number} A soma.
 *
 * @throws {TypeError} Se o argumento não for numérico
 * @throws {RangeError} Se o argumento for um número não inteiro.
 * @throws {RangeError} Se n for menor que 1.
 */
function somaNaturais(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n < 1) {
        throw new RangeError("N deve ser maior ou igual a 1");
    }

    let i = 2;
    let s = 1;

    while (n >= i) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

/**
 * Fatorial de um número n
 *
 * @param {number} n O fatorial.
 * 
 * @returns {number} O resultado do fatorial.
 *
 * @throws {TypeError} Se o argumento não for numérico
 * @throws {RangeError} Se o argumento for um número não inteiro.
 * @throws {RangeError} Se n for menor que 1.
 */
function fatorial(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n < 1) {
        throw new RangeError("N deve ser maior ou igual a 1");
    }

    let i = 2;
    let f = 1;

    while (n >= i) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

/**
 * Produto de inteiros usando soma.
 *
 * @param {number} a O primeiro número.
 * @param {number} b O segundo número.
 * 
 * @returns {number} O resultado da multiplicação.
 *
 * @throws {TypeError} Se um dos argumentos não for numérico
 * @throws {RangeError} Se um dos argumentos não for um número inteiro.
 * @throws {RangeError} Se A e B forem menores que 0.
 */
function produto(a, b) {
    if (isNaN(a) || isNaN(b)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(a) || !Number.isInteger(b)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
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

    while (totalParcelas >= i) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}

/**
 * Potências usando soma.
 *
 * @param {number} x A base.
 * @param {number} y O expoente.
 * 
 * @returns {number} O resultado da potência.
 * 
 * @throws {TypeError} Se um dos argumentos não for numérico
 * @throws {RangeError} Se um dos argumentos não for um número inteiro.
 * @throws {RangeError} Se A e B forem menores que 0.
 */
function potencia(x, y) {
    if (isNaN(x) || isNaN(y)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(x) || !Number.isInteger(y)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (x < 0 || y < 0) {
        throw new RangeError("X e Y devem ser maior ou igual a 0");
    }

    let potencia = 1;
    let i = 1;

    while (y >= i) {
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}

/**
 * Calcula o pi, 'n' determina a precisão.
 *
 * @param {number} n A precisão.
 * 
 * @returns {number} O valor de pi de acordo com a precisão.
 *
 * @throws {TypeError} Quando o argumento de precisão não for numérico
 * @throws {RangeError} Se o argumento não for inteiro.
 * @throws {RangeError} Se n for menor que 1.
 */
function pi(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n < 1) {
        throw new RangeError("n deve ser maior ou igual a 1.");
    }

    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;

    while (n >= i) {
        d = d + 2;
        s = -1 * s;
        p = p + 4 * s / d;
        i = i + 1;
    }

    return p;
}

/**
 * Logaritmo Natural
 *
 * @param {number} n O logaritmando.
 * @param {number} k A precisão.
 * 
 * @returns {number} O valor do logaritmo natural de acordo com a precisão.
 *
 * @throws {TypeError} Se um dos argumentos não for numérico
 * @throws {RangeError} Se um dos argumentos não for inteiro
 * @throws {RangeError} Se n for menor que 1 ou k menor que 2.
 */
function logaritmoNatural(n, k) {
    if (isNaN(n) || isNaN(k)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n) || !Number.isInteger(k)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n < 1 || k < 2) {
        throw new RangeError("n deve ser maior ou igual a >= 1 e k >= 2.");
    }

    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;

    while (k >= i) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + numerador / denominador;
        i = i + 1;
    }

    return e;
}

/**
 * Razão Áurea
 *
 * @param {number} x Número inteiro
 * @param {number} y Número inteiro
 * @param {number} k Soma dos dois números anteriores
 * 
 * @returns {number} O valor da razão áurea.
 *
 * @throws {TypeError} Se um dos argumentos não for numérico.
 * @throws {RangeError} Se um dos argumentos não for inteiro.
 * @throws {RangeError} Se x < 0, x >=y ou se k <=0.
 */
function razaoAurea(x, y, k) {
    if (isNaN(x) || isNaN(y) || isNaN(k)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(x) || !Number.isInteger(y) || !Number.isInteger(k)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
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
 * Quadrado Perfeito. Checa se um número é um quadrado perfeito.
 *
 * @param {number} n Numero
 * 
 * @returns {boolean} Se o número for um quadrado perfeito.
 *
 * @throws {TypeError} Se o argumento não for numérico.
 * @throws {RangeError} Se o argumento não for inteiro.
 * @throws {RangeError} Se o número for menor que 1.
 */
function quadradoPerfeito(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
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
 * Calcula a Raíz Quadrada. n é o radicando e i é a precisão
 *
 * @param {number} n Radicando
 * @param {number} i Precisão
 * 
 * @returns {number} O resultado da raiz de acordo com a precisão
 *
 * @throws {TypeError} Se um dos argumentos não for numérico.
 * @throws {RangeError} Se um dos argumentos não for inteiro.
 * @throws {RangeError} Se n for menor que 0.
 */
function raiz(n, i) {
    if (isNaN(n) || isNaN(i)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n) || !Number.isInteger(i)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (n <= 0) {
        throw new RangeError("O argumento deve ser maior que 0.");
    }

    let r = 1;

    while (i >= 0) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

/**
 * Número Primo. Checa se um número n é primo
 *
 * @param {number} n Número a ser testado.
 * 
 * @returns {boolean} Se o número é primo.
 *
 * @throws {TypeError} Se o argumento não for numérico.
 * @throws {RangeError} Se o argumento não for inteiro.
 * @throws {RangeError} Se n for menor ou igual a 1.
 */
function primo(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
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
 * Crivo de Eratóstenes.
 *
 * @param {String} s O vetor.
 * @param {Number} n O tamanho do vetor.
 * 
 * @returns {String} O resultado.
 *
 * @throws {TypeError} Se n não for um argumento numérico
 * @throws {TypeError} Se s não receber um vetor.
 * @throws {RangeError} Se o tamanho do vetor for menor ou igual a 1.
 * @throws {RangeError} Se o Vetor não estiver zerado. Todas as posições devem ser zero.
 */
function crivoEratostenes(s) {
    if (!Array.isArray(s)) {
        throw new TypeError("O argumento não é um vetor");
    }

    for (let i = 0; i < s.length; i++) {
        if (s[i] != 0) {
            throw new RangeError("O vetor deve estar zerado.");
        }
    }

    let tamanho = s.length;
    let a = s;
    let i = 2;
    let limite = Math.floor(Math.sqrt(tamanho));
    let multiplo;

    while (limite >= i) {
        multiplo = i + i;
        while (tamanho > multiplo) {
            a[multiplo] = 1;
            multiplo = multiplo + i;
        }
        i = i + 1;
    }

    return a;

}

/**
 * Maior Divisor Comum
 *
 * @param {Number} a O primeiro número.
 * @param {Number} b O segundo número.
 * 
 * @returns {Number} O resultado do MDC.
 *
 * @throws {TypeError} Se o argumento não for numérico.
 * @throws {RangeError} Se o argumento não for inteiro.
 * @throws {Error} Se b for menor que zero e a for menor que b.
 */
function mdc(a, b) {
    if (isNaN(a) || isNaN(b)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(a) || !Number.isInteger(b)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (a < b || b <= 0) {
        throw new RangeError("A deve ser maior ou igual a b, e b > 0");
    }

    while (b > 0) {
        let m = a % b;
        a = b;
        b = m;
    }

    return a;
}

/**
 * Outro método para calcular o MDC.
 *
 * @param {Number} a O primeiro número
 * @param {Number} b O segundo número
 * 
 * @returns {Number} O resultado do MDC.
 *
 * @throws {TypeError} Se o argumento não for numérico.
 * @throws {RangeError} Se o argumento não for inteiro.
 * @throws {Error} Se b for menor que zero e a for menor que b.
 */
function mdc2(a, b) {
    if (isNaN(a) || isNaN(b)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Number.isInteger(a) || !Number.isInteger(b)) {
        throw new RangeError("O argumento deve ser inteiro.");
    }
    if (a < b || b <= 0) {
        throw new RangeError("A deve ser maior ou igual a b, e b > 0");
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
 * Regra de Horner para avaliação de polinômio
 *
 * @param {Number} x Uma constante presente no polinômio
 * @param {Number} g O tamanho do polinômio
 * @param {Array} a O polinômio
 * 
 * @returns {Number} O resultado do polinômio.
 *
 * @throws {Error} Se g for menor que 1.
 */
function horner(x, g, a) {
    if (isNaN(x) || isNaN(g)) {
        throw new TypeError("O argumento não é um número");
    }
    if (!Array.isArray(a)) {
        throw new TypeError("O argumento não é um vetor");
    }
    if (g < 1) {
        throw new RangeError("G deve ser maior ou igual a 1.");
    }

    let p = a[g];
    let i = g - 1;

    while (i >= 0) {
        p = p * x + a[i];
        i = i - 1;
    }

    return p;
}

/**
 * Fibonacci. obtém o n-ésimo número de fibonacci
 *
 * @param {Number} n A posição do valor a ser encontrado
 * 
 * @returns {Number} O n-ésimo número de fibonacci.
 *
 * @throws {Error} Se n for menor a 0.
 */
function fibonacci(n) {
    if (isNaN(n)) {
        throw new TypeError("O argumento n não é um número");
    }
    if (!Number.isInteger(n)) {
        throw new RangeError("O argumento n deve ser inteiro");
    }
    if (n < 0) {
        throw new RangeError("O valor deve ser maior ou igual a 0");
    }

    let a = 0;
    let c = 1;

    if (n == 0 || n == 1) {
        return n;
    }

    let i = 2;
    let t;

    while (n >= i) {
        t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;

}

/**
 * Cadastro de Pessoas Físicas.
 *
 * @param {String} d O CPF.
 * 
 * @returns {boolean} Se o CPF é válido
 * 
 * @throws {TypeError} Se o CPF não for uma String.
 * @throws {TypeError} Se a string não for numérica.
 * @throws {RangeError} Se o CPF não conter 11 dígitos
 */
function cpf(d) {
    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }
    if (isNaN(d)) {
        throw new TypeError("A string não é numérica");
    }
    if (d == null || d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    const cpf = Array(d.length).fill().map((v, i) => parseInt(d[i]));

    const j = cpf[0] + 2 * cpf[1] + 3 * cpf[2] + 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5] + 7 * cpf[6] + 8 * cpf[7] + 9 * cpf[8];
    const k = cpf[1] + 2 * cpf[2] + 3 * cpf[3] + 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6] + 7 * cpf[7] + 8 * cpf[8] + 9 * cpf[9];

    const dj = (j % 11) % 10;
    const dk = (k % 11) % 10;

    return (dj == cpf[9] && dk == cpf[10]);

}

/**
 * Outro método para validar o CPF.
 *
 * @param {String} d O CPF.
 * 
 * @returns {boolean} Se o CPF é válido
 * 
 * @throws {TypeError} Se o CPF não for uma String.
 * @throws {TypeError} Se a string não for numérica.
 * @throws {RangeError} Se o CPF não conter 11 dígitos
 */
function cpf2(d) {
    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }
    if (isNaN(d)) {
        throw new TypeError("A string não é numérica");
    }
    if (d == null || d.length != 11) {
        throw new RangeError("O CPF deve conter 11 dígitos");
    }

    const cpf = Array(d.length).fill().map((v, i) => parseInt(d[i]));

    let c = 7;
    let p = cpf[8];
    let s = cpf[8];

    while (c >= 0) {
        p = p + cpf[c];
        s = s + p;
        c = c - 1;
    }

    const j = (s % 11) % 10;
    const k = ((s - p + 9 * cpf[9]) % 11) % 10;

    return (j == cpf[9] && k == cpf[10]);

}

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
    cpf2: cpf2
};
