const funcao = require("../index.js").primo;

test("Satisfaz. Retorna verdadeiro", () => {
    expect(funcao(17)).toBe(true);
});

test("Não satisfaz. Retorna falso", () => {
    expect(funcao(4)).toBe(false);
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
        funcao(-1);
    }).toThrow(RangeError);
});

test("valor zero fora da faixa", () => {
    expect(() => {
        funcao(0);
    }).toThrow(RangeError);
});

test("argumento deve ser inteiro", () => {
    expect(() => {
        funcao(2.45);
    }).toThrow(RangeError);
});