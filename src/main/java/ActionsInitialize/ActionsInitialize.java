package ActionsInitialize;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PagesInitialize.PagesInitialize;
import config.Retorno;

public class ActionsInitialize extends PagesInitialize{
	
	protected WebDriverWait wait;
	
	public ActionsInitialize() {
		
		wait = new WebDriverWait(Retorno.getDriver(), 10);
		
	}
	
	public void typingEmail(String emailParameter) {
		
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(emailParameter);
		
	}
	
	public void typingPassword(String passwordParameter) {
		
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwordParameter);
		
	}
	
	public void clickingButton() {
		
		wait.until(ExpectedConditions.visibilityOf(button)).click();
		
	}
	
	public void confirming() {
		
		wait.until(ExpectedConditions.visibilityOf(confirmingSuccess)).click();
		
	}

}
