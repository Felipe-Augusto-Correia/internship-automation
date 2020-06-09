package br.com.quicko.page;

import org.openqa.selenium.By;

import br.com.quicko.core.BasePage;

public class FaleConoscoPage extends BasePage {
	
	public void clicarMenu() {
		clicar(By.id("app.quicko:id/iv_header_avatar_drawer"));
	}
	
	public void acessarFaleConosco() {
		clicar(By.xpath("//*[@text='Fale Conosco']"));
	}
	
	
	public void preencherCampoNome(String nome) {
		escrever(By.id("app.quicko:id/et_name_contact_us"), nome);
	}
	
	public void preencherCampoEmail(String email) {
		escrever(By.id("app.quicko:id/et_email_contact_us"), email);
	}
	
	public void preencherCampoTelefone(String telefone) {
		escrever(By.id("app.quicko:id/et_phone_contact_us"), telefone);
	}
	
	public void clicarCombo() {
		clicar(By.id("app.quicko:id/sp_subject_contact_us"));
	}
	
	public void selecionarCombo(String tema) {
		clicarPorTexto(tema);
	}
	
	public void preencherCampoMensagem(String mensagem) {
		escrever(By.id("app.quicko:id/et_message_contact_us"), mensagem);
	}
	
	public void enviar() {
		clicar(By.id("app.quicko:id/bt_send_contact_us"));
	}
	
	public void fecharFaleConosco() {
		clicar(By.id("app.quicko:id/ib_back_contact_us"));
	}
}
