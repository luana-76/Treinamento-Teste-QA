package PagesInitialize;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import config.Retorno;

public class PagesInitialize {

	public PagesInitialize() {
		PageFactory.initElements(Retorno.getDriver(), this);
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fEmail\"]")
	protected WebElement email;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fSenha\"]")
	protected WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"menuGX2\"]/span[3]/input")
	protected WebElement button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"menuPerfil\"]/a")
	protected WebElement confirmingSuccess;

}
