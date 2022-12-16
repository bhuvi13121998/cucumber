package adactinmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.adactin.Base_Class;

public class login extends Base_Class {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	public static WebElement uname;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement Pass;
	@FindBy(xpath="//input[@id='login']")
	public static WebElement Clk;
	
	public login(WebDriver Adriver) {
		login.driver=Adriver;
		PageFactory.initElements(driver, this);
		
	}




}

