const funcao = require("../algoritmos.js").raiz;

test("Satisfaz. Retorna verdadeiro", () => {
    expect(funcao(4, 25)).toBe(2);
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
        funcao(-1, 25);
    }).toThrow(RangeError);
});

test("valor zero fora da faixa", () => {
    expect(() => {
        funcao(0, 25);
    }).toThrow(RangeError);
});

test("argumento deve ser inteiro", () => {
    expect(() => {
        funcao(2.45, 25);
    }).toThrow(RangeError);
});