### Status
[![Build Status](https://travis-ci.com/vixtorocha/cs-2019-01.png)](https://travis-ci.com/vixtorocha/cs-2019-01)

Projetos da discuplina de Construção de Software, do 5º período de Engenharia de Software na UFG.

O objetivo é aprender boas práticas de construção de software, como boa documentação e testes de unidade.

## Aula-01
Implementa 21 algoritmos, tanto em **java** quanto em **javascript**. Entre eles há funções que verificam propriedades numéricas, calculam fatoriais e potencias, além de funções que validam datas e CPF.

## Aula-07
O objetivo da aula 07 é se familiarizar com as formas de iterar um vetor em java e em javascript. Nesta aula, foi implementado nas duas linguas:
- Algoritmo que recupera a **menor temperatura** em um vetor de temperaturas.
- Um algoritmo que **soma todos os números ímpares** em um vetor.
- Conta **quantos elementos** no primeiro vetor **se repetem** no segundo.
- Calcula a **quantidade de cada letra** em uma sequência.
- Encontra a **palavra mais frequente** em uma frase.
- Encontra o **número mais sorteado** em um sorteio de 1 milhão de números de um a mil.

## Aula-08
O objetivo da aula 08 é trabalhar com manipulação de arquivos em java. Há três programas:
- Inteiro
Retorna os primeiros quatro bits em um arquivo no formato hexadecimal.
- Jpeg
Verifica se um arquivo fornecido é no formato jpeg
- Encontre (não implementado)
Procura por uma palavra em um arquivo de texto.

## Aula-11
O objetivo da aula 11 é criar uma **RESTFul API** usando o **springboot**.

O programa da aula 11 obtem duas datas, calcula a diferença de dias entre elas e retorna em um documento **JSON** para que o resultado seja exibido no navegador

## Aula-12
O programa da aula-12 funciona como o da aula-11 (ou seja, usando uma *RESTFul API*).

Entretando, neste programa, é fornecido um número inteiro como argumento e o programa retorna sua **escrita por extenso**.

**Instruções para executar:** Com um terminal/shell aberto na pasta da aula-12, execute:
```sh
mvn package -P api
java -jar target/api.jar 
```
Abra a interface gráfica. Isso pode ser feito abrindo manualmente o index.html na pasta gui da aula-12.

