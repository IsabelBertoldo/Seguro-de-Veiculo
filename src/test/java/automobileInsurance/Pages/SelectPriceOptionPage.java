package automobileInsurance.Pages;

import automobileInsurance.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectPriceOptionPage extends BaseTest {
    public SelectPriceOptionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='selectultimate']/following-sibling::span[@class='ideal-radio']")
    private WebElement radioButtonUltimate;
    @FindBy(xpath = "//button[@id=\"nextsendquote\" and @name=\"Next (Send Quote)\"]")
    private WebElement btnNextSendQuote;

    public WebElement getRadioButtonUltimate() { return radioButtonUltimate; }
    public WebElement getBtnNextSendQuote() { return btnNextSendQuote; }
}
