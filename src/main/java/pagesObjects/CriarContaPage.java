package pagesObjects;
import com.github.javafaker.Faker;
import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;


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


    Faker faker = new Faker(new Locale("en-US")); //mocando dados com a classe java faker
    String name = faker.name().firstName();
    String lastName = faker.name().lastName();
    String street = faker.address().streetName();
    String passWord= faker.internet().password();
    String cel = faker.phoneNumber().cellPhone();
    String zipCode= faker.address().zipCode();
    String city= faker.address().city();

    public void preencherForm(){


        getDriver().findElement(form);
        getDriver().findElement(radioButton).click(); //encontrar elemento que corresponde á forma de tratamento Mrs. e clicar
        getDriver().findElement(nome).sendKeys(name);
        getDriver().findElement(sobrenome).sendKeys(lastName);
        getDriver().findElement(senha).sendKeys(passWord);
        getDriver().findElement(endereco).sendKeys(street);
        getDriver().findElement(cidade).sendKeys(city);
        getDriver().findElement(cep).sendKeys(zipCode);
        getDriver().findElement(celular).sendKeys(cel);
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
