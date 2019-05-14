const funcao = require("../index.js").diaDaSemana;

test("07/05/2019 retorna 2 (terça)", () => {
    expect(funcao(7, 5, 2019)).toBe(1);
});

test("06/05/2019 retorna 1 (segunda))", () => {
    expect(funcao(6, 5, 2019)).toBe(0);
});

test("30/02/2019 dia nao satisfaz", () => {
    expect(() => funcao(30, 2, 2019)).toThrow(RangeError);
});

test("01/30/2019 mês não satisfaz", () => {
    expect(() => funcao(1, 30, 2019)).toThrow(RangeError);
});

test("01/30/1500 A função não aceita o ano 1500", () => {
    expect(() => funcao(1, 30, 1500)).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd", 5, 2019);
    }).toThrow(TypeError);
});


test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(-1, 2, 2019);
    }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 5, 2019)).toThrow(RangeError);
});