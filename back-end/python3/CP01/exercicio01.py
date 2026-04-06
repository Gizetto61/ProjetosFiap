# Giovanni Zorzetto Oliveira - rm569464
# Exercício 01 - Cálculo Comissão de Vendas

# Entrada de Dados
nomeVendedor = input('Digite o nome do vendedor: ')
salFixo = float(input('Digite o salário fixo do vendedor: R$'))
totVendas = float(input('Digite o total de vendas do vendedor: R$'))
#Impressão de menu
print('=======================================')
print('Qual dia foram realizadas essas vendas?')
print('1 - Segunda a Quarta')
print('2 - Quinta ou Sexta')
print('3 - Sábado ou Domingo')
print('=======================================')
#Armazenamento de opção
opcao = int(input('-> '))

# Estrutura condicional avaliando opção
match opcao:
    case 1:
        comissao = totVendas * 0.2
        salFinal = salFixo + comissao
    case 2:
        comissao = totVendas * 0.15
        salFinal = salFixo + comissao
    case 3:
        comissao = totVendas * 0.10
        salFinal = salFixo + comissao
    case _:
        print('Opção inválida')

# Exibindo Nome, Valor da comissão, e Salario final
print('------------------------------')
print(f'Nome do Vendedor: {nomeVendedor}\nValor da comissão: R${comissao}\nSalário Final: R${salFinal}')