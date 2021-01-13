package pagesObjects;

import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutEmailPage extends Driver {

    By getbotaocheckoutProsseguir= By.xpath("//span[contains(text(),'Proceed to checkout')]");
    By getBotaocheckoutProsseguir2  = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    By botaoCreate= By.id("SubmitCreate");
   public void checkoutEemail(){
        getDriver().findElement(getbotaocheckoutProsseguir).click(); //sumario
        getDriver().findElement(getBotaocheckoutProsseguir2).click(); // sing in

       getDriver().findElement(By.xpath("//input[@id='email_create']")).sendKeys("leidiane.souza1@gmail.com");
       getDriver().findElement(botaoCreate).click(); //criar email


       WebDriverWait wait = new WebDriverWait(getDriver(),30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-heading']")));


   }

}
