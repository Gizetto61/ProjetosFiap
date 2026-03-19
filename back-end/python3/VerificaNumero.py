'''
Escreva um programa que receba um número, verifique se ele é
POSITIVO, NEGATIVO OU NEUTRO.
O programa deve imprimir uma mensagem ao usuário
'''

#Exibição de tema
print ('--- Verificação de Tema ---')

#Entrada de dados
n = int(input('Número: '))

#Verificação do Número (teste)
#Condição Aninhada
if n > 0:
    print ('Execução dentro do IF')
    print ('Positivo')
elif n < 0:
    print ('Execução dentro do ELIF')
    print ('Negativo')
else:
    print ('Execução dentro do ELSE')
    print ('Neutro')