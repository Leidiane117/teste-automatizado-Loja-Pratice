package pagesObjects;

import com.github.javafaker.Faker;
import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class CheckOutEmailPage extends Driver {

    By getbotaocheckoutProsseguir= By.xpath("//span[contains(text(),'Proceed to checkout')]");
    By getBotaocheckoutProsseguir2  = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    By botaoCreate= By.id("SubmitCreate");

    Faker faker = new Faker(new Locale("en-US")); //mocando dados com a classe java faker
    String email= faker.internet().emailAddress();

    public void checkoutEemail(){
        getDriver().findElement(getbotaocheckoutProsseguir).click(); //sumario
        getDriver().findElement(getBotaocheckoutProsseguir2).click(); // sing in

       getDriver().findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
       getDriver().findElement(botaoCreate).click(); //criar email


       WebDriverWait wait = new WebDriverWait(getDriver(),30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-heading']")));


   }

}
