package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FacebookPOM {
 WebDriver driver;
//Actions ac;
	
	public void naukrilogin(WebDriver driver) throws Throwable
	{
		this.driver = driver;
	}		
		@FindBy(xpath="//input[@id='email']")
		WebElement entername;
		@FindBy(xpath= "//input[@id='pass']")
		WebElement enterpasword;
		@FindBy(xpath= "//input[@id='u_0_b']")
		WebElement clickonlogin;
		@FindBy(xpath= "//div[@class='_xkt']//a[contains(text(),'Forgotten password?')]")
		WebElement clickonforgetpassword;
		
		
		public void verifylogin(String username, String pasword) throws Throwable
		{
						
			this.entername.sendKeys(username);
			this.enterpasword.sendKeys(pasword);
			this.clickonlogin.click();
			this.clickonforgetpassword.click();
			Thread.sleep(5000);
			
		}
	}
	
