import requests

url = 'http://pokeapi.co/api/v2/pokemon'
cont = 1

# Retorna objeto do tipo Response
# Metodo GET HTTP
response = requests.get(url)
# Casting(Conversãp de tipos) de response para JSON
dados = response.json()
# Armazenando uma lista de dentro do dicionário dados
lista = dados['results']
# Laço percorrendo a lista
for pokemon in lista:
    print(f'{cont} - {pokemon['name']}')
    cont += 1

# print(dados)