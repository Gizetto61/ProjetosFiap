'''
Calcular IMC com funções
'''

# Função MENU
def menu():
    opcao = 1
    while opcao != 0:
        print('--- MENU ---')
        print('1 - Peso')
        print('2 - Altura')
        print('3 - IMC')
        opcao = int(input('Digite uma opção para proseguir: '))
        match opcao:
            case 1:
                peso()
            case 2:
                altura()
            case 3:
                imc(peso, altura)
            case _:
                print('Opção Inválida')
        opcao = int(input('Digite 0 para parar: '))
    return imc
    
# Função armazena peso
def peso():
    peso = float(input('Digite o seu peso [kg]: '))
    return peso

# Função armazena altura
def altura():
    altura = float(input('Digite a sua altura [m]: '))
    return altura

# Função cálculo do IMC
def imc(peso, altura):
    imc = peso / pow(altura, 2)
    return imc

# Função de status
def status(imc):
    print(f'Seu IMC é {imc}')
    if imc < 18.5:
        print('Abaixo do Peso')
    elif imc < 24.99:
        print('Peso Normal')
    elif imc < 29.99:
        print('Sobrepeso')
    else:
        print('Obesidade')

# MAIN
imc = menu()
status(imc)