package automobileInsurance.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import automobileInsurance.BaseTest.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)	
@CucumberOptions(monochrome= true,
				 features= "src/test/java/automobileInsurance/features/CT006 - Solicitar cotacao de seguro de automovel.feature",
				 glue = "automobileInsurance")

public class AutomobileInsuranceTest extends BaseTest {
	
	@BeforeClass
	public static void setUp() throws Exception {
		
	}
	
	@AfterClass
	public static void cleanUp() throws Exception {
		
		
	}
}
