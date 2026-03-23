'''
Escreva um programa em Python para calcular a média aritmética de três notas
O programa deve receber as três notas do usuário, calcular a média e
apresentar o resultado.
'''

# Declaração de variáveis por entrada de dados do usuário
n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
n3 = float(input('Digite a terceira nota: '))

# Declaração da 'Média'
media = (n1 + n2 + n3) / 3

# Exibição de Resultado
print('Nota 1: ', n1)
print('Nota 2: ', n2)
print('Nota 3: ', n3)
print('Média: ', media)

if media >= 6 and media < 10:
    print('Aprovado!')
elif media < 6:
    print('Reprovado!')
else:
    print('Nota Troglodita!')
