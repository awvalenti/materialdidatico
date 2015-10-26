class Pessoa:
    def __init__(self, nome, idade):
        self._nome = nome
        self._idade = idade

    def maior_de_idade(self):
        return self._idade >= 18

    def nome(self):
        return self._nome

pessoas = [
    Pessoa('Joana', 29),
    Pessoa('Joao', 34),
    Pessoa('Joaozinho', 0),
]

print "Maiores de idade:"

for p in pessoas:
    if (p.maior_de_idade()):
        print p.nome()
