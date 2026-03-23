'''
Escreva um programa em python que leia um número, representando o 
final de uma placa {veículo} e verifique o dia do rodízio do municipio.
- Use a estrutura Match case para resolver o exercício
'''

#Declaração de variáveis
finalPlaca = int(input('Digite o número final da sua placa: '))

#Verificação de rodízio
match finalPlaca:
    case 1 | 2:
        print('Seu rodízio é de Segunda-Feira')
    case 3 | 4:
        print('Seu rodízio é de Terça-Feira')
    case 5 | 6:
        print('Seu rodízio é de Quarta-Feira')
    case 7 | 8:
        print('Seu rodízio é de Quinta-Feira')
    case 9 | 0:
        print('Seu rodízio é de Sexta-Feira')
    case _:
        print('Número incompatível')
