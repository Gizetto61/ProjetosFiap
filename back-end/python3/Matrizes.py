# Função para criar e retornar uma matriz numérica de NxM, fornecido pelo usuário.
def criarMatriz(linhas, colunas):
    matriz = []
    # Laço duplo para percorrer a quantidade de linhas e colunas desejadas
    for i in range(linhas):
        linha = []
        for j in range(colunas):
            n = int(input(f'Índice - [{i}] [{j}]\nNúmero: '))
            # Método para adicionar valor ao índice
            linha.append(n)
        # Adicionando linha à matriz
        matriz.append(linha)
    return matriz

# Função para imprimir OBJETO matriz
def imprimirObjeto(matriz):
    print(f'Matriz OBJETO: ', matriz)

# Função para imprimir elemento por elemento
def imprimirElementos(matriz):
    # Laço que verifica o tamanho da lista principal
    for i in range(len(matriz)):
        # Laço para verificar o tamanho das listas dentro da lista principal
        for j in range(len(matriz[i])):
            # Exibição de Matriz
            print(f'Matriz[{i}][{j}]: {matriz[i][j]}')

#MAIN
matriz = criarMatriz(3, 3)
imprimirObjeto(matriz)
imprimirElementos(matriz)