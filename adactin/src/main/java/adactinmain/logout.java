package adactinmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.adactin.Base_Class;



public class logout extends Base_Class {
	@FindBy(id="logout")
	public static WebElement lout;
	public logout(WebDriver Adriver) {
		Base_Class.driver=Adriver;
		PageFactory.initElements(driver, this);

	}

}
