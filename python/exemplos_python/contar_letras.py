frase = raw_input('Digite uma frase: ')

contador = {}

for caractere in frase:
    contador[caractere] = 0

for caractere in frase:
    contador[caractere] += 1

for caractere, quantidade in contador.iteritems():
    print "Caractere %c apapreceu %d vez(es)" % (caractere, quantidade)
