package br.com.quicko.test;

import org.junit.Test;

import br.com.quicko.core.BasePage;
import br.com.quicko.core.BaseTest;
import br.com.quicko.page.MenuFavoritosPage;
import br.com.quicko.page.IntroPage;

public class MenuFavoritosTeste extends BaseTest {
	
	BasePage base = new BasePage();
	IntroPage intro = new IntroPage();
	MenuFavoritosPage page = new MenuFavoritosPage();
	
	@Test
	public void editarFavoritoCasa() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.editarFavoritoCasa("Spaces - Vila Olímpia");
		page.voltarFavoritos();
		page.fecharMenu();
	}
	
	@Test
	public void editarFavoritoTrabalho() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.editarFavoritoTrabalho("Spaces - Vila Olímpia");
		page.voltarFavoritos();
		page.fecharMenu();
	}
	
	
	@Test
	public void roteirizarFavoritosCasa() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.roteirizarFavoritosCasa();
	}
	
	@Test
	public void roteirizarFavoritoTrabalho() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.roteirizarFavoritosTrabalho();
	}
		
	
	@Test
	public void adiocionarFavoritoCasa() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.adicionarFavoritoCasa("Spaces Berrini");
		page.voltarFavoritos();
		base.fecharMenu();
	}
	
	
	@Test
	public void adiocionarFavoritoTrabalho() {
		intro.aceitarPermissao();
		base.clicarMenu();
		page.acessarMenuFavoritos();
		page.adicionarFavoritoTrabalho("Spaces Berrini");
		page.voltarFavoritos();
		base.fecharMenu();
	}
}
