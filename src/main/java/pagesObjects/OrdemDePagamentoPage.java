package pagesObjects;

import controlador.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OrdemDePagamentoPage extends Driver {

    //página compra
    By checklistTermo = By.id("uniform-cgv");
    By prosseguir = By.name("processCarrier");
    By escolhaPagamento = By.xpath("//a[@class='bankwire']//span[contains(text(),'(order processing will be longer)')]");
    By confirmarPagamento = By.xpath("//span[contains(text(),'I confirm my order')]");
    By verificarCarrinho= By.xpath("//body[@id='order-confirmation']");

    public  void setChecklistTermo(){
        getDriver().findElement(checklistTermo).click();
        getDriver().findElement(prosseguir).click();
        WebDriverWait wait= new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-heading']")));

    }

    public void escolhaPagamento(){
        getDriver().findElement(escolhaPagamento).click();
        WebDriverWait wait= new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
        getDriver().findElement(confirmarPagamento).click();
        getDriver().findElement(By.tagName("h1"));
        getDriver().findElement(verificarCarrinho).click();

    }


}
