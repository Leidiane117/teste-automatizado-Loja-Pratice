package controlador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {


    private  static WebDriver driver; // métodos státicos da classe Drive(controlador)

    private static WebDriverWait wait;


    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Driver.driver = driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static void setWait(WebDriverWait wait) {
        Driver.wait = wait;
    }

}
