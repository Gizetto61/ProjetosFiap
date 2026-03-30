'''
Desenvolva um programa que simule o fechamento de uma compra em um caixa de supermercado. 
O programa deve processar a entrada de preços de diversos produtos (valores decimais) 
e acumulá-los em uma variável de subtotal.
Requisitos:
    1- O programa deve utilizar uma estrutura de repetição para receber os preços um a um.
    2- Para sinalizar o encerramento da entrada de dados (condição de parada), o usuário deverá digitar o valor -1.
    3- Após a inserção do valor de parada, o programa deve exibir o valor total da compra formatado com duas casas decimais.
    4- Certifique-se de que o valor de sentinela (-1) não seja somado ao total final.
'''
#Exibição de Apresentação
print('---- Seja Bem Vindo(a) ----')
print('----- Sistema de PDV! -----')
#Variável controladora de laço
controle = 0
#Variável para atibuição dos valores fora do laço
soma = 0
#Laço While
while controle != '-1':
    #Entrada de dados
    vlProduto = float(input('Digite o valor do produto: R$'))
    #Atribuição dos valores à soma
    soma += vlProduto
    #Se o usuário digitar -1 ele quebra o laço
    controle = input('Deseja adicionar mais um produto? [-1 para sair]')
#Saída de soma total de produtos
print(f'A soma final de todos os produtos adicionados é R${soma:.2f}')