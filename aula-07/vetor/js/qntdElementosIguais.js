/**
 * Calcula quantos elementor iguais há entre dois vetores.
 * 
 * @param {Array} vetor1 O primeiro vetor
 * @param {Array} vetor2 O segundo vetor
 * @returns A quantidade de elementos iguais.
 */
function qntdElementosIguais(vetor1, vetor2) {
    if (!Array.isArray(vetor1) || !Array.isArray(vetor2)) {
        throw new TypeError("O argumento não é um vetor");
    }

    let qntdValoresIguais = 0;

    vetor1.forEach(valor1 => {
        vetor2.forEach(valor2 => {
            if (valor1 == valor2) {
                qntdValoresIguais++;
                break;
            }
        });
    });

    return qntdValoresIguais;
}