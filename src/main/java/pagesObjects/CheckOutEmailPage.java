package pagesObjects;

import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutEmailPage extends Driver {

    By getbotaocheckoutProsseguir= By.className("btn btn-default button button-medium");
    By getBotaocheckoutProsseguir2  = By.className("button btn btn-default standard-checkout button-medium");
    By botaoCreate= By.id("SubmitCreate");
   public void checkoutEemail(){
        getDriver().findElement(getbotaocheckoutProsseguir).click(); //sumario
        getDriver().findElement(getBotaocheckoutProsseguir2).click(); // sing in
       WebDriverWait wait = new WebDriverWait(getDriver(),30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_create']"))).sendKeys("leidiane5499@gmail.com");
       getDriver().findElement(botaoCreate).click();
   }

}
