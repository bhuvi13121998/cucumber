package adactin_testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.adactin.Base_Class;
import com.adactinsite.helper.File_Reader_Manager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//adactin_featurre",
glue="adactin//stepdef",
monochrome=true,
dryRun = false,
strict=false,
tags=("@FirstTest"),
plugin={"html:Report/HTML_Report",
"pretty",
"json:Report/CucumberJSON_Report.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtendReport.html"
}
)

public class Test_Runner extends Base_Class{
	public static WebDriver driver;
	@BeforeClass
		public static void set_Up() throws Throwable {
			
		String browser =File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		
		
		driver=Base_Class.dd(browser);

		}
	    
	
	
	@AfterClass
	public static void tear_Down() {
		
	}
	

}
