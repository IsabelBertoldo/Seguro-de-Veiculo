package automobileInsurance.Pages;

import automobileInsurance.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage extends BaseTest {
    public SendQuotePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email' and @name='E-Mail']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='username' and @name='Username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password' and @name='Password']")
    private WebElement passWord;

    @FindBy(xpath = "//input[@id='confirmpassword' and @name='Confirm Password']")
    private WebElement confirmPassWord;

    @FindBy(xpath = "//button[@id=\"sendemail\" and @name=\"Send E-Mail\"]")
    private WebElement btnSendEmail;

    @FindBy(xpath = "//div[@class='sa-icon sa-custom']/following-sibling::h2[contains(text(), 'Sending e-mail success!')]")
    private WebElement messageSendingEmailSuccess;

    public WebElement getEmail() { return email; }
    public WebElement getUserName() { return userName; }
    public WebElement getPassWord() { return passWord; }
    public WebElement getConfirmPassWord() { return confirmPassWord; }
    public WebElement getBtnSendEmail() { return btnSendEmail; }
    public WebElement getMessageSendingEmailSuccess() { return messageSendingEmailSuccess; }

}
