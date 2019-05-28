const funcao = require("../algoritmos.js").fatorial;

test("Satisfaz. Caso comum", () => {
    expect(funcao(3)).toBe(6);
});

test("Satisfaz", () => {
    expect(funcao(7)).toBe(5040);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd");
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(-1);
    }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3)).toThrow(RangeError);
});