package automobileInsurance.Pages;

import automobileInsurance.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicleDataPage extends BaseTest {
    public EnterVehicleDataPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id=\"make\"]")
    private WebElement openListMake;
    @FindBy(xpath ="//select[@id=\"model\"]")
    private WebElement openListModelCar;
    @FindBy(xpath = "//input[@id=\"dateofmanufacture\" and @name=\"Date of Manufacture\"]")
    private WebElement dateOfManuFacture;
    @FindBy(xpath = "//input[@id=\"cylindercapacity\" and @name=\"Cylinder Capacity\"]")
    private WebElement textboxCylinderCapacity;
    @FindBy(xpath = "//input[@id=\"engineperformance\" and @name=\"[kW]\"]")
    private WebElement textBoxEnginePerformance;
    @FindBy(xpath = "//select[@id=\"numberofseats\"]")
    private WebElement openListNumberOfSeats;
    @FindBy(xpath = "//input[@id='righthanddriveyes']/following-sibling::span[@class='ideal-radio']")
    private WebElement selectRightHandDriveYes;
    @FindBy(xpath = "//select[@id=\"numberofseatsmotorcycle\"]")
    private WebElement openListNumberOfSeatsMotorcycle;
    @FindBy(xpath = "//select[@id=\"fuel\"]")
    private WebElement openListFuelType;
    @FindBy(xpath ="//input[@id=\"payload\" and @name=\"Payload\"] ")
    private WebElement textBoxPayload;
    @FindBy(xpath ="//input[@id=\"totalweight\" and @name=\"Total Weight\"]")
    private WebElement textBoxTotalWeight;
    @FindBy(xpath ="//input[@id=\"listprice\" and @name=\"List Price\"]")
    private WebElement textBoxListPrice;
    @FindBy(xpath ="//input[@id=\"licenseplatenumber\" and @name=\"License Plate Number\"]")
    private WebElement textBoxLicensePlateNumber;
    @FindBy(xpath ="//input[@id=\"annualmileage\" and @name=\"Annual Mileage\"]")
    private WebElement textBoxAnnualMileage;
    @FindBy(xpath = "//button[@id=\"nextenterinsurantdata\" and @name=\"Next (Enter Insurant Data)\"]")
    private WebElement btnNextInsurantData;

    public WebElement getOpenListMake(){ return openListMake; }
    public WebElement getOpenListModelCar(){return openListModelCar;}
    public WebElement getDateOfManuFacture() { return dateOfManuFacture; }
    public WebElement getTextBoxCylinderCapacity(){return textboxCylinderCapacity;}
    public WebElement getTextBoxEnginePerformance(){return textBoxEnginePerformance;}
    public WebElement getOpenListNumberOfSeats(){return openListNumberOfSeats;}
    public WebElement getSelectRightHandDriveYes() { return selectRightHandDriveYes; }
    public WebElement getOpenListNumberOfSeatsMotorcycle() { return openListNumberOfSeatsMotorcycle; }
    public WebElement getOpenListFuelType() { return openListFuelType; }
    public WebElement getTextBoxPayload() { return textBoxPayload; }
    public WebElement getTextBoxTotalWeight() { return textBoxTotalWeight; }
    public WebElement getTextBoxListPrice() { return textBoxListPrice; }
    public WebElement getTextBoxLicensePlateNumber() { return textBoxLicensePlateNumber; }
    public WebElement getTextBoxAnnualMileage() { return textBoxAnnualMileage; }
    public WebElement getBtnNextInsurantData() { return btnNextInsurantData; }



}
