# Exemplo Cadastro de Aluno
# Dicionário aluno representa a base de daos
aluno = {
    "nome" : "Carlos",
    "idade" : 20,
    "email" : None,
    "curso" : "ADS",
    "nota" : 8.5
}

def exibirAluno(aluno):
    print(f"Nome: {aluno['nome']}")
    print(f"Idade: {aluno['idade']}")
    print(f"Email: {aluno['email']}")
    print(f"Curso: {aluno['curso']}")
    print(f"Nota: {aluno['nota']}")

def alterarNota(aluno, novaNota):
    if novaNota >= 0:
        aluno['nota'] = novaNota
        print('Nota alterada com sucesso!')
    else:
        print('Nota não alterada!')

def validarEmail(email):
    return True

def adicionarEmail(aluno, email):
    status = validarEmail(email)
    if status == True:
        aluno["email"] = email

def removerEmail(aluno):
    aluno.pop('email', None)

#MAIN
exibirAluno(aluno)
print('===================')
alterarNota(aluno, -5)
exibirAluno(aluno)
print('===================')
adicionarEmail(aluno, "carlos@fiap.com.br")
exibirAluno(aluno)
print('===================')
removerEmail(aluno)
print(aluno)