# Calculadora com FUNÇÕES

# Função MENU
def menu():
    opcao = -1
    while opcao < 1 or opcao > 4:
        print('------ MENU ------')
        print('1 - Adição')
        print('2 - Subtração')
        print('3 - Multiplicação')
        print('4 - Divisão')
        print('0 - Sair')
        opcao = int(input('Opção -> '))
        if opcao == 0:
            break
    return opcao

# Função ENTRADA DE DADOS
def entrada_dados():
    print('--- Entrada de Dados ---')
    numero = int(input('Número: '))
    return numero

# Função ADIÇÃO
def add(n1, n2):
    print('--- Adição ---')
    return n1 + n2

# Função SUBTRAÇÃO
def sub(n1, n2):
    print('--- Subtração ---')
    return n1 - n2

# Função MULTIPLICAÇÃO
def multi(n1, n2):
    print('--- Multiplicação ---')
    return n1 * n2

# Função DIVISÃO
def div(n1, n2):
    print('--- Divisão ---')
    return n1 / n2

# Função EXIBIÇÃO
def imprimir(resultado):
    print('--- Imprimir ---')
    print(f'Resultado: {resultado}')

# Função CONTROLADORA
def controlador(opcao, n1, n2):
    print('--- Controlador ---')
    # Verificação do valor de opção
    match opcao:
        case 1:
            resultado = add(n1, n2)
        case 2:
            resultado = sub(n1, n2)
        case 3:
            resultado = multi(n1, n2)
        case 4:
            resultado = div(n1, n2)
    return resultado

# Principal (Main)

# Variável para armazenar o retorno da função menu()
opcao = menu()
# Variáveis para armazenar o retorno da função entrada_dados()
n1 = entrada_dados()
n2 = entrada_dados()
resultado = controlador(opcao, n1, n2)
imprimir(resultado)