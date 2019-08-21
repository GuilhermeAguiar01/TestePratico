Feature: 1: Reservar 1 ticket
  //Guilherme Aguiar
  
  @scenario01
  Scenario: 1: Reservar 1 ticket    
    Given Acessar a URL
    And Informar "UserName"
    And Informar "Password"    
    And Clicar no botão "Sign-In"
    And Selecionar "Passengers" = 1
    And Selecionar a cidade de origem
    And Selecionar a cidade de destino
    And Selecionar data
    And Selecionar a "Class"  
    And Selecionar empresa aérea
		And Clicar no botão "Continue" Find
		And Selecionar o voo
		And Clicar no botão "Continue" Reserve
		And Preencher First name e Last Name
		And Preencher número do cartão
		And Preencher o nome do passageiro "Passenger Name"
		And Clicar em "Secure Purchase"
		Then Ordem é gerada