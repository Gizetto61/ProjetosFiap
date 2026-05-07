'''
1. Função para obter o tamenho de uma lista
2. Função para criar/preencher(popular) a lista
3. Função para imprimir os elementos da lista
4. Função para imprimir os PARES
5. Função para imprimir os IMPARES
6. Função para retornar uma lista com PARES
7. Função para retornar uma lista com IMPARES
'''

# Função para definir o tamanho da lista
def tamanho_lista():
    print('--- TAMANHO DA LISTA ---')
    tamanho = int(input('Tamanho: '))
    return tamanho

# Função para criar e popular a lista
def criar_lista(tamanho):
    print('--- CRIAR LISTA ---')
    lista = []
    i = 0
    while i < tamanho:
        item = int(input(f'Digite o {i + 1}° item: '))
        lista.append(item)
        i += 1
    return lista

# Função para imprimir a lista
def imprimir_lista(lista):
    print('--- IMPRIMIR ---')
    cont = 1
    for item in lista:
        print(f'Item {cont}: {item}')
        cont += 1

# Função para identificar PARES
def imprimir_pares(lista):
    print('--- PARES ---')
    cont = 1
    for item in lista:
        if item % 2 == 0:
            print(f'{cont}° Item par: {item}')
            cont += 1
        else:
            continue

# Função para identificar IMPARES
def imprimir_impares(lista):
    print('--- IMPARES ---')
    cont = 1
    for item in lista:
        if item % 2 != 0:
            print(f'{cont}° Item impar: {item}')
            cont += 1
        else:
            continue

# Função para retornar lista de PARES
def lista_pares(lista):
    print('--- LISTA PARES ---')
    pares = []
    for item in lista:
        if item % 2 == 0:
            pares.append(item)
    return(pares)

# Função para retornar lista de IMPARES
def lista_impares(lista):
    print('--- LISTA IMPARES ---')
    impares = []
    for item in lista:
        if item % 2 != 0:
            impares.append(item)
    return(impares)

# Programa Principal
tamanho = tamanho_lista()
lista = criar_lista(tamanho)
imprimir_lista(lista)
imprimir_pares(lista)
imprimir_impares(lista)
pares = lista_pares(lista)
impares = lista_impares(lista)
print(pares)
print(impares)