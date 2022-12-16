package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import adactinmain.book;
import adactinmain.login;
import adactinmain.logout;
import adactinmain.search;
import adactinmain.slthotel;

public class Page_Object_Manager {
	public WebDriver driver;
	 private login log;
	 private search sch;
	 private slthotel htl;
	 private book bk;
	 private logout lout;
	 public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public login get_Instance_login() {
		 log=new login(driver);
		 return log;
	 }
      public search get_Instance_search() {
    	  sch=new  search(driver);
    	  return sch;
      }
      public slthotel get_Instance_Hotel() {
    	  htl=new slthotel(driver);
    	  return htl;
      }
      public book get_instance_Bok() {
    	  bk=new book(driver);
    	  return bk;
      }
      public logout get_instance_lgout() {
    	  lout=new logout(driver);
    	  return lout;
      }
      
}
