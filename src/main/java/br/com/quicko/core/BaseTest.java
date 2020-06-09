package br.com.quicko.core;

import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {
	
	
	@After
	public void tearDown() {
		DriverFactory.getDriver().resetApp();
	}
	
	@AfterClass
	public static void finalizaClasse() {
		DriverFactory.killDriver();
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
