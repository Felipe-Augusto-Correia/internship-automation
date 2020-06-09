package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;

public class PoliticaDePrivacidadePage extends BasePage {
	
	public void acessarPoliticaDePrivacidade() {
		clicarPorTexto("Política de Privacidade");
	}
	
	public void fecharPoliticaDePrivacidade() {
		clicar(By.id("app.quicko:id/bt_custom_webview_close"));
	}
}
