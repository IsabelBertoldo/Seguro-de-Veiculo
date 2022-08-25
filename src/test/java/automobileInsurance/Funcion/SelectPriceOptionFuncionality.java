package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.SelectPriceOptionPage;
import org.openqa.selenium.By;

public class SelectPriceOptionFuncionality extends BaseTest {
    private SelectPriceOptionPage selectPriceOptionPage;

    public SelectPriceOptionFuncionality() { this.selectPriceOptionPage = new SelectPriceOptionPage(driver); }

    public void preencherSelectPriceOption() {

        if(this.selectPriceOptionPage.getRadioButtonUltimate().isEnabled()){
            System.out.println("Botao Ultimate encontrado com sucesso!");
            this.selectPriceOptionPage.getRadioButtonUltimate().click();
            System.out.println("Botao Ultimate selecionado clicado com sucesso!");
        }
        else { System.out.println("Falha ao selecionar Botao Ultimate");
        }
    }

    public void clicarBtnNextSendQuote() {
        if(this.selectPriceOptionPage.getBtnNextSendQuote().isEnabled()){
            System.out.println("Botao Next para pagina Send Quote encontrado com sucesso!");
            this.selectPriceOptionPage.getBtnNextSendQuote().click();
            System.out.println("Botao Next para pagina Send Quote clicado com sucesso!");
        }
        else { System.out.println("Falha ao clicar o Botao Next para pagina Send Quote ");
        }
    }
    
    public String validarTituloSendQuote() {
    	return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"sendquote\" and @name=\"Send Quote\"]")).getText();
    }
}
