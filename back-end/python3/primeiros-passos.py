print ('Hello World!!!')

n = 10 #int
N = 5.2 #float
nome = 'FIAP' #String
teste = True #Boolean
meu_nome = 'Giovanni' #Atribuição de Giovanni para meu_nome

print (meu_nome) #Imprimindo conteúdo de variável

print ('Olá, ', meu_nome) #Concatenação

'''Escreva um programa em Python para 
calcular a média de três notas aritméticas. 
O programa deve apresentar a média obtida.

Ling. Narrativa
1) Obter as Notas
2) Calcular a Média
    2.1) Somar as Notas
    2.2) Dividir pela quantidade de Notas
3) Apresentar a Média
'''

#Declaração das Notas
nota1 = 8.0
nota2 = 5.5
nota3 = 7.25
#Cálculo da Média
media = (nota1 + nota2 + nota3) / 3
#impressão da Média
print('Sua média é: ', media)

#Programa de média com a entrada do usuário
#comando para pedir ao usuário
n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
n3 = float(input('Nota 3: '))
#Calculo da Média
mediaUsu = (n1 + n2 + n3) / 3
#Impressão da Média
print ('A média das notas digitadas é: ', mediaUsu)