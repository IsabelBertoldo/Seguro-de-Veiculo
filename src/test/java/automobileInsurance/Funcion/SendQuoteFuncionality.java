package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.SendQuotePage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SendQuoteFuncionality extends BaseTest {
    private SendQuotePage sendQuotePage;
    private Utils utils;

    public SendQuoteFuncionality(){
        this.sendQuotePage = new SendQuotePage(driver);
        this.utils = new Utils();
    }

    public void preencherSendQuote(){

        if(this.sendQuotePage.getEmail().isEnabled()){
            System.out.println("Campo Email encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.sendQuotePage.getEmail(),"rafael@teste.com.br");
            System.out.println("Campo Email preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher campo Email");
        }

        if(this.sendQuotePage.getUserName().isEnabled()){
            System.out.println("Campo Name encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.sendQuotePage.getUserName(),"Rafa199967");
            System.out.println("Campo Name preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher Campo Name ");
        }

        if(this.sendQuotePage.getPassWord().isEnabled()){
            System.out.println("Campo PassWord encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.sendQuotePage.getPassWord(),"Rafael1010");
            System.out.println("Campo PassWord preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher Campo PassWord");
        }

        if(this.sendQuotePage.getConfirmPassWord().isEnabled()){
            System.out.println("Campo Confirm PassWord encontrado com sucesso!");
            this.utils.preencheCampoTexto(this.sendQuotePage.getConfirmPassWord(),"Rafael1010");
            System.out.println("Campo Confirm PassWord preenchido com sucesso!");
        }
        else { System.out.println("Falha ao preencher Campo Confirm PassWord");
        }
    }

    public void clicarBtnSendEmail() {
        if(this.sendQuotePage.getBtnSendEmail().isEnabled()){
            System.out.println("Botao Send Email encontrado com sucesso!");
            this.sendQuotePage.getBtnSendEmail().click();
            System.out.println("Botao Send Email clicado com sucesso!");
        }
        else { System.out.println("Falha ao clicar no Botao Send Email");
        }

    }

    public String validarMensagemSendingEmailSuccess(){
        wait.until(ExpectedConditions.textToBePresentInElement(this.sendQuotePage.getMessageSendingEmailSuccess(),"Sending e-mail success!"));
        return driver.findElement(By.xpath("//div[@class='sa-icon sa-custom']/following-sibling::h2[contains(text(), 'Sending e-mail success!')]")).getText();
        
    }
   
}

