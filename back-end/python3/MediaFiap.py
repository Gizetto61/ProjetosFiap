'''
Prorama parta calcular a Media da FIAP completa
'''

# Função para calcular a media dos CPS
def checkpoint():
    cps = []
    for i in range(3):
        cp = float(input(f'Informe a nota do {i + 1}° CP: '))
        cps.append(cp)
    cps.remove(min(cps))
    mediaCp = (sum(cps) / 2) * 0.2
    return mediaCp

# Função para calcular a media das Sprints
def sprint():
    sprints = []
    for i in range(2):
        sprint = float(input(f'Informe a nota da {i + 1}ª Sprint: '))
        sprints.append(sprint)
    mediaSprint = (sum(sprints) / 2) * 0.2
    return mediaSprint

# Função para calcular a GS
def globalSolution():
    gs = float(input('Digite a nota da Global Solution: '))
    mediaGs = (gs * 0.1) * 0.6
    return mediaGs

# Função para calcular o Semestre
def calculoSemestre1(mediaCp, mediaSprint, mediaGs):
    totSm1 = (mediaCp + mediaSprint + mediaGs) * 0.4
    print(f'Sua média do 1° Semestre foi: {totSm1:.2f}')
    return totSm1

# Função para calcular o Semestre
def calculoSemestre2(mediaCp, mediaSprint, mediaGs):
    totSm2 = (mediaCp + mediaSprint + mediaGs) * 0.6
    print(f'Sua média do 2° Semestre foi: {totSm2:.2f}')
    return totSm2

# Função para calcular o Ano
def medAno(totSm1, totSm2):
    print(f'\n1° Semestre [{totSm1:.2f}] --- 2° Semestre [{totSm2:.2f}]\n')
    totAno = totSm1 + totSm2
    print(f'Sua média anual na FIAP foi {totAno:.2f}')

# MAIN
print('--- 1° SEMESTRE ---')
mediaCp = checkpoint()
mediaSprint = sprint()
mediaGs = globalSolution()
totSm1 = calculoSemestre1(mediaCp, mediaSprint, mediaGs)
print('--- 2° SEMESTRE ---')
mediaCp2 = checkpoint()
mediaSprint2 = sprint()
mediaGs2 = globalSolution()
totSm2 = calculoSemestre2(mediaCp2, mediaSprint2, mediaGs2)
medAno(totSm1, totSm2)
