const funcao = require("../index.js").produto;

test("Satisfaz. Caso comum", () => {
    expect(funcao(2, 3)).toBe(6);
});

test("Satisfaz com 0", () => {
    expect(funcao(4, 0)).toBe(0);
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