// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?numero=";

/**
 * Função que chama o API e cuida do XMLHttpRequest
 */
function pegaNumExtenso() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let numeroPorExtenso = extraiResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = numeroPorExtenso;
        }
    };

    let numero = document.getElementById("numero").value;

    xhttp.open("GET", construirCaminho(numero), true);
    xhttp.send();
}

/**
 * Controi a URL necessária para o API.
 */
function construirCaminho(numero) {
    return PATH + numero;
}
/**
 * Exibe o número 0 na interface como padrão.
 */
function numPadrao() {
    document.getElementById("numero").value = 0;
}

/**
 * Extrai a resposta de um objeto usando json.
 * @param {Object} resposta O objeto retornado pela API
 */
function extraiResposta(resposta) {
    return JSON.parse(resposta).numeroPorExtenso;
}