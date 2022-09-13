import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSemNada {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luana\\OneDrive\\Documentos\\AutomacaoTeste\\src\\main\\resources\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://guitarflash.com/?lg=pt");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"fEmail\"]"));
		email.sendKeys("luana_dark34@hotmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"fSenha\"]"));
		password.sendKeys("luana123");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"menuGX2\"]/span[3]/input"));
		button.click();

	}

}
