# Exercícios DOM

1. Usando a API DOM em JavaScript, escreva um pequeno trecho de código exemplificando como:
   1. Obter o elemento ```head```

   1. Obter o elemento ```body```

   1. Escrever conteúdo HTML no fim do documento

   1. Obter a quantidade de filhos de um elemento

   1. Alterar o texto de um elemento existente

   1. Criar um novo elemento e acrescentá-lo como filho de outro elemento

1. Crie uma página HTML contendo uma lista não-ordenada com três itens e, abaixo da lista, três botões.
   1. Ao pressionar o primeiro botão, deve-se alterar o texto do __primeiro__ item da lista para algum outro valor.

   1. Ao pressionar o segundo botão, deve-se alterar o texto do __último__ item da lista para algum outro valor.

   1. Ao pressionar o terceiro botão, deve-se acrescentar um item novo à lista. Seu texto deve ser copiado do primeiro item.

1. Crie ou pegue pronta uma página HTML contendo uma tabela.
   1. Crie um botão acima da tabela que, quando clicado, altere o texto de alguma célula da segunda linha da tabela.

   1. Aplique o seguinte código CSS à página e veja o que muda: ```tr:hover { background-color: #dfefef; }```

   1. Aplique o seguinte código CSS à página:
  ```css
  tr.ativa { background-color: #abcdef; }
  tr.inativa { background-color: #eeeeee; }
  ```
  Faça com que, ao clicar com o botão esquerdo numa linha da tabela, essa linha se torne ativa e, ao clicar com o botão direito, ela se torne inativa. Para isso, deve-se acrescentar ao elemento ```tr``` a classe correspondente. Você pode usar o atributo ```className``` diretamente ou os métodos ```addClass``` e ```removeClass```.
