package br.com.newtours.testePraticoWeb.teste;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step {
	logic logic = new logic();

	@Given("^Acessar a URL$")
	public void acessarURL() {
		logic.abrirURL();
	}

	@And("^Informar \"UserName\"$")
	public void inserirNomeDeUsuario() {
		logic.inserirNomeDeUsuario();
	}

	// \"([^\\\"]*)\
	@And("^Informar \"Password\"$")
	public void inserirSenha() {
		logic.inserirSenha();
	}

	@And("^Clicar no botão \"Sign-In\"$")
	public void clicarEmSignIn() {
		logic.clicarEmSignIn();
//		logic.validaSeLogou();
	}

	@And("^Selecionar a cidade de origem$")
	public void cmpDepartingFrom() {
		logic.cmpDepartingFrom();
	}

	@And("^Selecionar a cidade de destino$")
	public void cmpArrivingIn() {
		logic.cmpArrivingIn();
	}

	@And("^Selecionar data$")
	public void selecionarData() {
		logic.cmpOnDay();
		logic.cmpOnMonth();
		logic.cmpReturningMonth();
		logic.cmpReturningDay();
	}

	// abaixo

	@And("^Selecionar a \"Class\"$")
	public void selecionarClasse() {
		logic.selecionarClasse();
	}

	@And("^Selecionar \"Passengers\" = 1$")
	public void selectPassengers() {
		logic.selectPassengers();

	}

	@And("Clicar no botão \"Continue\" Find$")
	public void clicarBotaoContinueFind() {
		logic.clicarBotaoContinueFind();
	}

	@And("^Selecionar o voo$")
	public void selectFlight() {
		logic.selectFlight();
	}

	@And("^Clicar no botão \"Continue\" Reserve$")
	public void btnContinuaReserve() {
		logic.btnContinuaReserve();
	}

	@And("^Preencher First name e Last Name$")
	public void preencherNomeCartao() {
		logic.preencherNomeCartao();
	}

	@And("^Preencher número do cartão$")
	public void preencherNumeroCartao() {
		logic.preencherNumeroCartao();
	}

	@And("^Preencher o nome do passageiro \"Passenger Name\"$")
	public void preencherNomePassageiro() {
		logic.preencherNomePassageiro();
	}

	@And("^Clicar em \"Secure Purchase\"$")
	public void clicarSecurePurchase() {
		logic.clicarSecurePurchase();
	}

	@And("^Selecionar empresa aérea$")
	public void selectAirLine() {
		logic.selectAirLine();
	}

	@Then("^Ordem é gerada$")
	public void validaCompra() {
		
	}

}
