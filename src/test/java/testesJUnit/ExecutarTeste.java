package testesJUnit;
import hooks.Hooks;
import org.junit.Test;
import pagesObjects.CheckOutEmailPage;
import pagesObjects.CriarContaPage;
import pagesObjects.HomePage;
import pagesObjects.OrdemDePagamentoPage;


public class ExecutarTeste extends Hooks {


    HomePage homePage = new HomePage(); // criando o objeto das classes para utlizar os métodos criados nos PagesObjects
    CheckOutEmailPage checkOutPage= new CheckOutEmailPage();
    CriarContaPage conta= new CriarContaPage();
    OrdemDePagamentoPage ordemDePagamento= new OrdemDePagamentoPage();

    @Test //notação para informar ao Junit que a partir daqui é responsabilidade dele
    public void realizarCompra() { //script do teste

        homePage.adicionarProduto(); // método adicionar o produto ao carrinho
        System.out.println("Teste 1 realizado com sucesso"); //aparecer no console do editor

        checkOutPage.checkoutEemail(); // método enviar um email ao input e validar
        System.out.println("\n Teste 2 realizado com Sucesso"); //n pula linha

        conta.preencherForm(); // método preencher formulário para criar a conta
        System.out.print("\n Teste 3 realizado com Sucesso");

        ordemDePagamento.setChecklistTermo(); // método clicar no checklist termo de responsabilidade
        System.out.println("Testes 4 realizado com Sucesso");
        ordemDePagamento.escolhaPagamento(); // método para escolher a forma e pagamento e verificar se a comprar foi concluída com sucesso
        System.out.println("\n ÚLTIMO teste realizado com Sucesso");


    }


}



