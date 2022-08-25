package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.EnterProductDataPage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;

public class EnterProductDataFuncionality extends BaseTest {
    private EnterProductDataPage enterProductDataPage;
    private Utils utils;

    public EnterProductDataFuncionality(){
        this.enterProductDataPage = new EnterProductDataPage(driver);
        this.utils = new Utils();
    }

    public void preencherEnterProductData(){

        if(this.enterProductDataPage.getStartDate().isEnabled()){
            System.out.println("Campo Start Date encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterProductDataPage.getStartDate(),"10/27/2022");
            System.out.println("Campo Start Date preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o campo Start Date");
        }

        if(this.enterProductDataPage.getInsuranceSum().isEnabled()){
            System.out.println("Lista Insurance Sum encontrada com sucesso!");
            this.utils.selectByValue(this.enterProductDataPage.getInsuranceSum(),"10000000");
            System.out.println("Lista Insurance Sum selecionada com sucesso!");
        }
        else { System.out.println("Falha ao selecionar Lista Insurance Sum");
        }

        if(this.enterProductDataPage.getMeritRating().isEnabled()){
            System.out.println("Lista Merit Rating encontrada com sucesso!");
            this.utils.selectByValue(this.enterProductDataPage.getMeritRating(),"Bonus 5");
            System.out.println("Lista Merit Rating selecionada com sucesso!");
        }
        else { System.out.println("Falha ao selecionar lista Merit Rating");
        }

        if(this.enterProductDataPage.getDamageInsurance().isEnabled()){
            System.out.println("Lista Damage Insurance encontrada com sucesso!");
            this.utils.selectByValue(this.enterProductDataPage.getDamageInsurance(),"Full Coverage");
            System.out.println("Lista Damage Insurance selecionada com sucesso!");
        }
        else { System.out.println("Falha ao selecionar lista Damage Insurance");
        }

        if( this.enterProductDataPage.getEuroProtection().isEnabled()){
            System.out.println("Select Euro Protection encontrado com sucesso!");
            this.enterProductDataPage.getEuroProtection().click();
            System.out.println("Select Euro Protection pressionado com sucesso!");
        }
        else { System.out.println("Falha ao selecionar Euro Protection");
        }

        if(this.enterProductDataPage.getCortesyCar().isEnabled()){
            System.out.println("Lista Cortesy Car encontrado com sucesso!");
            this.utils.selectByValue(this.enterProductDataPage.getCortesyCar(),"Yes");
            System.out.println("Lista Cortesy Car selecionado com sucesso!");
        }
        else { System.out.println("Falha ao selecionar Lista Cortesy Car");
        }

    }
    public void clicarBtnNextSelectPriceOption() {
        if(this.enterProductDataPage.getBtnNextSelectPriceOption().isEnabled()){
            System.out.println("Botao Next para pagina Select Price Option encontrado com sucesso!");
            this.enterProductDataPage.getBtnNextSelectPriceOption().click();
            System.out.println("Botao Next para pagina Select Price Option clicado com sucesso!");
        }
        else { System.out.println("Falha ao clicar Botao Next para pagina Select Price Option");
        }

    }
    
    public String validarTituloSelectPriceOption() {
    	 return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"selectpriceoption\" and @name=\"Select Price Option\"]")).getText();
    }
    
}
