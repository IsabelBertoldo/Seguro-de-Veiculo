package automobileInsurance.BaseTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BaseTest {

    public void selectByValue(WebElement select, String value) {
        Select elemento = new Select(select);
        elemento.selectByValue(value);
    }

    public void preencheCampoTexto(WebElement elemento, String value) {
        elemento.sendKeys(value);
    }

}

