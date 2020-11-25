package hooks;
import controlador.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void configurarNavegador() {
        WebDriverManager.chromedriver().setup();// webdrivermanage framework que gerencia meu arquivo executavel do browser
        // espera implícita para evitar que o webdriver não encontre algum elemento, a cada 5 segundos ele verifica se o elemento apareceu.
        Driver.setDriver(new ChromeDriver()); // instanciando um novo objeto
        Driver.getDriver().manage().window().maximize();//abrir com a tela maximinizada
        Driver.getDriver().get("http://automationpractice.com/index.php");
       //
    }



}




