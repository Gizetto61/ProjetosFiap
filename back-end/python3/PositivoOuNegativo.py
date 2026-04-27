'''
Escreva um programa em pyhton que leia 10 números.
O programa deve armazená-los em uma lista e na sequência
imprimir apenas os números positivos
'''

# Lista numeros
numeros = []
positivos = []
negativos = []
# Variável para contágem de loop
contador, contador2 = 0, 0
# Laço para rodar 10 vezes
for i in range(10):
    # Entrada de dados
    numero = int(input(f'Digite o {i + 1}° número: '))
    # Adição de dados na lista
    numeros.append(numero)
# Laço para pegar elemento por elemento na lista
for numero in numeros:
    # Condicional para verificar se é positivo ou negativo
    if numero > 0:
        # Atribuição de índice na lista de positivos
        positivos.append(numero)
    elif numero < 0:
        # Atribuição de índice na lista de negativos
        negativos.append(numero)
    else:
        continue
# Números positivos
print('\nPositivos')
print('-------------------')
# Percorrer a lista e exibir os positivos
for i in positivos:
    print(i)
    # Contar a quantidade de positivos
    contador += 1
# Números negativos
print('\nNegativos')
print('-------------------')
# Percorrer a lista e exibir os negativos
for i in negativos:
    print(i)
    # Contar a quantidade de negativos
    contador2 += 1
# Exibição de contador
print('====================')
print(f'{contador} números positivos')
print(f'{contador2} números negativos')