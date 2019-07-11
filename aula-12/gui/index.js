// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?numero=";

function calculaDiferenca() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let numeroPorExtenso = extraiResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = numeroPorExtenso;
        }
    };

    let numero = document.getElementById("numero").value;
    xhttp.open("GET", PATH + numero, true);
    xhttp.send();
}

function numPadrao() {
    document.getElementById("numero").value = 0;
}

// Funções para integração (satisfazer contrato do servidor)

function extraiResposta(resposta) {
    return JSON.parse(resposta).numeroPorExtenso;
}