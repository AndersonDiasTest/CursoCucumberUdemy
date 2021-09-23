package br.com.udemy.steps;

import static br.com.udemy.core.DriverFactory.getDriver;
import static br.com.udemy.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.udemy.pages.ContasPage;
import br.com.udemy.pages.HomePage;
import br.com.udemy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Contas {
	
	private LoginPage loginPage = new LoginPage();
	private ContasPage contasPage = new ContasPage();
	private HomePage homePage = new HomePage();

//--------------inicia contexto---------------------//

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
	    Assert.assertEquals("Bem vindo, Anderson!", loginPage.obterMsgAlerta());
	}
	
//-------------------primeiro cen�rio----------------//

	@Quando("seleciono Contas")
	public void seleciono_contas() {
	    homePage.clicaLink("Contas");
	}

	@Quando("seleciono Adicionar")
	public void seleciono_adicionar() {
		homePage.clicaLink("Adicionar");
	}

	@Quando("informo a conta {string}")
	public void informo_a_conta(String conta) {
	    contasPage.setNomeConta(conta);
	}

	@Quando("seleciono Salvar")
	public void seleciono_salvar() {
	    contasPage.salvar();
	}

	@Entao("a conta eh inserida com sucesso")
	public void a_conta_eh_inserida_com_sucesso() {
	    Assert.assertEquals("Conta adicionada com sucesso!", homePage.obterMsgAlerta());
	}

	//-------------------segundo cen�rio----------------//
	
	@Entao("sou notificado que o nome da conta eh obrigatorio")
	public void sou_notificado_que_o_nome_da_conta_eh_obrigatorio() {
		Assert.assertEquals("Informe o nome da conta", homePage.obterMsgAlerta());
	}
	
	//-------------------terceiro cen�rio----------------//
	
	@Entao("sou notificado que ja existe uma conta com esse nome")
	public void sou_notificado_que_ja_existe_uma_conta_com_esse_nome() {
		Assert.assertEquals("Já existe uma conta com esse nome!", homePage.obterMsgAlerta());
	}
	
	@Entao("recebo a mensagem {string}")
	public void receboAMensagem(String mensagem) {
		Assert.assertEquals(mensagem, homePage.obterMsgAlerta());
	}
	
	@Before(order = 0, value = "@funcionais")
	public void inicializa() {
		System.out.println("primeiro");
	}
	
	@Before(order = 1, value = "@funcionais")
	public void inicializaNovamente() {
		System.out.println("segundo");
	}
	
	@After(order = 1, value = "@funcionais")
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/" + cenario + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After(order = 0, value = "@funcionais")
	public void finaliza() {
		killDriver();
	}
}
