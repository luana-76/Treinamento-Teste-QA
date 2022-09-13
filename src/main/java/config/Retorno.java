package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retorno {
	
	public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;

    }

    public static void setDriver(WebDriver driver){

        Retorno.driver = driver;

    }
	

}
