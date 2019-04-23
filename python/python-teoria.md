# Introdução a Python 3

## Saída padrão
```python
print('Ola, mundo!')
```

## Entrada padrão (strings)
```python
nome = input()
print('Ola, ' + nome + '!')
```

```python
nome = input()
print('Ola, %s!' % nome)
```

## Entrada padrão (int)
```python
numero = int(input())
print('Sucessor: %d' % (numero + 1))
```

## Comentário
```python
# Esta linha começa com cerquilha e é um comentário
```

## Principais tipos de dados
```python
# Booleano (bool)
True
False

12    # Inteiro normal (int)
12L   # Inteiro longo (long)
3.14  # Ponto flutuante (float)

# Texto Unicode (string)
'Um texto usando aspas simples'
"Um texto usando aspas duplas"

# Lista (list)
[]
[1, 2, 3]
['um', 'dois', 'tres']
[1, 'dois', 3.0]
[[0, 0], [0, 1], [1, 0], [1, 1]]

# Tupla (tuple)
()
(1, 2, 3)
(0, 'Zero')

# Dicionário (dict)
{
	'monte': 'Elevacao de terreno',
	'piton': 'Serprente da Asia e da Africa, nao venenosa',
	'monty python': 'Programa televisivo humoristico britanico'
}

{
	'manga': 4,
	'laranja': 12,
	'banana': 15
}

{12: 'doze', 34: 'trinta e quatro'}
```

## Variáveis
Não precisam ser declaradas; basta fazer ```nome_var = valor```
```python
a = 1
b = 2
```

Variáveis não têm tipo. Podem receber valores de qualquer tipo.
```python
x = 1
y = 'dois'
z = [3, 4]
z = 5.0  # atribuindo a z novamente. lista anterior é perdida.
```

## Manipulação de listas ou strings
```python
lista = [0, 10, 20, 30]

# Tamanho
len(lista)  # 4

# Indexação na ordem direta
lista[0]    # Primeiro: 0
lista[1]    # Segundo:  10
lista[2]    # Terceiro: 20
lista[3]    # Quarto:   30

# Indexação na ordem inversa
lista[-1]   # Último:             30
lista[-2]   # Penúltimo:          20
lista[-3]   # Antepenúltimo:      10
lista[-4]   # Um antes do a.p.u.: 0

# Cópia da lista
copia = lista[:]

# Sublista a partir de certo índice (fechado no início - inclui o primeiro)
lista[1:]   # [10, 20, 30]
lista[2:]   # [20, 30]
lista[3:]   # [30]
lista[4:]   # []

# Sublista até certo índice (aberto no fim - *exclui* o último)
lista[:1]   # [0]
lista[:2]   # [0, 10]
lista[:3]   # [0, 10, 20]
lista[:4]   # [0, 10, 20, 30]

# Sublista de um índice a outro (fechado no início, aberto no fim)
lista[1:3]  # [10, 20]
lista[1:3] = [15, 25]   # Altera a lista para [0, 15, 25, 30]
```

## Igualdade
```python
# Verificando se o conteúdo é igual
lista == lista   # True
lista == copia   # True

# Verificando se o conteúdo é diferente
lista != [1, 2]  # True
lista != lista   # False
lista != copia   # False

# Verificando se o objeto é o mesmo (i.e., estão na mesma posição de memória)
lista is lista   # True
copia is lista   # False
```

## Condicional
```python
a = 2
if a == 2: print('a vale 2')
```
```python
if resposta == 'sim' and esta_funcionando: print('ok')
```
```python
if resposta == 'nao' or not esta_funcionando: print('erro')
```

## Blocos
Python usa indentação significativa. A indentação determina a existência
de um bloco. Não existe abre/fecha chaves (`{}`), BEGIN/END nem nada parecido.

```python
print('Deseja continuar?')

continuar = input()

if continuar == 'sim':
	print('Continuando')
	print('...')
elif continuar == 'nao':
	print('Encerrando')
else:
	print('Erro. Favor digitar sim ou nao.')
```

## Laços
```python
for i in range(10): print(i)   # numeros de 0 a 9
```

```python
for i in range(3):
	print('Estamos no %d. Deseja continuar?' % i)
	continuar = input()
	if (continuar == 'nao'): break
```

```python
i = 0
continuar = input()
while continuar != 'nao':
	print(i)
	i += 1
	continuar = input()
```

## Funções
```python
def dizer_ola(nome):
	print('Ola, %s!' % nome)

dizer_ola('Jorge')
dizer_ola('Zelia')
```

```python
import math

def hipotenusa(um_cateto, outro_cateto):
	return math.sqrt(um_cateto ** 2 + outro_cateto ** 2)

def area_do_circulo(raio):
	return math.pi * raio ** 2
```

## Classes
```python
class ClasseSemAtributos:
		def __init__(self):
				print('Construtor foi chamado')

		def metodo_1_sem_retorno(self):
				print('Metodo 1 foi chamado')

		def metodo_2_com_retorno(self):
				print('Metodo 2 foi chamado')
				return 200

obj1 = ClasseSemAtributos()
obj1.metodo_1_sem_retorno()

obj2 = ClasseSemAtributos()
valor = obj2.metodo_2_com_retorno()
```

```python
class Pessoa:
		def __init__(self, nome, idade):
				self._nome = nome
				self._idade = idade

		def maior_de_idade(self):
				return self._idade >= 18

		def nome(self):
				return self._nome

ulisses = Pessoa('Ulisses', 39)
iara = Pessoa('Iara', 42)
```

## Mais
- Operadores: http://www.learnpython.org/en/Basic_Operators
- Funções map, reduce, filter: https://pythonhelp.wordpress.com/2012/05/13/map-reduce-filter-e-lambda/
