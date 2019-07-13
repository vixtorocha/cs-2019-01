const funcao = require("../index.js");

test("Testa se o caminho é construído corretamente", () => {
    expect(funcao.construirCaminho("2019")).toBe("http://localhost:8080/ds?numero=2019");
});