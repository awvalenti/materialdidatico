# TelaOO
Baixe o código-fonte base e implemente os dois métodos ```main```
contidos no projeto, um da parte 1, outro da parte 2.
Na parte 1, você deve mexer somente no ```main```. Na parte 2,
você pode mexer no ```main``` e também criar novas classes estendendo
```Retangulo```. Mantenha as classes ```TelaDePintura``` e ```TelaDeJogo``` intactas.

## Parte 1: TelaDePintura

### Métodos
- ```pintar(int x, int y)```: desenha um quadrado na posição (x, y)
- ```apagar(int x, int y)```: apaga um quadrado desenhado em (x, y)
- ```pausar(long milissegundos)```: pausa o programa pelo tempo
  especificado. Server para fazer animações simples.

### Exercícios
1. Desenhe pontos nas seguintes posições: (5, 5), (10, 5).
2. Desenhe uma linha reta começando em (0, 0) e indo até (10, 10).
3. Faça uma animação de uma linha reta sendo desenhada, do ponto
   (0, 0) a (40, 40). Sugestão:
   use uma pausa entre 50 e 200 milissegundos
   após pintar cada ponto.
4. (Opcional) Acrescente um novo passo à animação anterior:
   apague os pontos na sequência inversa, de (40, 40) a (0, 0).

## Parte 2: TelaDeJogo

### Métodos
- ```adicionarElemento(Retangulo r)```: adiciona um elemento à
  tela, para ser desenhado a cada 100ms. ```Retangulo``` é uma
  classe abstrata. É possível estendê-la para definir comportamentos
  personalizados. Para isso, deve-se sobrepor o método ```atualizarPosicao```.
- ```iniciarAnimacao()```: após todos os elementos terem sido
  adicionados, esse método deve ser chamado para iniciar o processo.

### Exercícios
1. Acrescente uma nave fixa na posição (0, 30) com largura 10
   e altura 3.
2. Faça com que um terceiro tiro
   seja disparado pela nave, sendo possível vê-lo após o segundo
   tiro sumir da tela.
3. Acrescente uma nave móvel, no topo da tela (y = 0),
   que se mova para a direita, sumindo da tela ao passar da lateral
   direita.
3. Acrescente uma nave móvel, na altura do meio da tela (y = 40),
   que fique se movimentando da esquerda para a direita, mudando
   sua direção ao encostar nas laterais da tela.
4. (Desafio) Acrescente poeira cósmica ao jogo: um quadrado 1x1 que se
   movimenta da esquerda para a direita em trajetória senoidal.
   Opcionalmente, faça com que, após bater na lateral da tela,
   ele volte à posição inicial.
5. (Desafio) Acrescente uma nave de tamanho 2x2 que apareça somente a cada
   10 quadros em uma posição aleatória da tela. Ela deve permanecer
   no jogo durante 5 quadros e depois sumir, reaparecendo somente
   após passarem-se outros 10 quadros.
