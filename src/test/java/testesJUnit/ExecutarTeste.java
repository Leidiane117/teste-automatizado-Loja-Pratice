package testesJUnit;
import hooks.Hooks;
import org.junit.Test;
import pagesObjects.CheckOutEmailPage;
import pagesObjects.CriarContaPage;
import pagesObjects.HomePage;

import static org.junit.Assert.assertEquals;


public class ExecutarTeste extends Hooks {


    HomePage homePage;
    CheckOutEmailPage checkOutPage;
    CriarContaPage conta;

    @Test
    public void adicionarProdutoCarrinho() {
        homePage = new HomePage();
        homePage.adicionarProduto();
       System.out.print("Teste 1 realizado com sucesso");
    }

    @Test
    public  void checkoutPageEmail(){
        checkOutPage= new CheckOutEmailPage();
        checkOutPage.checkoutEemail();
        System.out.print("Teste 2 realizado com Sucesso");
    }
@Test
    public void criarConta(){
        conta= new CriarContaPage();
        conta.preencherForm();
    System.out.print("Teste 3 realizado com Sucesso");


    }



}


