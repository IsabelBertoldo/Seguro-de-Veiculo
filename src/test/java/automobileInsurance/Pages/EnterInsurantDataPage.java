package automobileInsurance.Pages;

import automobileInsurance.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterInsurantDataPage extends BaseTest {
    public EnterInsurantDataPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id=\"make\"]")
    private WebElement campoSelectMake;
    
    @FindBy(xpath = "//li[@class='idealsteps-step-active']/child::a[@id=\"enterinsurantdata\" and @name=\"Enter Insurant Data\"]")
    private WebElement validarFormInsurantData;
    @FindBy(xpath = "//input[@id=\"firstname\" and @name=\"First Name\"]")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id=\"lastname\" and @name=\"Last Name\"]")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id=\"birthdate\" and @name=\"Date of Birth\"]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='gendermale']/following-sibling::span[@class='ideal-radio']")
    private WebElement selectGenderMale;
    @FindBy(xpath = "//input[@id=\"streetaddress\" and @name=\"Street Address\"]")
    private WebElement streetAddress;
    @FindBy(xpath = "//select[@id=\"country\" and @name=\"Country\"]")
    private WebElement selectCountry;
    @FindBy(xpath = "//input[@id=\"zipcode\" and @name=\"Zip Code\"]")
    private WebElement zipCode;
    @FindBy(xpath = "//input[@id=\"city\" and @name=\"City\"]")
    private WebElement city;
    @FindBy(xpath = "//select[@id=\"occupation\" and @name=\"Occupation\"]")
    private WebElement selectOccupation;
    @FindBy(xpath = "//input[@id='other']/following-sibling::span[@class='ideal-check']")
    private WebElement selectHobbies;
    @FindBy(xpath = "//button[@id=\"nextenterproductdata\" and @name=\"Next (Enter Product Data)\"]")
    private WebElement btnNextEnterProductData;

    public WebElement getFirstName() { return firstName; }
    public WebElement getLastName() { return lastName; }
    public WebElement getDateOfBirth() { return dateOfBirth; }
    public WebElement getSelectGenderMale() { return selectGenderMale; }
    public WebElement getSelectCountry() { return selectCountry; }
    public WebElement getZipCode() { return zipCode; }
    public WebElement getSelectOccupation() { return selectOccupation; }
    public WebElement getStreetAddress() { return streetAddress; }
    public WebElement getSelectHobbies() { return selectHobbies; }
    public WebElement getCity() { return city; }
    public WebElement getBtnNextEnterProductData() { return btnNextEnterProductData; }

}
