const funcao = require("../algoritmos.js").horner;

test("Caso correto", () => {
    expect(funcao(1, 2, [0, 1, 2])).toBe(3);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("abcd", 2, [0, 1, 2]);
    }).toThrow(TypeError);
});

test("Vetor não é um vetor", () => {
    expect(() => {
        funcao(1, 2, "000000");
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao(1, -1, [0, 1, 2]);
    }).toThrow(RangeError);
});