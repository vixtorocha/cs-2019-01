/**
 * Calcula a quantidade em que cada elemento aparece em um vetor.
 * 
 * @param {Array} vetor O vetor
 * @returns {Array} Um vetor com a quantidade de recorrencias de acordo com o índice.
 */
function qntdRepeticoes(vetor) {
    if (!Array.isArray(vetor)) {
        throw new TypeError("O argumento não é um vetor");
    }

    let vetorResultado = [];
    vetor.forEach(function (numero1, indice) {
        let recorrencias = 0;
        vetor.forEach(numero2 => {
            if (numero1 == numero2) {
                recorrencias++;
            }
        });
        vetorResultado[indice] = recorrencias;
    });

    return vetorResultado;
}