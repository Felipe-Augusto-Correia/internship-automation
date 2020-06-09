package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.CentralDeNotificacoesPage;
import br.com.quicko.page.IntroPage;

public class CentralDeNotificacoesTeste extends BaseTest {
	
	IntroPage intro = new IntroPage();
	BasePage base = new BasePage();
	CentralDeNotificacoesPage page = new CentralDeNotificacoesPage();
	
	@Test
	public void centralDeNotificacoes() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarCentralNotificacoes();
		page.scrollCentralNotificacoes();
		page.voltar();
		base.fecharMenu();
	}
	
	@Test
	public void verificarNovasNotificacoes() {
		intro.aceitarPermissao();
		base.clicarMenu();
		if(base.existeElementoPorTexto("1")) {
			page.acessarCentralNotificacoes();
		}else {
			base.fecharMenu();
		}
	}
	
}
