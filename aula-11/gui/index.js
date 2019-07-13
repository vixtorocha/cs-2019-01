// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?dataInicial=";

/**
 * Chama o API.
 */
function calculaDiferenca() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let diferencaDeDias = extraiDiferencaDaResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = diferencaDeDias;
        }
    };

    let dataAnoMesDiaInicial = document.getElementById("dataInicial").value;
    let dataAnoMesDiaFinal = document.getElementById("dataFinal").value;
    let dataInicial = formataData(dataAnoMesDiaInicial);
    let dataFinal = formataData(dataAnoMesDiaFinal);

    xhttp.open("GET", construirCaminho(dataInicial, dataFinal), true);
    xhttp.send();
}

/**
 * Controi a URL necessária para o API.
 */
function construirCaminho(dataInicial, dataFinal) {
    return PATH + dataInicial + '&dataFinal=' + dataFinal;
}

/**
 * Ajusta a data padrão na página para exibir o dia corrente.
 */
function dataCorrente() {
    document.getElementById("dataInicial").valueAsDate = new Date();
    document.getElementById("dataFinal").valueAsDate = new Date();
}

/**
 * Recebe um objeto e extrai a resposta usando json.
 * @param {Object} resposta
 * @returns uma String com a resposta.
 */
function extraiDiferencaDaResposta(resposta) {
    json = JSON.parse(resposta);
    return "Há " + json.diferenca + " dia(s) entre " + json.dataInicial + " e " + json.dataFinal;
}

/**
 * Ajusta o formato da data.
 * @param {String} data no formato ano-mes-dia.
 * @returns uma String da data no formato dia-mes-ano.
 */
function formataData(data) {
    let [a, m, d] = data.split("-");

    //Formata o dia, mês e ano
    let dia = ("00" + d).substr(-2, 2);
    let mes = ("00" + m).substr(-2, 2);
    let ano = ("0000" + a).substr(-4, 4);

    return `${d}-${m}-${a}`;
}

module.exports = {
    formataData: formataData,
};