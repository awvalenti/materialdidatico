# Exercícios JavaScript

Para cada exercício a seguir, crie um arquivo com o código da resolução. Você pode chamar os arquivos de ```exercicio-1.js```, ```exercicio-2.js``` e assim por diante.

Para executar, você pode colar diretamente o código JavaScript no console do navegador, ou pode criar uma página HTML no mesmo diretório do arquivo js, referenciando-o. Assim, quando você abrir aquela página no navegador, o código será executado e o resultado deverá aparecer no console, se você tiver usado ```console.log```.

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
  1. ```var a = ''; if (typeof a === 'boolean') console.log('OK');```

  1. ```var a = ''; if (typeof a === 'number') console.log('OK');```

  1. ```var a = ''; if (typeof a === 'object') console.log('OK');```

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
    // push acrescenta elemento ao fim do vetor
    idades.push(idade);
    }
  } while (idade != -1);

  // INSERIR CÓDIGO AQUI
  for (var i = 0; i < idades.length; ++i) {
    // INSERIR CÓDIGO AQUI
  }

  console.log('Soma das idades:', soma);
  ```

1. Crie um vetor com alguns elementos quaisquer e atribua-o a uma variável. Faça as operações abaixo e verifique o que acontece com o vetor:
  1. atribuir um novo valor à propriedade ```length``` (ou seja, ```vetor.length = [novo tamanho]```)

  1. num vetor de tamanho 3, atribuir um valor à posição 5

  1. usar como índice um número em forma de string (como ```'3'```)

  1. usar como índice um texto (como ```'abc'```)

  1. usar como índice a palavra ```'length'```

## Série 2

1. No console de JavaScript do seu navegador, digite pelo menos dois valores de cada um dos seguintes tipos de dados:
  1. Número

  1. Booleano

  1. String

  1. Vetor

  1. Objeto

1. Para cada valor digitado no exercício anterior, atribua esse vetor a uma variável. Imprima o valor dessa variável usando os comandos ```alert``` e ```console.log```.

1. Imprima os números de 30 a 60 em passos de 3 (30, 33, 36, ...).

1. Leia duas strings do usuário. Determine qual tem o maior tamanho e determine se a outra está contida nela. Por exemplo, ```palavra``` está contida em ```Algumas palavras em um texto```.

1. Crie uma classe chamada ```Teste```. Ela deve possuir dois métodos, um que retorne sempre ```true``` e o outro que retorne sempre ```false```.

1. Modifique a classe ```Teste``` anterior para receber no seu construtor um valor booleano. O método que retornava sempre ```true``` agora deve retornar esse valor recebido no construtor. O método que retornava sempre ```false``` agora deve retornar o resultado oposto ao do outro método.

1. Considere o conceito matemático de intervalo fechado (exemplo: [5, 9]). Leia três valores inteiros: um limite inferior, um limite superior e um valor de teste. Verifique se o valor de teste pertence ao intervalo.

1. Incremente o exercício anterior. Crie uma classe chamada ```Intervalo```, com um construtor recebendo os limites inferior e superior e com um método ```contem```, que receba um valor e retorne um booleano indicando se ele está contido ou não naquele intervalo.
