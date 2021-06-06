# Shell scripting com Bash

## Definições

### Terminal ou Console
- Dispositivo (físico ou virtual) que permite comunicação usando caracteres
- Algumas opções:
  - Mac
    - iTerm
  - Windows
    - CMD
    - PowerShell
    - Windows Terminal
  - Linux
    - XTerm
    - GNOME Terminal / MATE Terminal / xfce4-terminal / LXTerminal / Konsole
    - Terminator
    - Guake / Yakuake
    - Alacritty / Kitty

### Shell
- Software que interpreta comandos
- Algumas opções:
  - ash
  - bash
  - dash (sh)
  - fish
  - zsh
- Bash é o shell mais comum
- Cada um tem sua própria linguagem de scripts

## O que dá para fazer com shell scripting?
- Automatizar tarefas (renomear em massa, build de projetos)
- Aumentar produtividade no terminal (aliases, funções, prompt)
- Entender scripts (.bashrc, install.sh, nvm.sh)
- Criar aplicações (gerenciadores de arquivos, tocador de música, jogos)

## Comandos iniciais de shell
- ls: listar arquivos e diretórios
- cd: mudar de diretório
- echo: escrever na tela
- mkdir: criar diretório
- touch: criar arquivo
- rm: remover arquivo ou diretório
- mv: mover ou renomear arquivo ou diretório
- cp: copiar arquivo ou diretório
- cat: mostrar conteúdo de arquivo ou concatenar vários arquivos
- type: descobre o tipo das coisas (programa, comando interno etc.)

## Conteúdo
```bash
# Um comando por linha
echo Ola
echo mundo

# Vários comandos na mesma linha
echo Ola; echo mundo

# Código pode ser digitado diretamente no terminal
# ou pode ser salvo em um arquivo .sh ou .bash.

# Para executar o script:

## Execução direta
chmod +x script.sh
./script.sh
## Às vezes é colocada a linha shebang no início do script:
#!/bin/sh

## Execução por meio do bash explicitamente
bash script.sh

## Execução no modo sourced: altera o ambiente atual
source script.sh
. script.sh

# echo aceita qualquer número de argumentos e escreve todos eles
echo Ola, mundo!

# Aqui estamos passando apenas um argumento
echo 'Ola, mundo!'

# variáveis não precisam ser declaradas, basta atribuir.
# atribuições não devem ter espaços.
a=1
b=2

echo $a $b

# Escape usando contrabarra
echo R\$10

# Escape usando aspas e concatenação
echo R'$'10

# Errado
c=Um texto aqui

# Certo
c='Um texto aqui'
c="Um texto aqui"
echo $c

d='Minha    frase  com      espaços'

# Errado
echo $d

# Certo
echo "$d"

# Criando variáveis e já usando no mesmo comando
a=3 eval 'echo $a'
echo $a

# Substituição de variáveis
echo Minha    frase  com      espaços
echo "Minha    frase  com      espaços"

# Leitura de valores
read e f g
echo $e $f $g

# Redirecionamento de fluxo

## Saída padrão criando novo arquivo
echo oi > oi.txt
cat oi.txt

## Entrada
read h < oi.txt
echo $h

## Saída padrão acrescentando
echo 1 >> log.txt
echo 2 >> log.txt
echo 3 >> log.txt
cat log.txt

## Saída de erro
ls arquivo-nao-existente
ls arquivo-nao-existente > saida-padrao.txt
ls arquivo-nao-existente 2> saida-de-erro.txt

## Pipe: saída de um programa como entrada de outro
wc -l                # conta quantas linhas são digitadas
ls | wc -l           # quantos arquivos e diretórios
ls | grep x | wc -l  # quantos arquivos e diretórios contendo x

# OBS: evite processar a saída de ls, principalmente em scripts.
# Teoricamente, o comando correto a ser usado é o find.
# Na prática, muitas vezes, é bem difícil usá-lo.

# for
for arquivo in *
do
  echo "$arquivo"
done

for arquivo in *.txt; do
  echo "$arquivo"
done

for arquivo in *.js; do
  mv "$arquivo" "${arquivo/.js/.jsx}"
done

# Status de saída
echo mensagem
echo $?

ls
echo $?

cat arquivo-nao-existente
echo $?

ls -z
echo $?

comando-que-nao-existe
echo $?

ls && echo ls deu certo

ls -z && echo ls -z deu certo
ls -z || echo ls -z deu errado
ls -z; echo não sei se deu certo!

comando-1 && comando-2 && comando-3 && deu-certo || deu-errado

# if
if a
then
  b
elif c
then
  d
else
  e
fi

if a; then
  b
elif c; then
  d
else
  e
fi

if a; then
  b
else
  c
fi

if a; then
  b
fi

if ls; then
  echo ls deu certo
fi

if ls -z; then
  echo ls -z deu certo
else
  echo ls -z deu errado
fi

# test, [ ]
test texto = texto
echo $?

test texto = outro
echo $?

a=1
b=2
test $a = 1 && test $b = 2
echo $?
test $a = 3 || test $b = 2
echo $?
test $a = 4 && test $b = 5
echo $?

[ $a = 1 ] && echo um
[ $a = 2 ] && echo dois
[ "$a" = 1 ] && echo um
[ "$a" = 2 ] && echo dois

man test

# [[ ]]
a=1
[[ $a = 1 ]] && echo um
[[ $a = 2 ]] && echo dois
help [[

# {}
for i in 1 2 3 4; do
  echo $i
done

for i in {1..4}; do
  echo $i
done

alias k=kill
alias k9='kill -9'
alias ka=killall
complete -F kill k k9 ka
complete -F kill k{,9,a}

# Funções
f1()
{
  echo "Foi chamada com $1, $2, $3"
}

f1 10 20 30 40
f1

f2()
{
  for arg in "$@"; do
    echo "$arg"
  done
}

f2 primeiro segundo terceiro 'quarto  com    várias      palavras'

f3()
{
  var_f3=3
}
f3
echo $var_f3

f4()
{
  local f4_local=4
}
f4
echo $f4_local

f5()
(
  f5_local=5
)
f5
echo $f5_local

```

## Referências
- https://learnxinyminutes.com/docs/bash/ (guia rápido)
- https://www.gnu.org/software/bash/manual/ (manual de referência)

## Apresentação
- Terminal: Terminator 2.0.1 (https://github.com/gnome-terminator/terminator)
- Tema: Ambience (texto, fundo e paleta de cores)
- Opacidade: 98%
- Fonte: Fira Code Medium 12 (https://github.com/tonsky/FiraCode)
- Editor: vim-gtk3
- Visualizador: bat (https://github.com/sharkdp/bat)

