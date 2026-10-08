# Recursão
# Fatoruial de n
'''
O fatorial de um número n é representado por um n!. 
É a multiplicação de todos os inteiros até n. 
Podemos definir que 5! = 5 x 4 x 3 x 2 x 1
'''

def fatorial(n):
    #Caso base
    #Condição de parada
    if n == 1 or n == 0:
        return 1

    return n * fatorial(n - 1)

#MAIN
resultado = fatorial(5)
print(f'Fatorial: {resultado}')