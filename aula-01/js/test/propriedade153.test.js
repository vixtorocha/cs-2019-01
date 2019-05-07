const funcao = require("../index.js");

test("153 satisfaz (caso classico)", () => {
    expect(funcao.propriedade153(153)).toBe(true);
});

test("155 nao satisfaz", () => {
    expect(funcao.propriedade153(155)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao.propriedade153();
    }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao.propriedade153("abcd");
    }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao.propriedade153(-1);
    }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcao.propriedade153(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao.propriedade153(10.3)).toThrow(RangeError);
});