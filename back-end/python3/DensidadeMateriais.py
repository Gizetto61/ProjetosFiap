# Cálculo de Densidade de Materiais
'''
No laboratório os alunos medem a massa (kg) e o volume (m³)
de uma amostra para calcular a densidade (d = massa / volume)
Restrição: 
    - Validação física: grandezas físicas não podem ser negativas
'''

print('--- SISTEMA de ANÁLISE de MATERIÁIS ---')

try:
    massa = float(input('Digite a massa em KG: '))
    volume = float(input('Digite o volume do material em M³: '))
    # Validação
    if massa < 0 or volume < 0:
        # Lança uma exceção para o bloco except - Mesmo que o THROW em Java
        raise ValueError('Massa e/ou volume não podem ser negativos!')
    densidade = massa / volume
except ValueError as erroValor:
    print(f'\n[ERRO de ENTRADA]: {erroValor}')
    print('Digite apenas números positivos!')
except ZeroDivisionError:
    print('\n[ERRO MATEMÁTICO]: O volume não pode ser 0')
    print('Divisão por 0 impede o cálculo da densidade.')
else:
    print(f'\n[SUCESSO]: A densidade do material é {densidade}')
finally:
    print('\n--- ENCERRANDO O PROGRAMA ---')