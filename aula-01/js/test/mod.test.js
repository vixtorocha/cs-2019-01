const funcao = require("../index.js").mod;

test("Caso válido - 8 dividido por 3", () => {
    expect(funcao(8, 3)).toBe(2);
});

test("Dividendo menor que 0", () => {
    expect(() => funcao(-1, 3)).toThrow(RangeError);
});

test("Divisor menor que 0", () => {
    expect(() => funcao(8, -1)).toThrow(RangeError);
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

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 5)).toThrow(RangeError);
});