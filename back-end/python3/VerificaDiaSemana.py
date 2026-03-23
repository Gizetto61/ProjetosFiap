#Declaração da variável 'diaSemana'
diaSemana = int(input('Digite um número: '))

#Estrutura condicional 'Switch Case' em python
#Indica qual o dia da semana de acordo com o número digitado de 1-7
match diaSemana:
    case 1:
        print('Domingo!')
    case 2:
        print('Segunda-Feira!')
    case 3:
        print('Terça-Feira!')
    case 4:
        print('Quarta-Feira!')
    case 5:
        print('Quinta-Feira!')
    case 6:
        print('Sexta-Feira!')
    case 7:
        print('Sábado!')
    case _: #default Se nenhum case acontecer
        print('Não é um dia da semana válido!')