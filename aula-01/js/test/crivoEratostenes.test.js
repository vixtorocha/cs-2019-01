const funcao = require("../algoritmos.js").crivoEratostenes;

test("Satisfaz. Retorna verdadeiro", () => {
    expect(funcao([0, 0, 0, 0, 0, 0, 0])).toEqual([0, 0, 0, 0, 1, 0, 1]);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => {
        funcao("000000");
    }).toThrow(TypeError);
});

test("Vetor não está zerado", () => {
    expect(() => {
        funcao([0, 2, 1, -1, 0, 0]);
    }).toThrow(RangeError);
});