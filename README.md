
# PROGRAMA TESTE DE ACEITAÇÃO PARA WEB 🛒


## Projeto de teste automatizado, desenvolvido com proposito de realizar uma compra com sucesso na loja Pratice


## PRÉ-REQUISITOS

*   Java 1.8 JDK
*   JUnit 4.13
*   Maven 3.5.*
*   Navegador Web (Chrome, Opera, FireFox, Edge ou Safari)
*   Intellij IDEA


## ESTRUTURA DO PROJETO


src\main\java\controlador 		------------  Local onde fica a classe principal Driver, responsável por controlar o driver do Selenium
           
               
src\main\java\pagesobjects  ------------  Local onde é criada todas as classes das páginas, para facilitar na manutenção e estrutura do projeto      


src\test\java\hooks        -------------  Local onde ficam os métodos que executam antes e depois de cada teste (@Before, @After)  


src\test\java\testesJUnit  ------------   Local onde será executado os testes das minhas pagesObjects                                                      	

    

## FRAMEWORKS UTILIZADOS

* Selenium - Responsável pela interação com páginas web
* Junit - Responsável por validar as condições de teste
* Lombok - Otimização de classes modelos
* JavaFaker - Responsável por gerar dados falsos para realização dos testes

## ROTEIRO DO TESTE

1. Acessar o site: http://automationpractice.com/index.php

2. Escolher um produto qualquer na loja.

3. Adicionar o produto escolhido ao carrinho.

4. Prosseguir para o checkout.

5. Validar se o produto foi corretamente adicionado ao carrinho e prosseguir caso esteja tudo certo.

6. Realizar o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.

7. Validar se o endereço está correto e prosseguir.

8. Aceitar os termos de serviço e prosseguir.

9. Validar o valor total da compra.

10. Selecionar um método de pagamento e prosseguir.

11. Confirmar a compra e validar se foi finalizada com sucesso.

