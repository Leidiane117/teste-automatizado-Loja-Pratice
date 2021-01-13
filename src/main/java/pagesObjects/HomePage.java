package pagesObjects;
import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class HomePage extends Driver {


    By imagem = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]" +
            "/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]");

    By botao= By.xpath("//span[contains(text(),'Add to cart')]"); // mudar esse path ele noã encontrou o botão!

    public void adicionarProduto() {
        getDriver().findElement(imagem).click(); //encontrar imagem e clicar
        getDriver().findElement(botao).click(); // encontrar botão e clicar

        // aguardar até aparecer o elemento h2 da próxima página
     WebDriverWait wait = new WebDriverWait(getDriver(),30);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id='product']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='layer_cart']/div[@class='clearfix']/div[@class='layer_cart_product col-xs-12 col-md-6']/h2[1]")));

    }


}
