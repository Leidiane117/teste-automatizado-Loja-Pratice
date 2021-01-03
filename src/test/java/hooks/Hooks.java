package hooks;
import controlador.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    @Before
    public void configurarNavegador() {
        WebDriverManager.firefoxdriver().setup();// webdrivermanage framework que gerencia meu arquivo executavel do browser
        Driver.setDriver(new FirefoxDriver()); // instanciando um novo objeto
        Driver.getDriver().manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);// espera implícita para evitar que o webdriver não encontre algum elemento, a cada 5 segundos ele verifica se o elemento apareceu.
        Driver.getDriver().manage().window().maximize();//abrir com a tela maximinizada
        Driver.getDriver().get("http://automationpractice.com/index.php");
       //
    }

    @After
    public void fecharNavegador(){
        Driver.getDriver().close();


    }

}




