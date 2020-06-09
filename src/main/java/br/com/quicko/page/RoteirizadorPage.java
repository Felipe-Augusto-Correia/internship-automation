package br.com.quicko.page;

import static br.com.quicko.core.DriverFactory.getDriver;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class RoteirizadorPage extends BasePage {
	
	BaseTest base = new BaseTest();
	BasePage page = new BasePage();
	
	public void aceitarPermissao() {
		getDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	}
	
	public void negarPermissao() {
		getDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	}
	
	
	public void inserirDestino(String Destino) throws MalformedURLException {
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
			
		//clicar no campo "para onde vamos?"
		getDriver().findElement(By.id("app.quicko:id/cl_origin_destination_field")).click();
		
		//escrever o destino no campo "Insira um endereco"
		escrever(By.id("app.quicko:id/et_search_address"), Destino);
		
		//clicar no resultado desejado
		List<MobileElement> enderecosEncontrados = getDriver().findElements(By.id("app.quicko:id/tv_item_place_router_primary"));
		for(MobileElement enderecos: enderecosEncontrados) {
			
			
			enderecosEncontrados.get(0).click();
			
			base.esperar(1000);
			maisRapido();
			maisBarato();
			base.esperar(2000);
			scroll(0.9, 0.1);
			scroll(0.9, 0.1);
			scroll(0.4, 0.9);
			scroll(0.4, 0.9);
			
			
		}	
		
		//clicar no resultado desejado
		getDriver().findElement(By.id("app.quicko:id/hsv_item_suggested_routes_list_legs")).click();
		
		//clicar no resultado desejado
		//List<MobileElement> rotasEncontradas = getDriver().findElements(By.className("android.widget.FrameLayout"));
		//rotasEncontradas.get(0).click();
		
		//Scroll para cima(abrir detalhes da rota)
		//page.tapAndDrag(704, 2000, 715, 305);
		//new TouchAction(getDriver()).longPress(PointOption.point(704, 1600)).moveTo(PointOption.point(715, 305)).release().perform();
		
		//clicar em inicar a rota
		getDriver().findElement(By.id("app.quicko:id/bt_custom_rounded_button")).click();
		
		do {
			getDriver().findElement(By.id("app.quicko:id/bt_router_navigation_next_step")).click();
		
		}while(page.existeElementoPorTexto("próximo"));
		
	}
	
	
	public void clicarFavoritoCasa() {
		clicar(By.id("app.quicko:id/tv_search_address_fav_home_label"));
	}
	
	public void clicarFavoritoTrabalho() {
		clicar(By.id("app.quicko:id/tv_search_address_fav_work_label"));
	}
	
	public void clicarEnderecosFavoritos() {
		clicar(By.id("app.quicko:id/tv_search_address_fav_addresses_label"));
	}
	
	public void maisBarato() {
		clicarPorTexto("Mais barato");
	}
	
	public void maisRapido() {
		clicarPorTexto("Mais rápido");
	}

}
