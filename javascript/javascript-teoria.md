# Introdução a JavaScript

## Saída padrão
```javascript
alert('Ola, mundo! (em janela modal)');
console.log('Ola, mundo! (no console de JavaScript do navegador)');
```

## Entrada padrão (strings)
```javascript
var nome = prompt('Digite seu nome');
alert('Ola, ' + nome + '!');
```

## Comentário
```javascript
// Esta linha começa com duas barras e é um comentário
```

## Principais tipos de dados
```javascript
// Booleano (boolean)
true
false


// Número (number)
12
3.14


// Texto (string)
'Um texto usando aspas simples'
"Um texto usando aspas duplas"


// Objeto (object)
null

{
  'manga': 4,
  'laranja': 12,
  'banana': 15
}

{12: 'doze', 34: 'trinta e quatro'}


// Vetor (a rigor, é tudo object)
[]
[1, 2, 3]
['um', 'dois', 'tres']
[1, 'dois', 3.0]
[[0, 0], [0, 1], [1, 0], [1, 1]]


// Função (function)
function f() {
  return 10;
}

function g(a, b, c) {
  return a + b + c;
}
```

## Variáveis
São declaradas com ```var```.
```javascript
var a = 1;
var b = 2;
a = 3;
b += a + 1;
```

Variáveis não tem tipo. Podem receber valores de qualquer tipo.
```javascript
var x = 1;
var y = 'dois';
var z = [3, 4];
z = 5.0;  // atribuindo a z novamente. vetor anterior é perdido.
```

## Vetores
```javascript
var s = [0, 10, 20, 30];

// Tamanho
s.length  // 4

// Indexação
s[0]    // 0
s[1]    // 10
s[2]    // 20
s[3]    // 30

// Subvetor (cópia; não altera original)
s.slice(1, 3)  // [10, 20]

// Fazer cópia do vetor inteiro
var copia = s.slice();
```

## Igualdade
```javascript
1 == 1     // true
1 == '1'   // true
1 === 1    // true
1 === '1'  // false

1 != 1     // false
1 != '1'   // false
1 !== 1    // false
1 !== '1'  // true
```

## Condicionais, blocos, laços
Tudo igual a Java, exceto que, no ```for (int i = ...)```, troca-se ```int``` por ```var```.
```javascript
for (var i = 0; i < 10; ++i) {
  console.log(i);
}
```

## Funções
```javascript
function dizerOla(nome) {
  console.log('Ola, ', nome);
}

dizerOla('Jorge');
dizerOla('Zelia');
```

```javascript
function raizDaSomaDosQuadradosDosCatetos(cateto1, cateto2) {
  return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
}

function areaDoCirculo(raio) {
  return Math.PI * raio * raio;
}
```

## Classes
```javascript
function Pessoa(nome, idade) {
  this._nome = nome;
  this._idade = idade;
}

Pessoa.prototype.maiorDeIdade = function() {
  return this._idade >= 18;
};

Pessoa.prototype.getNome = function() {
  return this._nome;
};

var ulisses = new Pessoa('Ulisses', 39);
var iara = new Pessoa('Iara', 42);

if (ulisses.maiorDeIdade()) {
  console.log(iara.getNome());
}
```
