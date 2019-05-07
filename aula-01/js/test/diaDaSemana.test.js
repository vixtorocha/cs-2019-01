const funcao = require("../index.js");

test("07/05/2019 retorna 1 (terça)", () => {
    expect(funcao.diaDaSemana(7, 5, 2019)).toBe(1);
});

test("06/05/2019 retorna 0 (satisfaz))", () => {
    expect(funcao.diaDaSemana(6, 5, 2019)).toBe(0);
});

test("30/02/2019 dia nao satisfaz", () => {
    expect(funcao.diaDaSemana(30, 2, 2019)).toBe(false);
});

test("01/30/2019 mês satisfaz", () => {
    expect(funcao.diaDaSemana(1, 30, 2019)).toBe(false);
});

test("01/30/1500 A função não aceita o ano 1500", () => {
    expect(funcao.diaDaSemana(1, 30, 1500)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao.diaDaSemana();
    }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao.diaDaSemana("abcd");
    }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao.diaDaSemana(-1, 2, 2019);
    }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao.diaDaSemana(10.3, 5, 2019)).toThrow(RangeError);
});