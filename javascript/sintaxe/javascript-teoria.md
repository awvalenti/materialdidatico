# Introdução a JavaScript

## Variáveis

### Declaradas com let: alteráveis
```javascript
let a = 1;
a = 3;        // OK: let permite alterar
```

### Declaradas com const: inalteráveis
```javascript
const b = 2;
b = 3;   // Erro: const não permite alterar
```

## Saída padrão
```javascript
alert('Ola, mundo! alert só funciona no navegador e exibe uma janelinha.');
console.log('Ola, mundo! console funciona no Node.js e no navegador (F12 > console).');
```

## Entrada padrão de strings (somente navegador)
```javascript
const nome = prompt('Digite seu nome');
alert('Ola, ' + nome + '!');
```

## Entrada padrão de números (somente navegador)
```javascript
const idade = Number(prompt('Digite sua idade'));
alert('Voce tem ' + idade + ' anos de idade');
```

## Comentário
```javascript
// Esta linha começa com duas barras e é um comentário
```

## Tipos de dados
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
`Um texto interpolando string: 1 + 2 = ${1 + 2}`


// Objeto (object)
{
  manga: 4,
  laranja: 12,
  banana: 15
}

{12: 'doze', 34: 'trinta e quatro'}

// Nomes de propriedades são sempre strings.
// manga vira "manga", 12 vira "12".


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


// undefined
undefined


// null é considerado objeto
null
```

Para verificar tipos de dados, use o operador ```typeof```.
```javascript
typeof true
typeof 10
typeof 'texto'
typeof {}
typeof function() {}
typeof undefined

typeof null
typeof ['meu-vetor']
typeof console.log
```

Variáveis não são tipadas. Podem receber valores de qualquer tipo.
```javascript
let x = 1;
let y = 'dois';
let z = [3, 4];
z = 5.0;  // z tinha um vetor, agora tem um número. O antigo vetor é perdido.
```

Cuidado: o operador ```+``` tem significados diferentes dependendo dos tipos
de dados envolvidos. Para números, soma. Para pelo menos uma string, concatena.

```Number(valor)``` pode ser usado para forçar a conversão e fazer a soma.

Já o operador ```-``` sempre subtrai, mesmo envolvendo strings. Ocorre conversão
automática.

```javascript
 3  +  2    // 5
'3' +  2    // '32'
 3  + '2'   // '32'
'3' + '2'   // '32'

3 + Number('2')   // 5

 3  -  2    // 1
'3' -  2    // 1
 3  - '2'   // 1
'3' - '2'   // 1
```

## Vetores
```javascript
const v = [0, 10, 20, 30];

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
const copiaDeV = v.slice();

// Insere novo elemento
v[4] = 40;

// Outra forma de inserir novo elemento
v.push(50);

// Reduz tamanho, removendo elementos
v.length = 2;

// Aumenta tamanho, deixando posições vazias
v.length = 10;
```

## Objetos
São diferentes de objetos em outras linguagens. Nem precisam de uma classe
para serem criados. A notação ```{}``` pode ser usada para criar objetos
literais, diretamente no código, com as propriedades especificadas.

```javascript
const pessoa1 = {
  nome: 'Joao',
  idade: 23
};

const pessoa2 = {
  nome: 'Maria',
  idade: 2
};

const obj = {
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

// Acrescentando propriedade
obj.d = 40;

// Removendo propriedade
delete obj.str;

console.log(obj);   // { a: 10, b: 20, c: 30, d: 40 }
```
Mais informações sobre objetos no [guia do MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)

## Igualdade
O operador ```==``` compara valor, mas desconsidera o tipo. Assim, o número
```1``` é considerado igual à string ```'1'```. O operador ```===``` compara
o valor e o tipo.

```javascript
1 ==   1    // true
1 ==  '1'   // true
1 ===  1    // true
1 === '1'   // false

1 !=   1    // false
1 !=  '1'   // false
1 !==  1    // false
1 !== '1'   // true
```

## Condicionais, blocos, laços
```while```, ```do``` e ```for``` iguais a Java, exceto:
```java
// for em Java: int
for (int i = 0; i < 10; ++i) {}
```
```javascript
// for em JavaScript: let
for (let i = 0; i < 10; ++i) {}
```
```java
// foreach em Java: com tipo e com dois-pontos
for (MinhaClasse meuObjeto : lista) {}
```
```javascript
// foreach em JavaScript: sem tipo e com of
for (meuObjeto of lista) {}
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

Lembrando estas definições:
<dl>
<dt>Parâmetro</dt><dd>Variável declarada na função</dd>
<dt>Argumento</dt><dd>Valor efetivamente passado para a função</dd>
</dl>

```javascript
// Declaração da função: aqui, vêm os parâmetros
function f(parametro1, parametro2) {}

// Chamada da função: aqui, vêm os argumentos
f('argumento1', 'argumento2');
```

Na chamada, podem-se passar argumentos de quaisquer tipos.
```javascript
// Tipo esperado foi passado: string
dizerOla('Joao');

// Tipo inesperado foi passado: objeto
dizerOla({ ops: 'vai dar ruim?' });
```

Na chamada, pode-se passar qualquer quantidade de argumentos.
```javascript
// Só um argumento: dentro do esperado
dizerOla('Joao');

// Nenhum argumento: parâmetro ficará com valor undefined
dizerOla();

// Mais de um argumento: o primeiro vai normalmente, os outros são ignorados
dizerOla('Maria', 'vai', 'com', 'as', 'outras');
```

## Classes
JavaScript não exige, mas permite, a definição de classes para criar objetos.
Nas versões antigas, usava-se ```function``` e ```prototype```.
Nas versões novas, usa-se a palavra reservada ```class```.

Por convenção, nomes de classes começam com maiúscula. Outra convenção
é o uso de ```_``` para iniciar nomes de propriedades ou métodos privados.
JavaScript não faz nenhum controle de acesso. Cabe ao programador só acessar
propriedades privadas quando estiver dentro da classe.

```javascript
class Pessoa {
  // Definição do construtor
  constructor(nome, idade) {
    this._nome = nome;      // Definição da propriedade _nome
    this._idade = idade;    // Definição da propriedade _idade
  }

  // Definição de um método
  maiorDeIdade() {
    return this._idade >= 18;
  }

  // Definição de outro método
  getNome() {
    return this._nome;
  }
}

// Criação de um objeto
const ulisses = new Pessoa('Ulisses', 39);

// Criação de outro objeto
const iara = new Pessoa('Iara', 42);

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
O comando ```debugger``` funciona como breakpoint.

Quando este comando for executado, o programa
será interrompido. Você terá a oportunidade de executar linha por linha,
conferir os valores das variáveis etc.

No navegador, o console precisa estar aberto. No VSCode, o programa precisa
ser executado com F5, em vez de CTRL+F5.

```javascript
console.log(1);
for (let i = 0; i < 10; ++i) {
  console.log(i);
  if (i >= 5) {
    debugger;
  }
}
```
