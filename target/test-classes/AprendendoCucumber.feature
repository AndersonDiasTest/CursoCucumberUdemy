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
	
Cenario: Deve criar steps genericos para estes passos
    Dado que o ticket e AF345
    Dado que o valor da passagem e R$ 230,45
    Dado que o nome do passageiro e "Fulano da Silva"
    Dado que o telefone do passageiro e 9999-9999
    Quando criar os steps
    Entao o teste vai funcionar

Cenario: Deve reaproveitar os steps "Dado" do cenario anterior
    Dado que o ticket e AB167
    Dado que o ticket especial e AB167
    Dado que o valor da passagem e R$ 1120,23
    Dado que o nome do passageiro e "Cicrano de Oliveira"
    Dado que o telefone do passageiro e 9888-8888

Cenario: Deve negar todos os steps "Dado" dos cenarios anteriores
    Dado que o ticket e CD123
    Dado que o ticket e AG1234
    Dado que o valor da passagem e R$ 1.1345,56
    Dado que o nome do passageiro e "Beltrano Souza Matos de Alcentara Azevedo"
    Dado que o telefone do passageiro e 1234-5678
    Dado que o telefone do passageiro e 999-2223