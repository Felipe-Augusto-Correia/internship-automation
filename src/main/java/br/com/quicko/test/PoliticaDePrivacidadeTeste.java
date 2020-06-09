package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.IntroPage;
import br.com.quicko.page.PoliticaDePrivacidadePage;

public class PoliticaDePrivacidadeTeste extends BaseTest {
	
	BasePage base = new BasePage();
	PoliticaDePrivacidadePage page = new PoliticaDePrivacidadePage();
	IntroPage intro = new IntroPage();
	
	@Test
	public void politicaDePrivacidade() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarPoliticaDePrivacidade();
		esperar(2000);
		page.fecharPoliticaDePrivacidade();
	}
}
