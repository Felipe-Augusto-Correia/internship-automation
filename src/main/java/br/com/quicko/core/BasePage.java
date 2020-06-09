package br.com.quicko.core;

import static br.com.quicko.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void clicarPorTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		return elementos.size()>0;
	}
	
	
	public void aguardarElementoSumir(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	public void pressAndDrag(int x, int y, int a, int b) {
		new TouchAction(getDriver()).longPress(PointOption.point(x, y)).moveTo(PointOption.point(a,b)).release().perform();
	}
	
	public void tapAndDrag(int x, int y, int a, int b) {
		new TouchAction(getDriver()).tap(PointOption.point(x, y)).moveTo(PointOption.point(a,b)).release().perform();
	}
	
	
	public String obterMensagemTexto() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void scroll(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();
		int x = size.width/2;
		int y_inicial = (int) (size.height * inicio);
		int y_final = (int) (size.height * fim);
		
		new TouchAction(getDriver()).longPress(PointOption.point(x, y_inicial)).moveTo(PointOption.point(x, y_final)).release().perform();	
	}
	
	public void swipe(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();
		int y = size.height/2;
		int x_inicial = (int) (size.width * inicio);
		int x_final = (int) (size.width * fim);
		
		new TouchAction(getDriver()).longPress(PointOption.point(x_inicial, y)).moveTo(PointOption.point(y, x_final)).release().perform();
	}
	
	public void clicarMenu() {
		clicar(By.id("app.quicko:id/iv_header_avatar_drawer"));
	}
	
	public void fecharMenu() {
		clicar(By.id("app.quicko:id/bt_navigation_menu_close"));
	}
	
}
