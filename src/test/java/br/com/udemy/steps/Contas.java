package br.com.udemy.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import br.com.udemy.pages.LoginPage;

public class Contas {
	
	private LoginPage loginPage = new LoginPage();

	@Dado("que estou acessando a aplicacao")
	public void queEstouAcessandoAAplicacao() {
	    loginPage.acessarTelaInicial();
	}
	@Quando("informo o usuario {string}")
	public void informoOUsuario(String email) {
	    loginPage.setEmail(email);
	}
	@Quando("a senha {string}")
	public void aSenha(String senha) {
	    loginPage.setSenha(senha);
	}
	@Quando("seleciono entrar")
	public void selecionoEntrar() {
	    loginPage.entrar();
	}
	@Entao("visualizo a pagina principal")
	public void visualizoAPaginaPrincipal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
