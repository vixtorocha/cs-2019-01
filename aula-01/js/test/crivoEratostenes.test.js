const funcao = require("../index.js").crivoEratostenes;

test("Satisfaz. Retorna verdadeiro", () => {
    expect(funcao([0, 0, 0, 0, 0, 0], 6)).toBe([0, 0, 0, 0, 1, 0, 1]);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("000000", 6);
    }).toThrow(TypeError);
});

test("Vetor não está zerado", () => {
    expect(() => {
        funcao([0, 2, 1, -1, 0, 0], 6);
    }).toThrow(RangeError);
});