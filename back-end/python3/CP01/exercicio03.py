# Giovanni Zorzetto Oliveira - rm569464
# Processamento de múltiplos salários buffado

# Declaração da variável de controle do laço
controle = 1

# Início do laço
while controle != 0:
    # Entrada de Dados
    salBruto = float(input(f'Digite {controle}° salário: R$'))

    # Estrutura condicional para cálculo da alíquota de imposto
    # Se salário for diferente de ZERO
    if salBruto > 0:
        # Caso 1
        if salBruto <= 1903.98:
            print('Isento')
            percentual = 0
            imposto = 0
            salLiquido = salBruto
        # Caso 2
        elif 1903.99 < salBruto <= 2826.65:
            percentual = '7.5%'
            imposto = salBruto * 0.075
            salLiquido = salBruto - imposto
        # Caso 3
        elif 2826.66 < salBruto <= 3751.05:
            percentual = '15%'
            imposto = salBruto * 0.15
            salLiquido = salBruto - imposto
        # Caso 4
        elif 3751.06 < salBruto <= 4664.68:
            percentual = '22.5%'
            imposto = salBruto * 0.225
            salLiquido = salBruto - imposto
        # Caso 5
        elif salBruto > 4664.68:
            percentual = '27.5%'
            imposto = salBruto * 0.275
            salLiquido = salBruto - imposto

        #Exibição de faixa salarial, Alíquota aplicada, valor do imposto e salário líquido
        print('-------------------------')
        print(f'Salário Bruto: R${salBruto}\nAlíquota aplicada: {percentual}\nValor do imposto: R${imposto}\nSalário Líquido: R${salLiquido}')
        print('-------------------------')
        # Condição para encerrar o laço
        continuar = input('Deseja continuar? [S ou N] -> ')
        if continuar.strip().upper() == 'S':
            controle += 1
            print('=======================')
        elif continuar.strip().upper() == 'N':
            controle = 0
            print('Fechando...')
    elif salBruto <= 0:
        print('Salário inválido')
        print('-------------------')
        # Condição para encerrar o laço
        continuar = input('Deseja continuar? [S ou N] -> ')
        if continuar.strip().upper() == 'S':
            controle += 1
        elif continuar.strip().upper() == 'N':
            controle = 0
            print('Fechando...')