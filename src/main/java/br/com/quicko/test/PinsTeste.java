package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.IntroPage;
import br.com.quicko.page.PinsPage;

public class PinsTeste extends BaseTest {
	
	IntroPage intro = new IntroPage();
	PinsPage page = new PinsPage();
	BasePage base = new BasePage();
	
	@Test
	public void pinTeste() {
		intro.aceitarPermissao();
		page.clicarPin();
		page.clicarOnibus();
	}
}
