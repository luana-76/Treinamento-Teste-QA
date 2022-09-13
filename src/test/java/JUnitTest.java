import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActionsInitialize.ActionsInitialize;
import config.Retorno;

public class JUnitTest {
	
	WebDriver driver;
	ActionsInitialize actions;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luana\\OneDrive\\Documentos\\AutomacaoTeste\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://guitarflash.com/?lg=pt");
		Retorno.setDriver(driver);
		actions = new ActionsInitialize();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		actions.typingEmail("luana_dark34@hotmail.com");
		actions.typingPassword("lua56sol");
		actions.clickingButton();
		actions.confirming();
		
	}

}
