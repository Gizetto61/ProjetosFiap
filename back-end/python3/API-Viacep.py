# Sintaxe: pip instal "Biblioteca desejada"
# pip install requests

import requests

# Definição de cep
cep = '03059050'
# Url da api com o cep estabelecido
url = f'https://viacep.com.br/ws/{cep}/json/'

try:
    # Requisição HTTP GET
    requisicao = requests.get(url)
    # Verificar se a requisição foi certa
    # 200 OK
    if requisicao.status_code == 200:
        # Converção do HTTP para o JSON
        dicionarioReq = requisicao.json()
        # Exibição
        print(f'CEP: {dicionarioReq['cep']}')
        print(f'Logradouro: {dicionarioReq['logradouro']}')
        print(f'Complemento: {dicionarioReq['complemento']}')
        print(f'Bairro: {dicionarioReq['bairro']}')
        print(f'Localidade: {dicionarioReq['localidade']}')
        print(f'UF: {dicionarioReq['uf']}')
    # 404 BAD REQUEST
    elif requisicao.status_code == 404:
        print('Não foi possível encontrar o endereço passado por parâmetro')
    # 500 INTERNAL SERVER ERROR
    elif requisicao.status_code == 500:
        print('Ocorreu um erro no servidor!')
    else:
        print(f'Erro: {requisicao.status_code}')
except ConnectionError as erro:
    print(f'Erro de conexão: {erro}')
except Exception as erro:
    print(f'Erro: {erro}')
