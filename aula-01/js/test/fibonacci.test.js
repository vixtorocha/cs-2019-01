const funcao = require("../algoritmos.js").fibonacci;

test("Encontra corretamente o quarto termo", () => {
    expect(funcao(4)).toBe(3);
});

test("Argumento 0", () => {
    expect(funcao(0)).toBe(0);
});

test("Argumento 1", () => {
    expect(funcao(1)).toBe(1);
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