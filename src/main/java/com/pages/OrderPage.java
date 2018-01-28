package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {

@FindBy (xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
private WebElement tshirts;

@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")
private WebElement addToCart;

@FindBy (xpath="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
private WebElement checkoutBtn;

@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div/h1/span/span")
private WebElement itemLabel;





public void clickTshirtsLink(){
	tshirts.click();

	
}
public void orderTshirt(){
	 addToCart.click();

	
}
public String gotocheckoutpage(){
	checkoutBtn.click();
	return itemLabel.getText();

	
}

}
