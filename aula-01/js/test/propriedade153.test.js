const funcao = require("../algoritmos.js").propriedade153;

test("153 satisfaz (caso classico)", () => {
    expect(funcao(153)).toBe(true);
});

test("155 nao satisfaz", () => {
    expect(funcao(155)).toBe(false);
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