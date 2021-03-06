const funcao = require("../algoritmos.js").potencia;

test("Satisfaz. Caso comum de 2^3", () => {
    expect(funcao(2, 3)).toBe(8);
});

test("Satisfaz com 0, 4^0", () => {
    expect(funcao(4, 0)).toBe(1);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd", 3);
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(-1, 3);
    }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 3)).toThrow(RangeError);
});