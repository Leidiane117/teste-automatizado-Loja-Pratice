package pagesObjects;
import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class HomePage extends Driver {


    By imagem = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]" +
            "/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]");

    By botao= By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/" +
            "li[2]/div[1]/div[2]/div[2]/a[1]/span[1]");

    public void adicionarProduto() {
        getDriver().findElement(imagem).click(); //encontrar imagem e clicar
        getDriver().findElement(botao).click(); // encontrar botão e clicar

        // aguardar até aparecer o elemento h2 da próxima página
     WebDriverWait wait = new WebDriverWait(getDriver(),30);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]" +
             "/div[1]/div[4]/div[1]/div[1]/h2[1]")));

    }


}
