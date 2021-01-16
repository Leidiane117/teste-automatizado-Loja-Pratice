package pagesObjects;
import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CriarContaPage extends Driver {
    By form= By.tagName("form");
    By nome= By.id("customer_firstname");
    By sobrenome=By.id("customer_lastname");
    By senha= By.id("passwd");
    By endereco= By.id("address1");
    By cidade=By.id("city");
    By cep= By.id("postcode");
    By celular= By.id("phone_mobile");
    By botaoSubmit= By.id("submitAccount");
    By radioButton= By.id("id_gender2");


    public void preencherForm(){


        getDriver().findElement(form);
        getDriver().findElement(radioButton).click(); //encontrar elemento que corresponde á forma de tratamento Mrs. e clicar
        getDriver().findElement(nome).sendKeys("Leidiane");
        getDriver().findElement(sobrenome).sendKeys("Soares");
        getDriver().findElement(senha).sendKeys("123456");
        getDriver().findElement(endereco).sendKeys("Rua Zé ninguém");
        getDriver().findElement(cidade).sendKeys("New York");
        getDriver().findElement(cep).sendKeys("00000");
        getDriver().findElement(celular).sendKeys("965041901");
        Select estado= new Select(getDriver().findElement(By.id("id_state")));
        estado.selectByVisibleText("New York"); // encontrar o elemento da combobox e selecionar
        Select pais= new Select((getDriver().findElement(By.id("id_country"))));
        pais.selectByVisibleText("United States");

        getDriver().findElement(botaoSubmit).click(); //registrar, enviar formulário
        WebDriverWait wait = new WebDriverWait(getDriver(),30); //aguardar até a proxima página
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-heading']")));
        getDriver().findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Proceed to checkout')]")).click();


    }

}
