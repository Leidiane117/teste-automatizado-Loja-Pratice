package testesJUnit;
import hooks.Hooks;
import org.junit.Test;
import pagesObjects.CheckOutEmailPage;
import pagesObjects.CriarContaPage;
import pagesObjects.HomePage;

import static org.junit.Assert.assertEquals;


public class ExecutarTeste extends Hooks {


    HomePage homePage = new HomePage();
    CheckOutEmailPage checkOutPage= new CheckOutEmailPage();
    CriarContaPage conta= new CriarContaPage();

    @Test
    public void realizarCompra() {

        homePage.adicionarProduto();
        System.out.print("Teste 1 realizado com sucesso");
        checkOutPage.checkoutEemail();
        System.out.print("Teste 2 realizado com Sucesso");
        conta.preencherForm();
        System.out.print("Teste 3 realizado com Sucesso");


    }


}



