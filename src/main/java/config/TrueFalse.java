package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TrueFalse {


	private static WebDriver driver;

	public WebDriver AbrirUrl(){
		
		if(driver == null) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\luana\\OneDrive\\Documentos\\AutomacaoTeste\\src\\main\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		Retorno.setDriver(driver);;
		return driver;
		
	}


}
