'''
Escreva um programa em Python que solicite ao usuário a entrada de um número inteiro e,
em seguida, exiba a tabuada desse número de 1 até onde o usuário desejar.
'''
print('---- Bem vindo à TABUADA ----')
#Entrada de Dados
num = int(input('Digite o número para ver a tabuada: '))
multi = int(input('Digite até que número você quer multiplicar: '))
#Laço até onde o usuário quer
i = 1
#Enquanto o contador for menor ou igual ao número de operaações
while i <= multi:
    print(f'[{num}] * [{i}] = [{num * i}]')
    i += 1