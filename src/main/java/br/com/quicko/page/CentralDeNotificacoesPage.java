package br.com.quicko.page;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class CentralDeNotificacoesPage extends BasePage {
	
	BasePage base = new BasePage();
	BaseTest test = new BaseTest();
	
	public void acessarCentralNotificacoes() {
		clicarPorTexto("Central de notificações");
	}
	
	public void scrollCentralNotificacoes() {
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
		
		MobileElement element = DriverFactory.getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text='11/05']"));
		if(element.isDisplayed()) {
			base.scroll(0.9, 0.1);
			base.scroll(0.9, 0.1);
		}
		
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='22/04']"))) != null) {
			base.scroll(0.5, 0.9);
			base.scroll(0.5, 0.9);
		}
		
		//WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
		//do {
			//base.swipe(0.9, 0.1);
		//}while(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='22/04']"))));
			
	}
	
	
	public void voltar() {
		clicar(By.id("app.quicko:id/ib_back"));
	}
	
}
