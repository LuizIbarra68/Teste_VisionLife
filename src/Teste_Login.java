import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste_Login {

	private static final String KEY = "webdriver.gecko.driver";
	private static final String VALUE = "C:\\uc13\\eclipse\\geckodriver.exe";
	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty(KEY, VALUE);
		pagina = new FirefoxDriver();
		pagina.get("http://localhost/PI_UC12/index.php");
	}
	

	@Test
	public void test() {
		
		WebElement login = pagina.findElementByName("txtLogin");
		login.sendKeys("tamires@vieira.com");
		WebElement senha = pagina.findElementByName("txtSenha");
		senha.sendKeys("12345");
		
        WebElement entrar = pagina.findElementByXPath("/html/body/header[1]/div/form/input[3]");
        entrar.click();
        
		
	}

}
