package br.com.quicko.test;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.core.DriverFactory;
import br.com.quicko.page.IntroPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class IntroTeste extends BaseTest{
	
	private AndroidDriver<MobileElement> driver;
	
	BasePage page = new BasePage();
	IntroPage intro = new IntroPage();
	
	
	@Before
	public void inicializarApp() throws MalformedURLException {
		driver = DriverFactory.getDriver();
		
	}
	
	
	@Test
	public void navegarPelasTelasDeIntroPeloBotaoProximo() throws MalformedURLException {

	    //clicar no próximo
	    intro.clicarProximo();
	    //aceitar GPS
	    intro.aceitarPermissao();
	    //clicar no próximo
	    intro.clicarProximo();
	    //clicar no próximo
	    intro.clicarProximo();
	    
	}
	
	
	@Test
	public void navegarPelasTelasDeIntroPeloSwipe() throws MalformedURLException {
		
	    
	    
	}

	
	@Test
	public void pularTelasDeIntro() throws MalformedURLException {

	    //clicar em pular
	    driver.findElement(By.xpath("//android.widget.Button[@text='pular']")).click();
	    
	    //deve aceitar os termos do GPS
	    driver.findElement(By.id("app.quicko.debug:id/bt_alert_link")).click();
	    driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	    	    
	}
	
	
}
