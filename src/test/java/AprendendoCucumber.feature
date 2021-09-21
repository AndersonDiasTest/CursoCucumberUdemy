# language: pt

Funcionalidade: Aprendendo Cucumber

Cenario: Iniciando com cucumber
	Dado que primeiro texto
	Quando segundo texto
	Entao terceiro texto
	
Cenario: Deve incrementar contador
	Dado que o valor do contador eh 15
	Quando eu incrementar 3
	Entao o valor do contador sera 18
	
Cenario: Deve calcular atraso na entrega
	Dado que o prazo eh dia 05/04/2018
	Quando a entrega atrasar em 2 "dias"
	Entao a entrega sera efetuada em 07/04/2018
	
	Cenario: Deve calcular atraso na entrega da china
	Dado que o prazo eh dia 05/04/2018
	Quando a entrega atrasar em 2 "meses"
	Entao a entrega sera efetuada em 05/06/2018
	
Cen�rio: Deve criar steps gen�ricos para estes passos
    Dado que o ticket � AF345
    Dado que o valor da passagem � R$ 230,45
    Dado que o nome do passageiro � "Fulano da Silva"
    Dado que o telefone do passageiro � 9999-9999
    Quando criar os steps
    Ent�o o teste vai funcionar

Cen�rio: Deve reaproveitar os steps "Dado" do cen�rio anterior
    Dado que o ticket � AB167
    Dado que o ticket especial � AB167
    Dado que o valor da passagem � R$ 1120,23
    Dado que o nome do passageiro � "Cicrano de Oliveira"
    Dado que o telefone do passageiro � 9888-8888

Cen�rio: Deve negar todos os steps "Dado" dos cen�rios anteriores
    Dado que o ticket � CD123
    Dado que o ticket � AG1234
    Dado que o valor da passagem � R$ 1.1345,56
    Dado que o nome do passageiro � "Beltrano Souza Matos de Alc�ntara Azevedo"
    Dado que o telefone do passageiro � 1234-5678
    Dado que o telefone do passageiro � 999-2223