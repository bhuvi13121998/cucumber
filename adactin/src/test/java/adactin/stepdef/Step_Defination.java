package adactin.stepdef;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.adactin.adactin.Base_Class;
import com.adactinsite.helper.File_Reader_Manager;
import com.adactinsite.helper.Page_Object_Manager;
import adactin_testrunner.Test_Runner;
import adactinmain.book;
import adactinmain.login;
import adactinmain.logout;
import adactinmain.search;
import adactinmain.slthotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination extends Base_Class{
	public static WebDriver driver=Test_Runner.driver;
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static login Log =new login(driver);
	public static search sea=new search(driver);
	public static slthotel slt=new slthotel(driver);
	public static book bk=new book(driver);
	public static logout lot=new logout(driver);
	
	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

   @Given("^User Launch The Application$")
   public void user_Launch_The_Application() throws Throwable {
	   getURL("https://adactinhotelapp.com/");
    
}

//	@Given("^User Launch The Application;$")
//	public void user_Launch_The_Application() throws Throwable {
//		//String url = File_Reader_Manager.getInstance().getInstanceCR().get_url();
//		getURL("https://adactinhotelapp.com/");
//	}
//	@When("^User Enter The UserName In UserName Field;$")
//	public void user_Enter_The_UserName_In_UserName_Field() throws Throwable {
//		sendkey(pom.get_Instance_login().uname,"bhuvaneshc97@gmail.com"); 
//
//	}
//	
	@When("^User Enter The \"([^\"]*)\" In UserName Field$")
	public void user_Enter_The_In_UserName_Field(String uname) throws Throwable {
		sendkey(pom.get_Instance_login().uname,uname); 
	}

	@When("^User Enter The \"([^\"]*)\" In Pword Field$")
	public void user_Enter_The_In_Pword_Field(String pass) throws Throwable {
		sendkey(pom.get_Instance_login().Pass,pass);
	}


//	@When("^User Enter The Password In Password Field;$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//		
//	 sendkey(pom.get_Instance_login().Pass,"b225138*");
//	}
//		
		
	@Then("^User Click On Login Button And It Navigate To the Search Hotel$")
	public void user_Click_On_Login_Button_And_It_Navigate_To_the_Search_Hotel() throws Throwable {
		ck(pom.get_Instance_login().Clk);
	}

	   
	   

	@When("^User Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	   selectbyindex(pom.get_Instance_search().loction,(1));
	}

	@When("^User Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
		selectbyindex(pom.get_Instance_search().hotel,(2));  
	}

	@When("^User Select The Room Type In RoomType Field$")
	public void user_Select_The_Room_Type_In_RoomType_Field() throws Throwable {
		selectbyindex(pom.get_Instance_search().room,(1));
	}

	@When("^User Select the Number Of Rooms Field$")
	public void user_Select_the_Number_Of_Rooms_Field() throws Throwable {
		selectbyindex(pom.get_Instance_search().noofroom,(1));
	}

	@When("^User Enter The Check In Date In CheckIn Field$")
	public void user_Enter_The_Check_In_Date_In_CheckIn_Field() throws Throwable {
	   sendkey(pom.get_Instance_search().checki,"15/06/2021");
	}

	@When("^User Enter The Check Out Date In CheckOut Field$")
	public void user_Enter_The_Check_Out_Date_In_CheckOut_Field() throws Throwable {
	   sendkey(pom.get_Instance_search().checkout,"18/06/2021");
	}

	@When("^User Enter The Number Adults Per Room in Adults Field$")
	public void user_Enter_The_Number_Adults_Per_Room_in_Adults_Field() throws Throwable {
		selectbyindex(pom.get_Instance_search().adult,(2));
	}

	@When("^User Enter The Number Childers Per Room In Childrens Field$")
	public void user_Enter_The_Number_Childers_Per_Room_In_Childrens_Field() throws Throwable {
		selectbyindex(pom.get_Instance_search().child,(1));
	}

	@Then("^User Click On Search Button And It Navigate To The Select Hotel$")
	public void user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel() throws Throwable {
	    ck(pom.get_Instance_search().sarch);
	}

	@When("^User Select The Hotel In Select Field$")
	public void user_Select_The_Hotel_In_Select_Field() throws Throwable {
	    ck(pom.get_Instance_Hotel().rdio);
	}

	@Then("^User Click On Continue Button And It Navigate To the Book Hotel$")
	public void user_Click_On_Continue_Button_And_It_Navigate_To_the_Book_Hotel() throws Throwable {
	    ck(pom.get_Instance_Hotel().cntinue);
	}

	@When("^User Enters the UserName In UserName Field$")
	public void user_Enters_the_UserName_In_UserName_Field() throws Throwable {
	   sendkey(pom.get_instance_Bok().fname,"bhov");
	}

	@When("^User Enters the LastName In LastName Filed$")
	public void user_Enters_the_LastName_In_LastName_Filed() throws Throwable {
	    sendkey(pom.get_instance_Bok().lname,"chin");
	}

	@When("^User Enters The Address In Billing Address Field$")
	public void user_Enters_The_Address_In_Billing_Address_Field() throws Throwable {
	    sendkey(pom.get_instance_Bok().addrs,"mettur");
	}

	@When("^User Enters The Credit Card No In CreditCard Field$")
	public void user_Enters_The_Credit_Card_No_In_CreditCard_Field() throws Throwable {
	    sendkey(pom.get_instance_Bok().cc,"1234567891234567");
	   
	}


@When("^User Select The Credit Card Type In CreditCard Field$")
public void user_Select_The_Credit_Card_Type_In_CreditCard_Field() throws Throwable {
	    ck(pom.get_instance_Bok().cctype);
	}

@When("^User Select The Expiry Month And Year In Expiry Field$")
public void user_Select_The_Expiry_Month_And_Year_In_Expiry_Field() throws Throwable {
	   ck(pom.get_instance_Bok().month);
	   ck(pom.get_instance_Bok().year);
	   
	}

@When("^User Enters The CVV Number In CVV Number field$")
public void user_Enters_The_CVV_Number_In_CVV_Number_field() throws Throwable {
		String CCV =File_Reader_Manager.getInstance().getInstanceCR().get_ccv();
		sendkey(bk.ccv, CCV);
	 // sendkey(pom.get_instance_Bok().ccv,CCV);
	}

	@Then("^User Click On The Book Now Button It Navigate To The Book Confirmation$")
	public void user_Click_On_The_Book_Now_Button_It_Navigate_To_The_Book_Confirmation() throws Throwable {
	   ck(pom.get_instance_Bok().submit);
	   Thread.sleep(10000);
	}

	@Then("^User Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
	 ck(pom.get_instance_lgout().lout);  
	}
	

}


