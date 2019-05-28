const funcao = require("../algoritmos.js").razaoAurea;

test("Satisfaz.", () => {
    expect(funcao(1, 2, 20)).toBe(1.6180339901755971);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd", 3, 10);
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(-1, 2, 10);
    }).toThrow(RangeError);
});

test("argumento deve ser inteiro", () => {
    expect(() => {
        funcao(2.45, 2, 10);
    }).toThrow(RangeError);
});