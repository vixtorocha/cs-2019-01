/**
 * Encontra a menor temperatura em um vetor.
 * 
 * @param {Array} vetor O vetor.
 * @returns A menor temperatura.
 */
function menorTemperatura(vetor) {
    if (!Array.isArray(vetor)) {
        throw new TypeError("O argumento não é um vetor");
    }

    return Math.min(...vetor);

}