const funcao = require("../algoritmos.js").cpf;

test("Satisfaz, é um CPF válido (obtido por um gerador)", () => {
    expect(funcao("85813526005")).toBe(true);
});

test("Não satisfaz", () => {
    expect(funcao("85813526010")).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcao();
    }).toThrow(TypeError);
});

test("argumento nao pode ser numerico", () => {
    expect(() => {
        funcao(85813526005);
    }).toThrow(TypeError);
});

test("argumento deve ser numerico", () => {
    expect(() => {
        funcao("858abc26005");
    }).toThrow(TypeError);
});