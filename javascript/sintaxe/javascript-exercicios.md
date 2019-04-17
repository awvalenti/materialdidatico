# Exercícios JavaScript

Parar criar uma página HTML referenciando um arquivo JavaScript, use o exemplo a seguir:

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <script src="exercicio-x.js"></script>
  </body>
</html>
```

## Série 1

1. Imprima ```"Ola, mundo!"``` de duas maneiras:
    1. na janela, usando a função ```alert```

    1. no console, usando a função ```console.log```

1. Usando a função ```prompt```, leia o nome do usuário e imprima ```"Ola, [nome do usuário]!"```. Use a função que preferir.

1. Em cada trecho de código a seguir, modifique somente o valor da variável ```a``` para que a saída seja ```OK```:
    1. ```a = ''; if (typeof a === 'boolean') console.log('OK');```

    1. ```a = ''; if (typeof a === 'number') console.log('OK');```

    1. ```a = ''; if (typeof a === 'object') console.log('OK');```

1. Imprima todos os números inteiros de 0 até 9 usando um laço ```for```.

1. Imprima todos os números inteiros de 11 a 45 usando um laço ```for```.

1. Leia duas strings do usuário. Determine qual tem o maior tamanho e imprima-a na tela.

1. A partir do trecho de código a seguir, incremente o valor da idade de ```p1``` e imprima o novo valor.
    ```javascript
    var p1 = { nome: 'Lucas', idade: 20 };
    ```

1. Usando o programa a seguir como base, faça com que seja lida uma sequência de idades até que o valor digitado seja ```-1```. Essas idades devem ser armazenadas em um vetor. Depois, percorra o vetor acumulando os valores das idades para imprimir a soma.
    ```javascript
    var idades = [];
    do {
      // INSERIR CÓDIGO AQUI

      if (idade != -1) {
        idades.push(idade);  // acrescenta elemento ao fim do vetor
      }
    } while (idade != -1);

    // INSERIR CÓDIGO AQUI
    for (var i = 0; i < idades.length; ++i) {
      // INSERIR CÓDIGO AQUI
    }

    console.log('Soma das idades:', soma);
    ```

1. Crie um vetor com alguns elementos quaisquer e atribua-o a uma variável. Faça as operações abaixo e verifique o que acontece com o vetor:
    1. atribuir um novo valor à propriedade ```length``` (ou seja, ```vetor.length = ...;```)

    1. num vetor de tamanho 3, atribuir um valor à posição 5

    1. usar como índice um número em forma de string (como ```'3'```)

    1. usar como índice um texto (como ```'abc'```)

    1. usar como índice a palavra ```'length'```

## Série 2

1. Usando o console JavaScript do seu navegador, invente dois valores de cada tipo de dados a seguir. Atribua cada valor a uma variável diferente e imprima-a usando ```console.log```:
    1. Número

    1. Booleano

    1. String

    1. Vetor

    1. Objeto

1. Imprima os números de 30 a 60 em passos de 3 (30, 33, 36, ...).

1. Leia duas strings do usuário. Determine qual tem o maior tamanho e determine se a outra está contida nela. Exemplos:
    - ```aba``` está contida em ```abacate```
    - ```aba``` está contida em ```Leia o item abaixo```
    - ```aba``` não está contida em ```Irineu Evangelista de Sousa```

1. Considere o conceito matemático de intervalo fechado (exemplo: [5, 9]). Leia três valores inteiros: um limite inferior, um limite superior e um valor de teste. Verifique se o valor de teste pertence ao intervalo e imprima essa informação como saída.

1. Crie uma classe chamada ```Teste```. Ela deve possuir dois métodos, um que retorne sempre ```true``` e o outro que retorne sempre ```false```. Crie um objeto dessa classe e use-o para chamar cada um dos métodos.

1. Modifique a classe ```Teste``` anterior para receber no seu construtor um valor booleano. O método que retornava sempre ```true``` agora deve retornar esse valor recebido no construtor. O método que retornava sempre ```false``` agora deve retornar o resultado oposto ao do outro método.

1. Faça a versão 2 do exercício de intervalos. Refatore a versão 1, ou seja, modifique seu código sem modificar seu comportamento. Crie uma função ```pertenceAIntervalo```, que receba um limite inferior, um limite superior e um valor de teste e devolva como resultado ```true``` se o valor de teste pertencer ao intervalo e ```false``` caso contrário. Faça o programa chamar essa função após os valores serem lidos do usuário.

1. Faça a versão 3 do exercício de intervalos refatorando a versão 2. Crie uma classe chamada ```Intervalo```. Seu construtor deve recebe os limites inferior e superior e armazená-los. Deve haver um método ```contem```, que receba um valor e retorne um booleano indicando se ele está contido ou não naquele intervalo. Faça o programa instanciar um objeto da classe ```Intervalo``` e chamar o método ```contem```.
 
