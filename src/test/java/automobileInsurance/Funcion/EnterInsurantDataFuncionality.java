package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.EnterInsurantDataPage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;

public class EnterInsurantDataFuncionality extends BaseTest {

    private EnterInsurantDataPage enterInsurantDataPage;
    private Utils utils;

    public EnterInsurantDataFuncionality(){
        this.enterInsurantDataPage = new EnterInsurantDataPage(driver);
        this.utils = new Utils();
    }

    public void preencherEnterInsurantData(){

        if(this.enterInsurantDataPage.getFirstName().isEnabled()){
            System.out.println("Campo First Name encontrado com sucesso!");

            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getFirstName(), "Rafael");
            System.out.println("Campo First Name preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o campo First Name");
        }

        if(this.enterInsurantDataPage.getLastName().isEnabled()){
            System.out.println("Campo Last Name encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getLastName(),"Leite");
            System.out.println("Campo Last Name preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o campo Last Name");
        }

        if(this.enterInsurantDataPage.getDateOfBirth().isEnabled()){
            System.out.println("Campo Date of Birth encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getDateOfBirth(),"10/09/1997");
            System.out.println("Campo Date of Birth preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o Campo Date of Birth");
        }

        if(this.enterInsurantDataPage.getSelectGenderMale().isEnabled()){
            System.out.println("Lista Gender encontrada com sucesso!");
            this.enterInsurantDataPage.getSelectGenderMale().click();
            System.out.println("Lista Gender selecionada com sucesso!");
        }
        else { System.out.println("Falha selecionar a lista Gender");
        }

        if(this.enterInsurantDataPage.getStreetAddress().isEnabled()){
            System.out.println("Campo Street Address encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getStreetAddress(),"Rua José de Brito, 240, Casa B");
            System.out.println("Campo Street Address preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o Campo  Street Address");
        }

        if(this.enterInsurantDataPage.getSelectCountry().isEnabled()){
            System.out.println("Campo Country encontrado com sucesso!");
            this.utils.selectByValue(this.enterInsurantDataPage.getSelectCountry(),"Brazil");
            System.out.println("Campo Country preenchido com sucesso!");
        }
        else { System.out.println("Falha ao selecionar o campo Country");
        }

        if(this.enterInsurantDataPage.getZipCode().isEnabled()){
            System.out.println("Campo Zip Code encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getZipCode(),"11453205");
            System.out.println("Campo Zip Code preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o Campo Zip Code");
        }

        if(this.enterInsurantDataPage.getCity().isEnabled()){
            System.out.println("Campo City encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.enterInsurantDataPage.getCity(),"Guarujá");
            System.out.println("Campo City preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher o Campo City");
        }

        if(this.enterInsurantDataPage.getSelectOccupation().isEnabled()){
            System.out.println("Campo Select Occupation encontrado com sucesso!");
            this.utils.selectByValue(this.enterInsurantDataPage.getSelectOccupation(),"Employee");
            System.out.println("Campo Select Occupation preenchido com sucesso!");
        }
        else { System.out.println("Falha ao selecionar o Campo Select Occupation");
        }

        if(this.enterInsurantDataPage.getSelectHobbies().isEnabled()){
            System.out.println("Campo Select Hobbies encontrado com sucesso!");
            this.enterInsurantDataPage.getSelectHobbies().click();
            System.out.println("Campo Select Hobbies selecionado com sucesso!");
        }
        else { System.out.println("Falha ao selecionar o Campo  Select Hobbies");
        }
    }

    public void clicarBtnNextEnterProductData(){

        if(this.enterInsurantDataPage.getBtnNextEnterProductData().isEnabled()){
            System.out.println("Botao Next para pagina Product Data encontrado com sucesso!");
            this.enterInsurantDataPage.getBtnNextEnterProductData().click();
            System.out.println("Botao Next para pagina Product Data pressionado com sucesso!");
        }
        else { System.out.println("Falha ao clicar no Botao Next para pagina Product Data");
        }
    }

    public String validarTituloEnterProductData(){
        return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"enterproductdata\" and @name=\"Enter Product Data\"]")).getText();
       
        
    }
    
}
