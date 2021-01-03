
# PROGRAMA MODELO PARA TESTE WEB 

## Projeto desenvolvido com proposito de ser um modelo base para teste com interface web
-----------------------------------------------------------------------------------------------------------------------------------

## PRÉ-REQUISITOS

Requisitos de software e hardware necessários para executar este projeto de automação

*   Java 1.8 SDK
*   Maven 3.5.*
*   Navegador Web (Chrome, Opera, FireFox, Edge ou Safari)
*   Intellij IDEA


## ESTRUTURA DO PROJETO
 --------------------------------------------------------------------------------------------------------------------------------------

src\main\java\controlador 		------------  Local onde fica a classe principal Driver, responsável por controlar o driver do Selenium
                 
                 
src\main\java\pagesobjects  ------------  Local onde é criada todas as classes das páginas, para facilitar na manutenção e estrutura do projeto      

src\test\java\hooks        -------------  Local onde ficam os métodos que executam antes e depois de cada teste (@Before, @After)  


src\test\java\testesJUnit  ------------   Local onde será executado os testes das minhas pagesObjects                                                      	

    
## DOWNLOAD DO PROJETO TEMPLATE PARA SUA MÁQUINA LOCAL

Faça o donwload do template no repositório de código para utilizar no seu projeto em especifico, 
feito isso, fique a vontande para usufruir dos recursos disponíveis e 
também customizar de acordo com sua necessidade. 


## FRAMEWORKS UTILIZADOS

Abaixo está a lista de frameworks utilizados nesse projeto

* Selenium - Responsável pela interação com páginas web
* Junit - Responsável por validar as condições de teste
* Lombok - Otimização de classes modelos



## LOG DE EXECUÇÃO

Os logs de execução gerados pelo Log4j2 ficam alocados na pasta target/log



