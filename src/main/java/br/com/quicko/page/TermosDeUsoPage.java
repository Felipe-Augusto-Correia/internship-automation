package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;

public class TermosDeUsoPage extends BasePage {
	
	public void acessarTermosDeUso() {
		clicarPorTexto("Termos de Uso");
	}
	
	public void fecharTermosDeUso() {
		clicar(By.id("app.quicko:id/bt_custom_webview_close"));
	}
}
