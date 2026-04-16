'''
Cálculo de par

# Variavel de controle
controle = 0
# Laço para contar de 0 a 10
while controle <= 10:
    # Condição para identificação de pares
    if controle % 2 == 0:
        print(f'{controle} é par')
    # Atribuição de valores para evitar loop infinito
    controle += 1
'''


'''
Cálculo de par com usuário definindo início e fim
'''
while True:
    #Entrada de Dados
    inicio = int(input('Início: '))
    fim = int(input('Fim: '))
    # Contador para quantidade de pares ou impares
    contador = 0
    # Condição para verificar se início é menor que fim
    if inicio < fim:
        # Laço para pegar números entre início e fim (CRESCENTE)
        while inicio <= fim:
            # Condição para analise de pares
            if inicio % 2 == 0:
                print(f'{inicio} é PAR!')
                # + 1 no contador
                contador += 1
            # Adição de valor para evitar loop infinito
            inicio += 1
        print(f'Quantidade de pares {contador}')
    # Condição para verificar se início é maior que fim
    elif inicio > fim:
        # Laço para pegar números entre início e fim (DECRESCENTE)
        while inicio >= fim:
            # Condição para analise de impares
            if inicio % 2 != 0:
                print(f'{inicio} é IMPAR!')
                # + 1 no contador
                contador += 1
            # Subtração de valor para evitar loop infinito
            inicio -= 1
        print(f'Quantidade de impares {contador}')
    # Condição para verificar se início é iguál a fim
    else:
        print(f'{inicio} e {fim} são IGUÁIS!')
    # Análise de Caso
    opcao = input('\n1Deseja executar novamente:[s-n]')
    # Se desejar continuar ele volta pro início do laço
    if opcao.strip().lower() == 's':
        continue
    # Se quiser sair ele quebra o laço
    else:
        print('Encerrando...')
        break
