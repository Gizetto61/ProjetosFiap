#Declaração da variável diaSemana
diaSemana = input('Dia da semana: ')

#Operação lógica [or (|)] na estrutura Match Case
#Verificação se é final de semana ou não
match diaSemana.lower():
    case 'sabado' | 'domingo':
        print(f'{diaSemana} é fim de semana')
    case 'segunda-feira' | 'terça-feira' | 'quarta-feira' | 'quinta-feira' | 'sexta-feira':
        print(f'{diaSemana} é dia da semana')
    case _:
        print('Dia da semana inválido!')