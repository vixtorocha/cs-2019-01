// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?dataInicial=";

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
    xhttp.open("GET", PATH + dataInicial + '&dataFinal=' + dataFinal, true);
    xhttp.send();
}

function dataCorrente() {
    document.getElementById("dataInicial").valueAsDate = new Date();
    document.getElementById("dataFinal").valueAsDate = new Date();
}

// Funções para integração (satisfazer contrato do servidor)

function extraiDiferencaDaResposta(resposta) {
    json = JSON.parse(resposta);
    return "Há " + json.diferenca + " dia(s) entre " + json.dataInicial + " e " + json.dataFinal;
}

// Dia ou mês deve possuir dois dígitos
function formataDiaOuMes(n) {
    return ("00" + n).substr(-2, 2);
}

// Ano deve possuir quatro dígitos
function formataAno(n) {
    return ("0000" + n).substr(-4, 4);
}

// ENTRADA: ano-mes-dia SAIDA: dd-mm-yyyy
function formataData(data) {
    let [a, m, d] = data.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}-${m}-${a}`;
}