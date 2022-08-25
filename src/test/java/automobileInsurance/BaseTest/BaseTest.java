package automobileInsurance.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static String url = "http://sampleapp.tricentis.com/101/app.php";

    public BaseTest(){
        startDriver(true);
    }

    protected void startDriver(boolean maximizar) {
        if (driver == null) {
        	//System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver.exe").getPath());
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronner e isabel\\Downloads\\drivers\\chromedriver.exe");
        	driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 10);

            if (maximizar == true){
                driver.manage().window().maximize();
            }
        }
    }
}


