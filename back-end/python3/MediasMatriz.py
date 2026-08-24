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

# Função para pedir nome dos Alunos
def criarListaNomes(qtdAlunos):
    # Lista vazia
    nomes = []
    # Laço que roda a quantidade de alunos informada
    for i in range(qtdAlunos):
        # Entrada de nome
        nome = input(f'Digite o nome do Aluno {i + 1}: ')
        # Adição de nome a lista
        nomes.append(nome)
    # Retorno da lista
    return nomes

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
    # Laço que pega cada lista da matriz
    for linha in matriz:
        # Exibe lista por lista
        print(linha)

# Função que percorre a matriz e exibe as listas dentro dela
def mostrarNomes(nomes):
    # Exibe a lista
    print(nomes)

# Função que exibe as médias
def mostrarMedias(medias):
    # laço que percorre a quantidade de medias dentro da lista
    for i in range(len(medias)):
        # exibição de média por aluno
        print(f'Aluno {i + 1}: média = {medias[i]:.1f}')

# Função para conecar nomes à notas
def mostarResultados(nomes, medias):
    for i in range(len(nomes)):
        print(f'{nomes[i]}: Média = {medias[i]:.1f}')

# Main
print('--- Cálculo de Médias ---')
qtdAlunos = int(input('Informe a quantidade de alunos: '))
nomes = criarListaNomes(qtdAlunos)
matriz = criarLista(qtdAlunos)
print('\n--- Impressão de Nomes ---')
mostrarNomes(nomes)
print('\n--- Impressão de Notas ---')
mostrarMatriz(matriz)
print('\n--- Exibição de Médias ---')
medias = calcularMedias(matriz)
mostrarMedias(medias)
print('\n--- Relatório ---')
mostarResultados(nomes, medias)