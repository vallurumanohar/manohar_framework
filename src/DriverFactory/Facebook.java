package DriverFactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ApplicationLayer.FacebookPOM;
import ApplicationLayer.FacebookPOM2;

public class Facebook {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	
	@Test
	public void setup() throws Throwable{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manohar\\Desktop\\SeleniumFrameWork\\eclipse-jee-mars-2\\eclipse-workspace\\Manohar_Framework\\CommonDrivers\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
		@Test
		public void startTest() throws Throwable{
			FacebookPOM login = PageFactory.initElements(driver,FacebookPOM.class);
		login.verifylogin("manohar","ewfw123");
		login.naukrilogin(driver);
		Thread.sleep(5000);
		}
		@Test
		public void startTest1() throws Throwable{
			FacebookPOM2 create=PageFactory.initElements(driver, FacebookPOM2.class);
			create.createaccount(driver);
		create.verifyaccount("manohar", "valluru", "vallurumanohar@gmail.com", "manohar123");
Thread.sleep(3000);
		}
@Test
public void teardown(){
driver.close();
	}

}
