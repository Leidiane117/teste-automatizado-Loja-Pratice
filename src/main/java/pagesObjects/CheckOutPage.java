package pagesObjects;

import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends Driver {

    By getbotaocheckoutProsseguir= By.className("btn btn-default button button-medium");
    By getBotaocheckoutProsseguir2  = By.className("button btn btn-default standard-checkout button-medium");


   public void prosseguirCheckout(){
        getDriver().findElement(getbotaocheckoutProsseguir).click(); //sumario
        getDriver().findElement(getBotaocheckoutProsseguir2).click(); // sing in
       WebDriverWait wait = new WebDriverWait(getDriver(),30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));

   }

}
