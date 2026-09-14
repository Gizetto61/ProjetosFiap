'''
Giovanni Zorzetto Oliveira - Rm569464
'''

# Questão 1
# listarAlunos(alunos)
def listarAlunos(alunos):
    print('Alunos Cadastrados:')
    # Laço que pega a chave de cada aluno e exibe um por um
    # keys() -> pega a chave
    for aluno in alunos.keys():
        print(aluno)

# Questão 2
# calcularMedia(alunos)
def calcularMedia(alunos):
    soma, media = 0, 0
    # laço que pega o valor de cada chave do dicionario e atribui à soma
    # values() -> pega o valor
    for nota in alunos.values():
        soma += nota
    # média
    media = soma / len(alunos)
    return media

# Questão 3
# exibirNotas()
def exibirNotas(alunos):
    print('Alunos e suas Notas')
    # Laço que pega a chave e o valor do dicionário um por um
    # itens() -> pega chave e valor
    for chave, valor in alunos.items():
        print(f"{chave}: {valor}")

# Questão 4
# consultarNota(alunos, nome)
def consultarNotas(alunos, nome):
    # Verifica se nome está na lista
    if nome in alunos.keys():
        nota = alunos.get(nome)
    else:
        nota = None
    return nota

# Questão 5
# listarAprovados(alunos, mediaMinima)
def listarAprovados(alunos, mediaMinima):
    # Lista vazia
    aprovados = []
    # Laço que pega chave e valor
    for nome, nota in alunos.items():
        # Verificação
        if nota >= mediaMinima:
            aprovados.append(nome)
    return aprovados

# Questão 6
# lerNota()
def lerNota():
    while True:
        try:
            mediaMin = float(input('\nDigite a nota mínima para a aprovação: '))
            notaFloat = float(mediaMin)
            print(notaFloat)
            break
        except ValueError:
            print('Entrada inválida! Digite uma nota válida')
    return notaFloat

# Questão 7
# adicionarAluno(alunos, nome, nota)
def adicionarAluno(alunos, nome, nota):
    if nome in alunos.keys():
        return False
    else:
        alunos[nome] = nota
        return True

# Questão 8
# Código junto
def controle(alunos):
    nome = input("Digite o nome do aluno: ")
    nota = consultarNotas(alunos, nome)
    if nota == None:
        print(f'O aluno {nome} não está cadastrado')
        opcao = input('Deseja cadastrar? [s/n] ')
        if opcao == 's':
            nota = float(input("Informe a nota: "))
            adicionarAluno(alunos, nome, nota)
            print(alunos, '\n\nAluno(a) cadastrado!')
            consultarNotas(alunos, nome)
    print(f'\nNota de {nome}: {nota}')
    mediaMin = lerNota()
    aprovados = listarAprovados(alunos, mediaMin)
    print('\nAlunos Aprovados: ')
    for i in aprovados:
        print(i)

alunos = {
    "Ana": 8.5,
    "Bruno": 6.0,
    "Carlos": 9.0,
    "Daniel": 7.5,
    "Eduardo": 5.5
}

# listarAlunos(alunos)
# media = calcularMedia(alunos)
# print(f'Média da turma: {media:.1f}')
# exibirNotas(alunos)
# nota = consultarNotas(alunos, "Fernanda")
# print(nota)
# aprovados = listarAprovados(alunos, 7.0)
# print(aprovados)
# lerNota()
# adicionarAluno(alunos, "Fernanda", 8.0)
# print(alunos)
controle(alunos)