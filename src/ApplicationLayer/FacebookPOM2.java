package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPOM2 {
WebDriver driver;

public void createaccount(WebDriver driver){
this.driver = driver;
}
@FindBy(xpath="//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")
WebElement clickcreateaccount;
@FindBy(xpath="//input[@id='u_0_m']")
WebElement enterfirstname;
@FindBy(xpath="//input[@id='u_0_o']")
WebElement entersurname;
@FindBy(xpath="//input[@id='u_0_r']")
WebElement enteremail;
@FindBy(xpath="//input[@id='u_0_w']")
WebElement enterpassword;
@FindBy(xpath="//input[@id='u_0_7']")
WebElement clickgender;
@FindBy(xpath="//button[@id='u_0_13']")
WebElement clicksignup;	

public void verifyaccount(String firstname,String surname, String email, String password){
	
	this.clickcreateaccount.click();
	this.enterfirstname.sendKeys(firstname);
	this.entersurname.sendKeys(surname);
	this.enteremail.sendKeys(email);
	this.enteremail.sendKeys(password);
	this.clickgender.click();
	this.clicksignup.click();
	
	
	
}
}