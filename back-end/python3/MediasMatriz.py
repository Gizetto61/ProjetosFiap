# Função para criar lista com base na quantidade informada
def criarLista(qtdAlunos):
    # lista vazia
    matriz = []
    # laço que percore o número de alunos
    for i in range(qtdAlunos):
        # exibição de aluno atual
        print(f'Aluno {i + 1}')
        # lista azia
        notas = []
        # laço que percorre 3 notas por aluno
        for j in range(3):
            # entrada de nota
            nota = float(input(f"Informe a {j + 1}ª nota: "))
            # nota entra na lista notas
            notas.append(nota)
        # notas entra na lista matriz
        matriz.append(notas)
    # retorno da matriz
    return matriz

# Função para calcular as médias dos alunos na matriz
def calcularMedias(matriz):
    # lista vazia
    medias = []
    # laço que pega as listas da lista principal
    for i in matriz:
        # daclaração de soma
        soma = 0
        # laço que pega os indices das listas um por um
        for j in i:
            # atribuição de valor a somatória
            soma += j
        # cálculo de média por aluno
        media = soma / len(i)
        # inserção da média na lista medias
        medias.append(media)
    # retorno de medias
    return medias

# Função que percorre a matriz e exibe as listas dentro dela
def mostrarMatriz(matriz):
    for linha in matriz:
        print(linha)

# Função que exibe as médias
def mostrarMedias(matriz):
    # chamada de função calcularMedias()
    medias = calcularMedias(matriz)
    # laço que percorre a quantidade de medias dentro da lista
    for i in range(len(medias)):
        # exibição de média por aluno
        print(f'Aluno {i + 1}: média = {medias[i]:.1f}')

# Main
print('--- Cálculo de Médias ---')
qtdAlunos = int(input('Informe a quantidade de alunos: '))
matriz = criarLista(qtdAlunos)
print('\n--- Impressão de Notas ---')
mostrarMatriz(matriz)
print('\n--- Exibição de Médias ---')
mostrarMedias(matriz)