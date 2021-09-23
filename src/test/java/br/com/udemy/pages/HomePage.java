package br.com.udemy.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public void clicaMenuAdicionarContas() {
		clicaLink("Contas");
		clicaLink("Adicionar");
	}
	
	public void clicaMenuListarContas() {
		clicaLink("Contas");
		clicaLink("Listar");
	}
	
	public String obterTextoSucessoLogin() {
		return obterTexto(By.xpath("//body/div[@role='alert']"));
	}
}
