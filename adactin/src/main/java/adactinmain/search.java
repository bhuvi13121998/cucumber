package adactinmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.adactin.Base_Class;

public class search extends Base_Class {
	//location
	@FindBy(xpath="//select[@id='location']")
	public static WebElement loction;
	//hotel
	@FindBy(xpath="//select[@id='hotels']")
	public static WebElement hotel;
	//Room type
	@FindBy(xpath="//select[@id='room_type']")
	public static WebElement room;
	//noofrrom
	@FindBy(xpath="//select[@id='room_nos']")
	public static WebElement noofroom;
	//checkin
	@FindBy(xpath="//input[@id='datepick_in']")
	public static WebElement checki;
	//checkout
	@FindBy(xpath="//input[@id='datepick_out']")
	public static WebElement checkout;
	//adult
	@FindBy(xpath="//select[@name='adult_room']")
	public static WebElement adult;
	//child
	@FindBy(xpath="//select[@name='child_room']")
	public static WebElement child;
	//search
	@FindBy(xpath="//input[@id='Submit']")
	public static WebElement sarch;
	
	public search(WebDriver Adriver) {
		Base_Class.driver=Adriver;
		PageFactory.initElements(driver, this);

	}
}
