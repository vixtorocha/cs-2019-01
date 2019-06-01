/**
 * Sorteia números inteiros e os retorna em um vetor
 * @param {Number} max Número máximo que pode ser sorteado
 * @param {Number} qntd Quantidade de números sorteados
 * @returns Vetor com os números sorteados
 */
function frequenciaSorteio(max, qntd) {
    //Sorteia e já conta a frequência;
    let vetor = [];
    let contagem = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

    for (let i = 0; i < qntd; i++) {
        let numero = Math.floor(Math.random() * Math.floor(max));
        vetor.push(numero);
        contagem[numero]++;
    }

    /**
     * Procura de acordo com o índice do vetor "contagem", 
     * qual foi o número mais rápido.
     */
    let maisFrequente = 0;
    let indiceFrequente;

    contagem.forEach(function (elemento, indice) {
        if (elemento > maisFrequente) {
            maisFrequente = elemento;
            indiceFrequente = indice;
        }
    });

    return indiceFrequente;
}