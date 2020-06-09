package br.com.quicko.page;

import static br.com.quicko.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;
import io.appium.java_client.MobileElement;

public class PinsPage extends BasePage {
	
	public void clicarPin() {
		MobileElement el1 = getDriver().findElementByAccessibilityId("Av. Esperantina, 734. Ref.: R Crateus/ R Tiburcio Emidio Da Cunha.");
		el1.click();
	}
	
	public void clicarOnibus() {
		clicar(By.id("app.quicko:id/cl_item_trip_list"));
	}
	
}
