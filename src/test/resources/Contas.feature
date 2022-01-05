# language: pt

@funcionais
Funcionalidade: Contas

Como um usuario
Quero cadastrar contas
Para poder distribuir meu dinheiro de uma forma mais organizada

Contexto:
	Dado que estou acessando a aplicacao
	Quando informo o usuario "udemy@mail"
	E a senha "pass"
	E seleciono entrar
	Entao visualizo a pagina principal
	Quando seleciono Contas
	E seleciono Adicionar

Esquema do Cenario: Deve validar regra de negocio
	E informo a conta "<Conta>"
	E seleciono Salvar
	Entao recebo a mensagem "<Mensagem>"
	
Exemplos:
|Conta         |Mensagem|
|Conta de Teste|Conta adicionada com sucesso!|
|              |Informe o nome da conta      |
|Conta de Teste|Já existe uma conta com esse nome!|