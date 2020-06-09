package br.com.quicko.test;

import static br.com.quicko.core.DriverFactory.getDriver;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.quicko.core.BaseTest;
import br.com.quicko.page.RoteirizadorPage;

public class RoteirizadorTeste extends BaseTest {
	
	RoteirizadorPage page = new RoteirizadorPage();
	
	@Test
	public void roteirizarFavoritoCasa() {
		page.aceitarPermissao();
		getDriver().findElement(By.id("app.quicko.debug:id/cl_origin_destination_field")).click();
		page.clicarFavoritoCasa();
	}
	
	@Test
	public void roteirizarFavoritoTrabalho() {
		page.aceitarPermissao();
		getDriver().findElement(By.id("app.quicko.debug:id/cl_origin_destination_field")).click();
		page.clicarFavoritoTrabalho();
	}
	
	@Test
	public void roteirizarEnderecosFavoritos() {
		page.aceitarPermissao();
		getDriver().findElement(By.id("app.quicko.debug:id/cl_origin_destination_field")).click();
		page.clicarEnderecosFavoritos();
	}
	
	@Test
	public void RoteirizarDestino() throws MalformedURLException {
		page.aceitarPermissao();
		page.inserirDestino("Spaces Vila Madalena");
		
	}	
	
}

