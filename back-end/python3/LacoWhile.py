print('--- Exemplo 1 de While ---')
#Variável contadora
x = 1
#Laço de repetição "enquanto x <= 5"
#Nesse caso vai rodar 5 vezes, quando o X for 1 - 2 - 3 - 4 - 5
#Quando X for 6, o laço quebra e continua a execução fora dele
while x <= 5:
    print('Dentro do laço')
    print(f'X: {x}')
    x += 1
#Verificar o número final de x
print('Fora do laço')
print(f'Valor de X: {x}')


# Usuário define o número de repetições do laço
print('=======================')
#Entrada de dados
#Início do loop
inicio = int(input('\nInício: '))
#Fim do loop
fim = int(input('Fim: '))
#Variável contadora de laços
qtdLaco = 0
#Laço de repetição
while inicio <= fim:
    #Exibindo valores percorridos
    print('Dentro do laço')
    print(f'Percorrendo valores: {inicio}')
    inicio += 1
    qtdLaco += 1
#Exibindo valor final e n° de laços
print('Fora do laço')
print(f'Valor final: {inicio}')
print(f'Quantidade de laços {qtdLaco}')


'''
Para início <= fim, imprimir de forma crescente os valores entre início e fim
Para início > fim, imprimir de forma decrescente os valores entre início e fim
'''
print('=====================')
#Entrada de dados
inicio2 = int(input('Início: '))
fim2 = int(input('Fim: '))
#Se início <= fim
if inicio2 < fim2:
    #Impressão de valores crescentes
    while inicio2 <= fim2:
        #Percorrendo valores de forma ordenada
        print(f'Valores crescentes: {inicio2}')
        inicio2 += 1
#Se inicio >= fim
elif inicio2 > fim2:
    #Impressão de valores decrescentes
    while inicio2 >= fim2:
        #Percorrendo valores de forma inversa
        print(f'Valores decrescentes: {inicio2}')
        inicio2 -= 1
else:
    print('Iguáis')


'''
Repetição Infinita - While True
'''
#Variável contadora
i = 1
#Enquanto verdadeiro (Infinito)
while True:
    #Exibição de bom dia + contador
    print(f'Bom dia! {i}')
    i += 1
    #Condição para parada em 10 loops
    if i == 10:
        continuar = input('Quer continuar? [s/n]')
        #Se quiser continuar = + 10 loops
        if continuar == 's':
            i = 1
        #Senão quebra o laço
        else:
            break
