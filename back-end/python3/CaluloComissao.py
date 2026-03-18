'''
Escreva um programa em Python para calcular a comissão de vendas
de um vendedor de peças. O programa deve obter o id do vendedor,
a quantidade de peças vendidas e o valor unitário de cada peça.
Ao final o programa deve calcular o total vendido pelo vendedor, 
e aplicar 5% de comissão sobre o total

O programa deve:
- Obter os dados da entrada
- Calcular o total vemdido e a comissão (5%)
- Apresentar os dados
'''

# Entrada de dados
id = int(input('Informe o seu ID: '))
totPecas = int(input('Quantas peças foram vendidas: '))
valorPecas = float(input('Quanto custa cada peça:R$'))

# Declaração de total de vendas (R$) e comissão
totVendas = totPecas * valorPecas
comissao = totVendas * 0.05

# Exibição de Resultado
print('O total de dinheiro arrecadado foi de R$', totVendas)
print('Sua comissão de 5% em cima de R$', totVendas, 'arrecadados é de R$', comissao)