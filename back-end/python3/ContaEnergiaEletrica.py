'''
Escreva um programa para calcular o valor de uma conta de energia elétrica de
um consumidor com base no consumo de kWh.
o programa deve receber o consumo de energia.
Ao final, deve imprimir a conta detalhada (consumo, tarifa aplicada, valor total a pagar)

Consumo < 150 kWh: R$ 0,75 por kWh
Consumo >= 150 e < 500 kWh: R$ 0,95 por kWh
Consumo >= 500 kWh: R$ 1,20 por kWh
Consumo < R$ 45,00: O consumidor paga R$ 45,00
'''

#Exibição do Tema
print ('----------------- Cálculo da Conta de Energia 2026 ------------------')
print ('Mínimo a pagar: R$ 45.00 --> Qualquer valor inferior, pagará o mínimo')
print ('---------------------------------------------------------------------')

#Entrada de dados
consEnergia = int(input('informe a consumo mensal de energia [kWh]: '))
print ('---------------------------------------------------------------------')

#Início da Estrutura Condicional (Teste para pagamento)
if consEnergia < 150:
    #Declaração tarifa e Total a pagar
    tarifa = 0.75
    totPagar = consEnergia * tarifa
    #Condição se o valor não exeder o mínimo
    if totPagar < 45:
        print ('Valor inferior ao mínimo')
        print ('Consumo: R$', consEnergia, '\nTarifa Aplicada: R$', tarifa, '\nValor total a pagar: R$45,00')
    #Condição se valor < 150
    else:
        print ('Consumo: R$', consEnergia, '\nTarifa Aplicada: R$', tarifa, '\nValor total a pagar: R$', totPagar)
#Condição se valor estiver entre 150 e 500
elif consEnergia >= 150 and consEnergia < 500:
    #Declaração tarifa e Total a pagar
    tarifa = 0.95
    totPagar = consEnergia * tarifa
    print ('Consumo: R$', consEnergia, '\nTarifa Aplicada: R$', tarifa, '\nValor total a pagar: R$', totPagar)
#Condição se valor > 500
elif consEnergia >= 500:
    #Declaração tarifa e Total a pagar
    tarifa = 1.20
    totPagar = consEnergia * tarifa
    print ('Consumo: R$', consEnergia, '\nTarifa Aplicada: R$', tarifa, '\nValor total a pagar: R$', totPagar)
else:
    print ('Consumo Troglodita!')