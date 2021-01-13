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
        System.out.println("Teste 1 realizado com sucesso"); //aparecer no console do editor

        checkOutPage.checkoutEemail();
        System.out.println("\n Teste 2 realizado com Sucesso"); //n pula linha

        conta.preencherForm();
        System.out.print("Teste 3 realizado com Sucesso");


    }


}



