package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.*;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterVehicleDataFuncionality extends BaseTest {

    private EnterVehicleDataPage enterVehicleDataPage;
    private Utils utils;

   public EnterVehicleDataFuncionality(){
       this.enterVehicleDataPage = new EnterVehicleDataPage(driver);
       this.utils = new Utils();
   }

   public void preencherEnterVehicleData() {

       if(this.enterVehicleDataPage.getOpenListMake().isEnabled()){
           System.out.println("Lista de Marca encontrada com sucesso!");
           this.utils.selectByValue(this.enterVehicleDataPage.getOpenListMake(), "Audi");
           System.out.println("Marca Selecionada com sucesso!");
       }
       else { System.out.println("Falha ao selecionar a Lista de Marca");
       }

       if(this.enterVehicleDataPage.getOpenListModelCar().isEnabled()){
           System.out.println("Lista de Modelo encontrada com sucesso!");
           this.utils.selectByValue(this.enterVehicleDataPage.getOpenListModelCar(), "Scooter");
           System.out.println("Modelo Selecionado com sucesso!");
       }
       else { System.out.println("Falha ao selecionar a Lista de Modelo");
       }

       if(this.enterVehicleDataPage.getTextBoxCylinderCapacity().isEnabled()){
           System.out.println("Campo Cylinder Capacity encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxCylinderCapacity(), "200");
           System.out.println("Campo Cylinder Capacity preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo Cylinder Capacity");
       }

       if(this.enterVehicleDataPage.getTextBoxEnginePerformance().isEnabled()){
           System.out.println("Campo Engine Performance encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxEnginePerformance(), "500");
           System.out.println("Campo Engine Performance preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo Engine Performance");
       }

       if(this.enterVehicleDataPage.getDateOfManuFacture().isEnabled()){
           System.out.println("Campo Date of ManuFacture encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getDateOfManuFacture(), "09/10/2020");
           System.out.println("Campo Date of ManuFacture preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo Date of ManuFacture");
       }

       if(this.enterVehicleDataPage.getOpenListNumberOfSeats().isEnabled()){
           System.out.println("Lista Number of Seats encontrado com sucesso!");
           this.utils.selectByValue(this.enterVehicleDataPage.getOpenListNumberOfSeats(), "4");
           System.out.println("Lista Number of Seats selecionada com sucesso!");
       }
       else { System.out.println("Falha ao selecionar a Lista Number of Seats");
       }

       if(this.enterVehicleDataPage.getSelectRightHandDriveYes().isEnabled()){
           System.out.println("Botao Right Hand Drive - Yes encontrado com sucesso!");
           this.enterVehicleDataPage.getSelectRightHandDriveYes().click();
           System.out.println("Botao Right Hand Drive - Yes clicado com sucesso!");
       }
       else { System.out.println("Falha ao clicar no botao Yes - Right Hand Drive");
       }

       if(this.enterVehicleDataPage.getOpenListNumberOfSeatsMotorcycle().isEnabled()){
           System.out.println("Lista Number of Seats Motorcycle encontrada com sucesso!");
           this.utils.selectByValue(this.enterVehicleDataPage.getOpenListNumberOfSeatsMotorcycle(), "2");
           System.out.println("Lista Number of Seats Motorcycle preenchida com sucesso!");
       }
       else { System.out.println("Falha ao selecionar a Lista Number of Seats Motorcycle");
       }

       if(this.enterVehicleDataPage.getOpenListFuelType().isEnabled()){
           System.out.println("Lista Fuel Type encontrada com sucesso!");
           this.utils.selectByValue(this.enterVehicleDataPage.getOpenListFuelType(), "Diesel");
           System.out.println("Lista Fuel Type preenchida com sucesso!");
       }
       else { System.out.println("Falha ao selecionar a Lista Fuel Type");
       }

       if(this.enterVehicleDataPage.getTextBoxPayload().isEnabled()){
           System.out.println("Campo Payload encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxPayload(), "200");
           System.out.println("Campo Payload preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher no campo Payload");
       }

       if(this.enterVehicleDataPage.getTextBoxTotalWeight().isEnabled()){
           System.out.println("Campo Total Weight encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxTotalWeight(), "500");
           System.out.println("Campo Total Weight preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo Total Weight");
       }

       if(this.enterVehicleDataPage.getTextBoxListPrice().isEnabled()){
           System.out.println("Campo List Price encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxListPrice(), "100000");
           System.out.println("Campo List Price preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo List Price");
       }

       if(this.enterVehicleDataPage.getTextBoxLicensePlateNumber().isEnabled()){
           System.out.println("Campo License Plate Number encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxLicensePlateNumber(), "000000000");
           System.out.println("Campo License Plate Number preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo License Plate Number");
       }

       if(this.enterVehicleDataPage.getTextBoxAnnualMileage().isEnabled()){
           System.out.println("Campo Annual Mileage encontrado com sucesso!");
           this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxAnnualMileage(), "100000");
           System.out.println("Campo Annual Mileage preenchido com sucesso!");
       }
       else { System.out.println("Falha ao preencher o campo Annual Mileage");
       }
   }

    public void clicarBtnNextEnterInsurantData(){
        if(this.enterVehicleDataPage.getBtnNextInsurantData().isEnabled()){
            System.out.println("Botao Next para a Pagina Insurant Data encontrado com sucesso!");
            this.enterVehicleDataPage.getBtnNextInsurantData().click();
            System.out.println("Botao Next para a Pagina Insurant Data clicado com sucesso!");
        }
        else { System.out.println("Falha ao Clicar no botao Next para a Pagina Insurant Data");
        }
    }

    public String validarTituloEnterInsuranceData() {
    	return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"enterinsurantdata\" and @name=\"Enter Insurant Data\"]")).getText();
    }
}
