package com.test;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pages.LoginPage;
import com.pages.OrderPage;
import com.pages.StartPage;
 
public class BaseTest {
 
	protected WebDriver driver;
	protected String baseUrl;
	protected StartPage startPage;
	protected LoginPage loginPage;
	protected OrderPage orderPage;
 
@BeforeSuite
	public void setUp() {
		baseUrl = "http://automationpractice.com/index.php";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
 
@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();
 
	}
}
