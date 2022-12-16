package adactinmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.adactin.Base_Class;

public class slthotel extends Base_Class {
	//radio
	@FindBy(id="radiobutton_0")
	public static WebElement rdio;
	//continue
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement cntinue;
	
	public slthotel(WebDriver Adriver) {
		Base_Class.driver=Adriver;
		PageFactory.initElements(driver, this);

	}
}
