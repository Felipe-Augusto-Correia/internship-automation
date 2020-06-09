package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;

public class alertaCovidPage extends BasePage {
	
	public void acessarAlertaCovid() {
		clicar(By.id("app.quicko:id/cl_covid_button"));
	}
	
	public void fecharAlertaCovid() {
		clicar(By.id("app.quicko:id/bt_custom_webview_close"));
	}
}
