package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.IntroPage;
import br.com.quicko.page.alertaCovidPage;

public class alertaCovidTeste extends BaseTest {
	
	BasePage base = new BasePage();
	alertaCovidPage page = new alertaCovidPage();
	IntroPage intro  = new IntroPage();
	
	
	@Test
	public void alertaCovid() {
		intro.aceitarPermissao();
		page.acessarAlertaCovid();
		esperar(1000);
		page.pressAndDrag(1214, 1772, 1264, 568);
		page.pressAndDrag(1214, 1772, 1264, 568);
		page.fecharAlertaCovid();
	}
}
