# language: pt

Funcionalidade: Contas

Como um usuário
Quero cadastrar contas
Para poder distribuir meu dinheiro de uma forma mais organizada

Contexto:
	Dado que estou acessando a aplicacao
	Quando informo o usuario "udemy@mail"
	E a senha "pass"
	E seleciono entrar
	Entao visualizo a pagina principal

Cenario: Deve inserir uma conta com sucesso
	Quando seleciono Contas
	E seleciono Adicionar
	E informo a conta "Conta de Teste"
	E seleciono Salvar
	Entao a conta eh inserida com sucesso

Cenario: Nao deve inserir uma conta sem nome
	Quando seleciono Contas
	E seleciono Adicionar
	E seleciono Salvar
	Entao sou notificar que o nome da conta eh obrigatorio

Cenario: Nao deve inserir uma conta com nome ja existente
	Quando seleciono Contas
	E seleciono Adicionar
	E informo a conta "Conta de Teste"
	E seleciono Salvar
	Entao sou notificado que ja existe uma conta com esse nome