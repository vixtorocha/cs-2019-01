const funcao = require("../algoritmos.js").mdc;

test("Satisfaz.", () => {
    expect(funcao(9, 6)).toBe(3);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd", 25);
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(6, -1);
    }).toThrow(RangeError);
});

test("valor zero fora da faixa", () => {
    expect(() => {
        funcao(8, 0);
    }).toThrow(RangeError);
});

test("argumento deve ser inteiro", () => {
    expect(() => {
        funcao(2.45, 6);
    }).toThrow(RangeError);
});