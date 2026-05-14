'''
Crie um programa em python que permita cadastrar cinco nomes de jogos em uma lista.
O programa deve mostrar todos os jogos cadastrados, permitindo também,
adicionar e remover um jogo e ordenar a lista com os jogos. Ao final exiba a 
lista atualizada
'''
# Funções
# Cadastrar cinco Jogos
def cadastrarJogos(jogos):
    for c in range(5):
        jogo = input(f'Digite o nome do {c + 1}° jogo: ').strip().lower()
        jogos.append(jogo)
    return jogos
# Adicionar jogo a lista
def adicionarJogos(cadastroJogos):
    exibirLista(cadastroJogos)
    novoJogo = input('informe o jogo que deseja adicionar: ').strip().lower()
    cadastroJogos.append(novoJogo)
    return cadastroJogos
# Remover jogo da lista
def removerJogos(cadastroJogos):
    exibirLista(cadastroJogos)
    removerJogo = input('Informe o jogo que deseja remover: ').strip().lower()
    cadastroJogos.remove(removerJogo)
    return cadastroJogos
# Ordenar a lista
def ordenarLista(cadastroJogos):
    return cadastroJogos.sort()
# exibir a lista
def exibirLista(cadastroJogos):
    contador = 1
    print('--- Lista de Jogos ---')
    for jogo in cadastroJogos:
        print(f'{contador} - {jogo}')
        contador += 1

# MAIN
# Listas
jogos, cadastroJogos = [], []
escolha = 'sim'
# laço de controle
while escolha == 'sim':
    # MENU
    opcao = int(input('1 - Cadastrar cinco jogos\n2 - Adicionar novo jogo\n3 - Remover jogo\n4 - Ordenar jogos\n5 - Exibir jogos\n-> '))
    # Condicional avaliando opção escolhida
    match opcao:
        # cadastarJogos()
        case 1:
            cadastroJogos = cadastrarJogos(jogos)
        # adicionarJogos()
        case 2:
            # Se a lista estiver vazia
            if not cadastroJogos:
                print('A lista está vazia')
                continue
            else:
                cadastroJogos = adicionarJogos(cadastroJogos)
        # removerJogos()
        case 3:
            if not cadastroJogos:
                print('A lista está vazia')
                continue
            else:
                cadastroJogos = removerJogos(cadastroJogos)
        # ordenarLista()
        case 4:
            if not cadastroJogos:
                print('A lista está vazia')
                continue
            else:
                cadastroJogos = ordenarLista(cadastroJogos)
        # exibirLista()
        case 5:
            if not cadastroJogos:
                print('A lista está vazia')
                continue
            else:
                exibirLista(cadastroJogos)
        # Tratamento de erros
        case _:
            print('Escolha inválida!')
    escolha = input('Deseja continuar? ').strip().lower()