package acoesCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ActionsInitialize.ActionsInitialize;
import config.TrueFalse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class acoesCucumber {
	
	WebDriver driver;
	ActionsInitialize action;
	public acoesCucumber() {
		
		TrueFalse manager = new TrueFalse();
		driver = manager.AbrirUrl();
		action = PageFactory.initElements(driver, ActionsInitialize .class);
		
	}
	
	@Given("usuario esteja no site {string}")
	public void usuario_esteja_no_site(String site) {
	    driver.get("https://guitarflash.com/?lg=pt");
	}

	@Given("digitar {string}, {string} validos")
	public void digitar_validos(String email, String senha) {
	    action.typingEmail(email);
	    action.typingPassword(senha);
	}

	@When("clicar no botao enviar")
	public void clicar_no_botao_enviar() {
	    action.clickingButton();
	}

	@Then("Entrarar no perfil")
	public void entrarar_no_perfil() {
	    action.confirming();
	}

}
