package com.test;

import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPage;
import com.pages.OrderPage;
import com.pages.StartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AutoPracticeTest extends BaseTest{
	


@Given ("^An URL to launch the page$")
public  void launch() throws IOException{
	this.setUp();
	startPage = PageFactory.initElements(driver, StartPage.class);
	orderPage = PageFactory.initElements(driver, OrderPage.class);	
	driver.get(baseUrl);
	startPage.clickStartBtn();
}

@When("^User logs in$")
public  void login() {	
	loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.login();	
	
}

@Then ("^user is logged in$")
public  void verifyVehicleDetails() throws Exception {
	//this.tearDown();
}

@Given ("^A page to login and order$")
public  void gotoorderspage() throws IOException{	
	this.setUp();
	startPage = PageFactory.initElements(driver, StartPage.class);
	orderPage = PageFactory.initElements(driver, OrderPage.class);	
	driver.get(baseUrl);
	startPage.clickStartBtn();
	loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.login();	
	
	orderPage = PageFactory.initElements(driver, OrderPage.class);	
	orderPage.clickTshirtsLink();
}

@When("^User orders tshirt$")
public  void ordertshirt() {
	orderPage.orderTshirt();
	
}

@Then ("^item exists in order history$")
public  void checkTheItem() throws Exception {
	String items = orderPage.gotocheckoutpage();
	Assert.assertEquals(items, "1 Product");
	this.tearDown();
}

}