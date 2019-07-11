const funcao = require("../index.js").formataData;

test("Testa se a data é formatada corretamente", () => {
    expect(funcao("2019-07-11")).toBe("11-07-2019");
});