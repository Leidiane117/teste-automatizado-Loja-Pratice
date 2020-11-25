package testesJUnit;
import controlador.Driver;
import hooks.Hooks;
import org.junit.Test;
import pagesObjects.CheckOutPage;
import pagesObjects.HomePage;
import java.util.concurrent.TimeUnit;


public class ExecutarTeste extends Hooks {


    HomePage homePage;
    CheckOutPage checkOutPage;
    @Test
    public void adicionarProdutoCarrinho() {
        homePage = new HomePage();
        homePage.adicionarProduto();
        System.out.print("OK");
    }

    @Test
    public  void prosseguirComCheckout(){
        checkOutPage= new CheckOutPage();
        checkOutPage.prosseguirCheckout();
        System.out.print("ok");
    }

}


