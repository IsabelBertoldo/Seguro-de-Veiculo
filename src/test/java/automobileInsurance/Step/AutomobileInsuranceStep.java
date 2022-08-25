package automobileInsurance.Step;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Funcion.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomobileInsuranceStep extends BaseTest {

    private EnterVehicleDataFuncionality enterVehicleDataFuncionality;
    private EnterProductDataFuncionality enterProductDataFuncionality;
    private EnterInsurantDataFuncionality enterInsurantDataFuncionality;
    private SelectPriceOptionFuncionality selectPriceOptionFuncionality;
    private SendQuoteFuncionality sendQuoteFuncionality;

    public AutomobileInsuranceStep(){

        this.enterVehicleDataFuncionality = new EnterVehicleDataFuncionality();
        this.enterInsurantDataFuncionality = new EnterInsurantDataFuncionality();
        this.enterProductDataFuncionality = new EnterProductDataFuncionality();
        this.selectPriceOptionFuncionality = new SelectPriceOptionFuncionality();
        this.sendQuoteFuncionality = new SendQuoteFuncionality();
    }

    //CT001 - Cadastrar Dados Do Veiculo

    @Given("preencho os dados do veiculo")
    public void preencho_os_dados_do_veiculo() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
    }

    @When("clico no botao next enter insurant data")
    public void clico_no_botao_next_enter_insurant_data() {
      this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
    }

    @Then("valido a tela de dados do seguro")
    public void valido_a_tela_de_dados_do_seguro() {
         this.enterVehicleDataFuncionality.validarTituloEnterInsuranceData();
    }
    //CT002
    @Given("que estou na tela de dados do seguro")
    public void que_estou_na_tela_de_dados_do_seguro() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
    }
    @When("preencho os dados do seguro")
    public void preencho_os_dados_do_seguro() { this.enterInsurantDataFuncionality.preencherEnterInsurantData(); }

    @And("clico no botao next enter product data")
    public void clicoNoBotaoNextEnterProductData() { this.enterInsurantDataFuncionality.clicarBtnNextEnterProductData(); }

    @Then("valido a tela de dados do produto")
    public void valido_a_tela_de_dados_do_produto() { this.enterInsurantDataFuncionality.validarTituloEnterProductData();}

    //CT003 
    @Given("que estou na tela de dados do produto")
    public void que_estou_na_tela_de_dados_do_produto() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarBtnNextEnterProductData();
    }
    @When("preencho os dados do produto")
    public void preencho_os_dados_do_produto() { this.enterProductDataFuncionality.preencherEnterProductData(); }

    @And("clico no botao next select price option")
    public void clicoNoBotaoNextSelectPriceOption() { this.enterProductDataFuncionality.clicarBtnNextSelectPriceOption(); }

    @Then("valido a tela de opcao de preco")
    public void valido_a_tela_de_opcao_de_preco() {  this.enterProductDataFuncionality.validarTituloSelectPriceOption();}

    //CT004
    @Given("que estou na tela de selecionar opcao de preco")
    public void que_estou_na_tela_de_selecionar_opcao_de_preco() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarBtnNextEnterProductData();
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNextSelectPriceOption();
    }
    @When("seleciono a opcao de preco")
    public void seleciono_a_opcao_de_preco() { this.selectPriceOptionFuncionality.preencherSelectPriceOption();}

    @And("clico no botao next send quote")
    public void clicoNoBotãoNextSendQuote() { this.selectPriceOptionFuncionality.clicarBtnNextSendQuote();}
    
    @Then("valido a tela de envio de cotacao")
    public void valido_a_tela_de_envio_de_cotacao() {this.selectPriceOptionFuncionality.validarTituloSendQuote();}

    //CT005
    @Given("que estou na tela de envio de cotacao")
    public void que_estou_na_tela_de_envio_de_cotacao() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarBtnNextEnterProductData();
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNextSelectPriceOption();
        this.selectPriceOptionFuncionality.preencherSelectPriceOption();
        this.selectPriceOptionFuncionality.clicarBtnNextSendQuote();
    }
    @When("preencho os dados para envio")
    public void preencho_os_dados_para_envio() { this.sendQuoteFuncionality.preencherSendQuote(); }

    @And("clico no botao send")
    public void clicoNoBotaoSend() { this.sendQuoteFuncionality.clicarBtnSendEmail();}

    @Then("valido a mensagem de confirmacao de envio")
    public void valido_a_mensagem_de_confirmacao_de_envio() {  this.sendQuoteFuncionality.validarMensagemSendingEmailSuccess(); }

    //CT006

    @Given("preencho o formulario de dados do veiculo")
    public void preencho_o_formulario_de_dados_do_veiculo() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNextEnterInsurantData();
    }

    @And("preencho o formulario de dados do seguro")
    public void preencho_o_formulario_de_dados_do_seguro() {
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarBtnNextEnterProductData();
    }

    @And("preencho o formulario de dados do produto")
    public void preencho_o_formulario_de_dados_do_produto() {
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNextSelectPriceOption();
    }

    @And("seleciono a opcao de preco desejada")
    public void seleciono_a_opcao_de_preco_desejada() {
        this.selectPriceOptionFuncionality.preencherSelectPriceOption();
        this.selectPriceOptionFuncionality.clicarBtnNextSendQuote();
    }

    @When("preencho o formulario para envio de cotacao")
    public void preencho_o_formulario_para_envio_de_cotacao() {
        this.sendQuoteFuncionality.preencherSendQuote();
        this.sendQuoteFuncionality.clicarBtnSendEmail();
    }

    @Then("valido mensagem de envio de cotacao")
    public void valido_mensagem_de_envio_de_cotacao() {this.sendQuoteFuncionality.validarMensagemSendingEmailSuccess();}

    //CT007


    @Before
    public void setUp(){ driver.get(url); }
    

    public static void tearDown(){/*driver.close();*/}


}


