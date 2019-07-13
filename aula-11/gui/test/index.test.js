const funcao = require("../index.js");

test("Testa se a data é formatada corretamente", () => {
    expect(funcao.formataData("2019-07-11")).toBe("11-07-2019");
});

test("Testa se o caminho é construído corretamente", () => {
    expect(funcao.construirCaminho("12-07-2019", "13-07-2019")).toBe("http://localhost:8080/ds?dataInicial=12-07-2019&dataFinal=13-07-2019");
});