'''
Crie um programa que leia 5 nomes e exiba os 
nomes, os iniciados com VOGAIS e iniciados
com CONSOANTES
'''

# Listas
nomes, iniciaVogal, iniciaConsoante = [], [], []
# Contadores
contVog, contCons = 0, 0
# Laço de 5 repetições
for i in range(5):
    nome = input(f'Digite o {i + 1} nome: ')
    # Acrécimo de nome à lista
    nomes.append(nome)
# Laço para percorrer nome por nome
for nome in nomes:
    # Condição para avaliar o índice 0 da string nome
    match nome[0]:
        # Caso comece com A
        case 'A':
            # adiciona nome em iniciaVogal
            iniciaVogal.append(nome)
            contVog += 1
        # Caso comece com E
        case 'E':
            # adiciona nome em iniciaVogal
            iniciaVogal.append(nome)
            contVog += 1
        # Caso comece com I
        case 'I': 
            # adiciona nome em iniciaVogal
            iniciaVogal.append(nome)
            contVog += 1
        # Caso comece com O
        case 'O':
            # adiciona nome em iniciaVogal
            iniciaVogal.append(nome)
            contVog += 1
        # Caso comece com U
        case 'U':
            # adiciona nome em iniciaVogal
            iniciaVogal.append(nome)
            contVog += 1
        case _:
            # adiciona nome em iniciaConsoante
            iniciaConsoante.append(nome)
            contCons += 1
# Exibição de nomes
print('=======================')
print('---------Nomes--------')
for nome in nomes:
    print(nome)

# Exibição de Vogais
print('=======================')
print('---------Vogais--------')
for nome in iniciaVogal:
    print(nome)
print(f'{contVog} iniciam com vogal')

# Exibição de Consoantes
print('=======================')
print('-------Consoantes------')
for nome in iniciaConsoante:
    print(nome)
print(f'{contCons} iniciam com consoante')