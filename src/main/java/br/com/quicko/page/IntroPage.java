package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;

import static br.com.quicko.core.DriverFactory.getDriver;

public class IntroPage extends BasePage {
	
	
	public void clicarProximo() {
		getDriver().findElement(By.id("app.quicko.debug:id/bt_intro_next")).click();
	}
	
	public void aceitarPermissao() {
		getDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	}
	
	public void negarPermissao() {
		getDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	}
	
	public void redirecionarGps() {
		getDriver().findElement(By.xpath("//*[@text='Clique para ser redirecionado']")).click();
	}
	
	public void voltarLocalizacao() {
		getDriver().findElement(By.xpath("//*[@text='Voltar para minha localização']")).click();
	}

}
