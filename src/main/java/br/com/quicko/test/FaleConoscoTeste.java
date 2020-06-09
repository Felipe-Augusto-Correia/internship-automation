package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.FaleConoscoPage;
import br.com.quicko.page.IntroPage;

public class FaleConoscoTeste extends BaseTest {
	
	FaleConoscoPage page = new FaleConoscoPage();
	BasePage base = new BasePage();
	IntroPage intro = new IntroPage();
	
	@Test
	public void faleConosco() {
		intro.aceitarPermissao();
		page.clicarMenu();
		page.acessarFaleConosco();
		page.preencherCampoNome("Felipe");
		page.preencherCampoEmail("felipe.correia@quicko.com.br");
		page.preencherCampoTelefone("11948925042");
		base.pressAndDrag(710, 1750, 711, 810);
		page.clicarCombo();
		page.selecionarCombo("Elogio");
		page.preencherCampoMensagem("Esse é teste tbm amandinha");
		page.enviar();
		page.fecharFaleConosco();
	}
}
