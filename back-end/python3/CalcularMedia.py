'''
Escreva um programa em Python para calcular a média aritmética de 3 notas.
O programa deve receber as notas, calcular e imprimir a média obtida.
Além disso deve verificar a condição de aprovação do aluno. (Aprovado ou Reprovado)
'''

#Exibição no terminal do Tema
print ('--- Calculando uma Média ---')

#Entrada de dados
n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
n3 = float(input('Nota 3: '))

#Processamento
#Calculo da média
media = ( n1 + n2 + n3 ) / 3

#Saída de dados
print ('Media: ', media)

#Verificação do status do aluno (teste)
if media >= 6:
    print ('Aprovado!')
else:
    print('Reprovado!')
