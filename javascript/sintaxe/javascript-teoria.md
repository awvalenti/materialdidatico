# Introdução a JavaScript

## Variáveis
São declaradas com ```var```.
```javascript
var a = 1;
var b = 2;
a = 3;
b += a + 1;
```

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

## Entrada padrão (números)
```javascript
var idade = Number(prompt('Digite sua idade'));
alert('Voce tem ' + idade + ' anos de idade');
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

Variáveis não são tipadas. Podem receber valores de qualquer tipo.
```javascript
var x = 1;
var y = 'dois';
var z = [3, 4];
z = 5.0;  // z tinha um vetor, agora tem um número. O antigo vetor é perdido.
```

## Vetores
```javascript
var v = [0, 10, 20, 30];

// Tamanho
v.length  // 4

// Indexação
v[0]    // 0
v[1]    // 10
v[2]    // 20
v[3]    // 30

// Subvetor (cópia; não altera original)
v.slice(1, 3)  // [10, 20]

// Fazer cópia do vetor inteiro
var copiaDeV = v.slice();
```

## Objetos
São diferentes de objetos em outras linguagens. Nem precisam de uma classe
para serem criados. A notação ```{}``` pode ser usada para criar objetos
literais, diretamente no código, com as propriedades especificadas.

```javascript
var pessoa1 = {
  nome: 'Joao',
  idade: 23
};

var pessoa2 = {
  nome: 'Maria',
  idade: 2
};

var obj = {
  a: 1,
  b: 2,
  c: 3,
  str: 'teste'
};

// Leitura de propriedades usando ponto
obj.a    // 1
obj.b    // 2
obj.c    // 3
obj.str  // 'teste'

// Leitura de propriedades usando colchetes
obj['a']    // 1
obj['b']    // 2
obj['c']    // 3
obj['str']  // 'teste'

// Escrita em propriedades
obj.a = 10;
obj['b'] = 20;
obj.c = obj.a + obj.b;
console.log(obj['c']);   // 30
```
Mais informações sobre objetos no [guia do MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)

## Igualdade
O operador ```==``` compara valor, mas desconsidera o tipo. Assim, o número
```1``` é considerado igual à string ```'1'```. O operador ```===``` compara
o valor e o tipo.

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
Apesar de JavaScript não exigir uma classe para criar um objeto, classes podem
ser criadas. Na versão mais nova do JavaScript, existe a palavra reservada
```class```. Porém, o jeito tradicional de criar classes é usando funções.

Qualquer função pode ser usada como classe. Nesse caso, ela atua como construtor
e, por convenção, seu nome deve começar com letra maiúscula. Outra convenção
é o uso de ```_``` para iniciar nomes de propriedades ou métodos privados.
JavaScript não faz nenhum controle de acesso. Cabe ao programador não chamar
métodos privados fora da classe.

```javascript
// Construtor da classe Pessoa
function Pessoa(nome, idade) {
  this._nome = nome;      // Cria uma nova propriedade no objeto chamada _nome
  this._idade = idade;    // Cria uma nova propriedade no objeto chamada _idade
}

// Definição de um método da classe Pessoa
Pessoa.prototype.maiorDeIdade = function() {
  return this._idade >= 18;
};

// Definição de outro método da classe Pessoa
Pessoa.prototype.getNome = function() {
  return this._nome;
};

// Criação de um objeto
var ulisses = new Pessoa('Ulisses', 39);

// Criação de outro objeto
var iara = new Pessoa('Iara', 42);

// Chamada de um método
if (ulisses.maiorDeIdade()) {
  // Chamada de outro método
  console.log(ulisses.getNome() + " e' maior de idade");
}

// Chamada de um método
if (iara.maiorDeIdade()) {
  // Chamada de outro método
  console.log(iara.getNome() + " e' maior de idade");
}
```

## Depuração
O comando ```debugger``` pode ser colocado em qualquer parte do código.
Ele terá efeito somente se o console do navegador estiver aberto.
Quando a linha do ```debugger``` for executada, o programa
será interrompido. Você terá a oportunidade de executar linha por linha,
conferir os valores das variáveis etc.
```javascript
console.log(1);
for (var i = 0; i < 10; ++i) {
  console.log(i);
  if (i >= 5) {
    debugger;
  }
}
```
