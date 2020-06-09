package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.IntroPage;
import br.com.quicko.page.TermosDeUsoPage;

public class TermosDeUsoTeste extends BaseTest {
	
	IntroPage intro = new IntroPage();
	BasePage base = new BasePage();
	TermosDeUsoPage page = new TermosDeUsoPage();
	
	@Test
	public void TermosDeUso() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarTermosDeUso();
		esperar(1000);
		base.pressAndDrag(743, 2054, 743, 500);
		esperar(1000);
		page.fecharTermosDeUso();
		page.fecharMenu();
	}
}
