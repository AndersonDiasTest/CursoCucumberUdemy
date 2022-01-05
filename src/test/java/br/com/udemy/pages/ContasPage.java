package br.com.udemy.pages;

import org.openqa.selenium.By;

public class ContasPage extends BasePage {
	
	public void setNomeConta(String nomeConta) {
		preenche("nome", nomeConta);
	}

	public void salvar() {
		clicaBotaoPorTexto("Salvar");
	}
	
	public void clicaBotaoAlterarConta(String registro) {
		obterCelula("Conta", registro, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	public void clicaBotaoRemoverConta(String registro) {
		obterCelula("Conta", registro, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
	
	public String obterTextoMsgAlertas() {
		return obterTexto(By.xpath("//body/div[@role='alert']"));
	}
}
