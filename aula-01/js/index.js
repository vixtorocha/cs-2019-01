//Console log para testes usando o node.
console.log(CPF2('06569683110'));

//1. Propriedade 3025. Verifica se a propriedade é válida para um inteiro.
function Propriedade3025(n) {
    if (!(n >= 0 || n <= 9999)) {
        throw new RangeError("O parâmetro deve estar entre 0 e 9999.");
    }

    let i, j;

    //a função parseInt será necessária por que javascript retornará um valor em float que atrapalha o bom funcionamento da função. parseInt converte para o tipo inteiro.
    i = parseInt(n / 100);
    j = parseInt(n % 100);
    return (i + j) * (i + j) == n;
}

//2. Propriedade 153. Verifica se a propriedade 153 é válida para um inteiro.
function Propriedade153(n) {
    if (!(n >= 100 || n <= 999)) {
        throw new RangeError("O parâmetro deve estar entre 100 e 999.");
    }

    // A função parseInt converte para um inteiro.
    c = parseInt(n / 100);
    du = parseInt(n % 100);
    d = parseInt(du / 10);
    u = parseInt(du % 10);

    let resultado = (c * c * c) + (d * d * d) + (u * u * u);

    return resultado == n;
}

//3. Calcula o dia da semana, começando por 0 (segunda-feira)
function DiaDaSemana(dia, mes, ano) {
    if (!(dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 1753)) {
        throw new RangeError("d deve estar entre 1 e 31. m deve estar entre 1 e 12. e o ano deve ser maior que 1753");
    }

    if (mes == 1 || mes == 2) {
        mes = mes + 12;
        ano = ano - 1;
    }

    let resultadoParcial = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);

    return (resultadoParcial % 7);

}

// 4. Resto da Divisão inteira de um numerador com um denominador
function Mod(numerador, denominador) {
    if (!(denominador >= 0 || numerador > 0)) {
        throw new RangeError("O denominador deve ser ser maior ou igual a 0, O numerador deve ser maior que 0");
    }

    let resultado = numerador;

    while (denominador <= resultado) {
        resultado = resultado - denominador;
    }

    return resultado;
}

//5. Soma dos números naturais de 1 até n.
function SomaNaturais(n) {
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
function Fatorial(n) {
    if (!(n >= 1)) {
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
function Produto(a, b) {
    if (!(a >= 0 && b >= 0)) {
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

//8. Função que resolve uma potência através de soma, usando a função de produto criada anteriormente.
function Potencia(base, expoente) {
    if (!(base >= 0 && expoente >= 0)) {
        throw new RangeError("X e Y devem ser maior ou igual a 0");
    }

    let potencia = 1;
    let i = 1;

    while (i <= expoente) {
        potencia = Produto(potencia, base);
        i = i + 1;
    }

    return potencia;
}

//9. Calcula o pi.
function Pi(precisao) {
    if (!(precisao >= 1)) {
        throw new RangeError("n deve ser maior ou igual a 1.");
    }

    let i = 1;
    let s = -1;
    let d = -1;
    let pi = 0;

    while (i <= precisao) {
        d = d + 2;
        s = -1 * s;
        pi = pi + 4 * s / d;
        i = i + 1;
    }

    return pi;
}


// 10. Logaritmo Natural - NÃO FUNCIONA
function LogaritmoNatural(n, k) {
    if (!(n >= 1 && k >= 2)) {
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
function RazaoAurea(x, y, k) {
    if (!(x >= 0, x < y, k > 0)) {
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
function QuadradoPerfeito(n) {
    if (!(n >= 1)) {
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

// 13. Raíz Quadrada. Precisa do radicando e da precisão como parâmetro
function Raiz(radicando, precisao) {
    if (radicando > 0) {
        throw new RangeError("n deve ser maior que 0.");
    }

    let resultado = 1;

    while (precisao >= 0) {
        resultado = (resultado + radicando / resultado) / 2;
        precisao = precisao - 1
    }

    return resultado;
}

//14. Número Primo. Checa se um número é primo
function Primo(numero) {
    if (!(numero > 1)) {
        throw new RangeError("n deve ser maior que 1.");
    }

    i = 2;

    while (numero > i) {
        //checa se o número tem outro divisor além de 1 e ele mesmo.
        if (numero % i == 0) {
            return false;
        }
        i = i + 1
    }

    return true;
}

// 15. Crivo de Eratóstenes.
function CrivoEratostenes(s, n) {
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
function MDC(a, b) {
    if (a >= b && b > 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0")
    }

    //atribuindo os valores para outro variável afim de evitar efeito colateral.
    let numero1 = a;
    let numero2 = b;

    while (numero2 != 0) {
        let resto = numero1 % numero2;
        numero1 = numero2;
        numero2 = resto;
    }

    return a;
}

//17. mdc 2
function MDC2(a, b) {
    if (a >= b && b > 0) {
        throw new Error("A deve ser maior ou igual a b, e b > 0")
    }

    //atribuindo os valores para outro variável afim de evitar efeito colateral.
    let numero1 = a;
    let numero2 = b;

    while (numero1 != numero2) {
        if (numero1 > numero2) {
            numero1 = numero1 - numero2;
        } else {
            numero2 = numero2 - numero1;
        }
    }

    return numero1;
}

//18. Regra de Horner para avaliação de polinômio
function Horner(x, g, a) {
    if (!(g >= 1)) {
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


    let j = parseInt(d[0]) + 2 * parseInt(d[1]) + 3 * parseInt(d[2]) + 4 * parseInt(d[3]) + 5 * parseInt(d[4]) + 6 * parseInt(d[5]) + 7 * parseInt(d[6]) + 8 * parseInt(d[7]) + 9 * parseInt(d[8]);
    let k = parseInt(d[1]) + 2 * parseInt(d[2]) + 3 * parseInt(d[3]) + 4 * parseInt(d[4]) + 5 * parseInt(d[5]) + 6 * parseInt(d[6]) + 7 * parseInt(d[7]) + 8 * parseInt(d[8]) + 9 * parseInt(d[9]);

    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;

    return (dj == parseInt(d[9]) && dk == parseInt(d[10]));

}

//21. Outro método para o CPF.
function CPF2(d) {

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

    let j = (s % 11) % 10;
    let k = ((s - p + 9 * parseInt(d[9])) % 11) % 10;

    return (j == parseInt(d[9]) && k == parseInt(d[10]));

}