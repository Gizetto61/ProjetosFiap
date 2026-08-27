'''
Tratamento de Exceções (erros) em Python

try-except

Sintaxe:
try:
    # Código que pode gerar erro
except <tipo da exceção>:
    # Código que será executado caso um erro ocorra
else: "Opcional"
    # Comando que será executado se NÃO houver erro
finally: "Opcional"
    # Cmando que SEMPRE será executado
'''
# Uma Exceção
teste = 1
while teste != 0:
    try:
        num = int(input('Número: '))
        print(f'Você digitou o número {num}')
    except ValueError:
        print('Entrada Inválida. Digite apenas NÚMEROS.')
    teste = int(input('Digite 0 para sair: '))

# Duas ou mais Exceções
while True:
    try:
        n1 = int(input('Numerador: '))
        n2 = int(input('Denominador: '))
        div = n1 / n2
    except ValueError:
        print('Entrada Inválida. Digite apenas números.')
    except ZeroDivisionError:
        print('Erro: Divisão por 0!')
    else:
        print(f'Resultado da divisão: {div}')
    finally:
        print('--- FIM DE PROGRAMA ---')
        break