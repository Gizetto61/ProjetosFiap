'''
Crie um programa que receba como entrada quatro salários, 
calcule a média salarial e exiba os salários que estão abaixo da média
'''

# Sem Repetição

# variável acumuladora
somaSalario = 0
# Salário 1
# Entrada de dados
salario_1 = float(input('Salário: R$'))
# Atribuição de valor a somaSalario
somaSalario += salario_1
# Salário 2
salario_2 = float(input('Salário: R$'))
somaSalario += salario_2
# Salário 3
salario_3 = float(input('Salário: R$'))
somaSalario += salario_3
# Salário 4
salario_4 = float(input('Salário: R$'))
somaSalario += salario_4

# Cálculo da média
media = somaSalario / 4
# Impressão da média
print('---------------------------')
print(f'Media Salariál R${media}')
print('---------------------------')
# Condição para exibição: O salário tem de ser menor que a média
if salario_1 < media:
    print(f'Abaixo da média: R${salario_1:.2f}')
if salario_2 < media:
    print(f'Abaixo da média: R${salario_2:.2f}')
if salario_3 < media:
    print(f'Abaixo da média: R${salario_3:.2f}')
if salario_4 < media:
    print(f'Abaixo da média: R${salario_4:.2f}')

# Usando Listas
# Sem repetição
print('============================')
somaSalario = 0
# Criação de estrutura de dados: Lista
salarios = [0,0,0,0]
# Lista de índice 1
salarios[0] = float(input('Salário: R$'))
# Atribuição de valor a somaSalario
somaSalario += salarios[0]
# Lista de índice 2
salarios[1] = float(input('Salário: R$'))
somaSalario += salarios[1]
# Lista de índice 3
salarios[2] = float(input('Salário: R$'))
somaSalario += salarios[2]
# Lista de índice 4
salarios[3] = float(input('Salário: R$'))
somaSalario += salarios[3]

# Cálculo da média
media = somaSalario / 4
# Impressão da média
print('---------------------------')
print(f'Media Salariál R${media}')
print('---------------------------')
# Condição para exibição: O salário tem de ser menor que a média
if salarios[0] < media:
    print(f'Abaixo da média: R${salarios[0]:.2f}')
if salarios[1] < media:
    print(f'Abaixo da média: R${salarios[1]:.2f}')
if salarios[2] < media:
    print(f'Abaixo da média: R${salarios[2]:.2f}')
if salarios[3] < media:
    print(f'Abaixo da média: R${salarios[3]:.2f}')


# Usando Listas
# Laço de repetição While
print('============================')
somaSalario = 0
# Criação de estrutura de dados: Lista
salarios = [0,0,0,0]
# Variavel de controle
controle = 0
# Laço para armazenar e somar 4 salários diferentes
while controle < 4:
    salarios[controle] = float(input(f'{controle + 1}° Salário: R$'))
    somaSalario += salarios[controle]
    controle += 1
# Cálculo da média
media = somaSalario / 4
# Impressão da média
print('---------------------------')
print(f'Media Salariál R${media}')
print('---------------------------')
# Reinicialização da variável de controle
controle = 0
# Laço para verificar se 4 salários são menores que a média e exibir os que são
while controle < 4:
    if salarios[controle] < media:
        print(f'Abaixo da média: R${salarios[controle]}')
    controle += 1


# Usando Listas
# Laço de repetição For
print('============================')
# Criação de lista vazia
salarios = []
# Reinicialização de variáveis
somaSalario = 0
controle = 0
# Laço for para percorrer uma lista com 4 itens [0, 1, 2, 3]
# Ler e armazenar 4 salários na lista salarios
for controle in range(4):
    salario = float(input(f'{controle + 1}° Salário: R$'))
    somaSalario += salario
    # Adiciona indice na lista salarios
    salarios.append(salario)
# Cálculo da média com a quantidade de elementos da lista .len()
media = somaSalario / len(salarios)
# Impressão da média
print('---------------------------')
print(f'Media Salariál R${media}')
print('---------------------------')
# Laço for para percorrer os valores da lista. Ex: [10000, 5000, 2000, 8000]
for salario in salarios:
    # Analisar salário por salário
    if salario < media:
        print(f'Abaixo da média: R${salario:.2f}')

# Solicite ao usuário o número de salários
# Altere os elementos da lista
# imprima os salários acima da média também
print('============================')
# Usuário define a quantidade de salários 
qtdSalarios = int(input('Quantos salários você gostaria de adicionar? '))
# Reinicialização de lista e variáveis
salarios = []
controle = 0
somaSalario = 0
# Laço for para armazenar e coletar a quantidade de salários definida pelo usuário
for controle in range(qtdSalarios):
    salario = float(input(f'{controle + 1}° Salário: '))
    somaSalario += salario
    # Adição de índice na lista
    salarios.append(salario)
# Cálculo da média com a quantidade de elementos da lista .len()
media = somaSalario / len(salarios)
# Impressão da média
print('---------------------------')
print(f'Media Salariál R${media}')
print('---------------------------')
# Laço for para percorrer os valores da lista. Ex: [10000, 5000, 2000, 8000]
for salario in salarios:
    # Analisar salário por salário
    if salario < media:
        # Exibir abaixo da média
        print(f'Abaixo da média: -> R${salario:.2f}')
# Laço for para percorrer os valores da lista. Ex: [10000, 5000, 2000, 8000]
for salario in salarios:
    # Analisar salário por salário
    if salario > media:
        # Exibir acima da média
        print(f'Acima da média: -> R${salario:.2f}')