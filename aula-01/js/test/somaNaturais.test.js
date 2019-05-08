const funcao = require("../index.js").somaNaturais;

test("5 satisfaz (1 + 2 + 3 + 4 + 5)", () => {
    expect(funcao(5)).toBe(15);
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

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcao(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3)).toThrow(RangeError);
});