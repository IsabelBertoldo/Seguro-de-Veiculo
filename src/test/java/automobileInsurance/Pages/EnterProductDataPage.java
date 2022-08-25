package automobileInsurance.Pages;

import automobileInsurance.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterProductDataPage extends BaseTest {
    public EnterProductDataPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"startdate\" and @name=\"Start Date\"]")
    private WebElement startDate;
    @FindBy(xpath = "//select[@id=\"insurancesum\" and @name=\"Insurance Sum\"]")
    private WebElement insuranceSum;
    @FindBy(xpath = "//select[@id=\"meritrating\" and @name=\"Merit Rating\"]")
    private WebElement meritRating;
    @FindBy(xpath = "//select[@id=\"damageinsurance\" and @name=\"Damage Insurance\"]")
    private WebElement damageInsurance;
    @FindBy(xpath = "//input[@id='EuroProtection']/following-sibling::span[@class='ideal-check']")
    private WebElement euroProtection;
    @FindBy(xpath = "//select[@id=\"courtesycar\" and @name=\"Courtesy Car\"]")
    private WebElement cortesyCar;
    @FindBy(xpath = "//button[@id=\"nextselectpriceoption\" and @name=\"Next (Select Price Option)\"]")
    private WebElement btnNextSelectPriceOption;
    

    public WebElement getStartDate() { return startDate; }
    public WebElement getInsuranceSum() { return insuranceSum; }
    public WebElement getMeritRating() { return meritRating; }
    public WebElement getDamageInsurance() { return damageInsurance; }
    public WebElement getEuroProtection() { return euroProtection; }
    public WebElement getCortesyCar() { return cortesyCar; }
    public WebElement getBtnNextSelectPriceOption(){return btnNextSelectPriceOption;}

}
