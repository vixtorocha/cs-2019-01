/**
 * Soma os elementos ímpares em um vetor.
 * 
 * @param {Array} vetor O vetor
 * @returns A soma dos númros ímpares.
 */
function somaImpares(vetor) {
    if (!Array.isArray(vetor)) {
        throw new TypeError("O argumento não é um vetor");
    }

    let soma = 0;

    vetor.forEach(numero => {
        if (numero % 2) {
            soma += numero;
        }
    });

    return soma;
}