numeros = []

print 'Digite numeros nao-negativos e um numero negativo para encerrar'

n = input()
while n >= 0:
    numeros.append(n)
    n = input()

print 'Soma: %d' % sum(numeros)
