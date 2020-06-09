package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;

public class MenuFavoritosPage extends BasePage {
	
	BaseTest base = new BaseTest();	
	
	
	public void acessarMenuFavoritos() {
		clicarPorTexto("Favoritos");
	}
	
	public void voltarFavoritos() {
		clicar(By.id("app.quicko:id/ib_back"));
	}
	
	public void clicarAtalhoFavoritos() {
		clicar(By.id("app.quicko:id/bt_favorites_shortcut"));
	}
	
	public void deletarFavorito() {
		clicar(By.id("app.quicko:id/ib_favorites_delete"));
		clicar(By.id("app.quicko:id/bt_favorite_confirm_delete"));
	}
	
	public void editarFavoritoCasa(String endereco) {
		clicar(By.id("app.quicko:id/ib_favorites_fav_home_edit"));
		escrever(By.id("app.quicko:id/et_search_address"), endereco);
		base.esperar(3000);
		clicar(By.xpath("//android.widget.TextView[@text='"+endereco+"']"));
		base.esperar(3000);
		
	}
	
	public void editarFavoritoTrabalho(String endereco) {
		clicar(By.id("app.quicko:id/ib_favorites_fav_work_edit"));
		escrever(By.id("app.quicko:id/et_search_address"), endereco);
		base.esperar(3000);
		clicar(By.xpath("//android.widget.TextView[@text='"+endereco+"']"));
		base.esperar(3000);
		
	}
	
	public void adicionarFavoritoTrabalho(String endereco) {
		clicar(By.id("app.quicko:id/cv_favorites_fav_work"));
		escrever(By.id("app.quicko:id/et_search_address"), endereco);
		base.esperar(3000);
		clicar(By.xpath("//android.widget.TextView[@text='"+endereco+"']"));
		base.esperar(3000);
	}
	
	public void adicionarFavoritoCasa(String endereco) {
		clicar(By.id("app.quicko:id/cv_favorites_fav_home"));
		escrever(By.id("app.quicko:id/et_search_address"), endereco);
		base.esperar(3000);
		clicar(By.xpath("//android.widget.TextView[@text='"+endereco+"']"));
		base.esperar(3000);
	}
	
	public void roteirizarFavoritosCasa() {
		clicar(By.id("app.quicko:id/ib_favorites_fav_home_edit"));
	}
	
	public void roteirizarFavoritosTrabalho() {
		clicar(By.id("app.quicko:id/cv_favorites_fav_work"));
	}
	
	
		
}
