package Com_actiTIME_generics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import COM_actiTIME_pom.HomeClass;
import COM_actiTIME_pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static FileLib f=new FileLib();
	@BeforeTest
	public void openthebrowser()
	{
		Reporter.log("browser is open",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void Login() throws  InterruptedException, IOException
	{
		String url = f.getpropertydata("url");
		String un = f.getpropertydata("username");
		String pw = f.getpropertydata("password");
		driver.get(url);		
		LoginPage p=new LoginPage(driver);
		p.setLogin(un, pw);
		Reporter.log("successfull application page logined",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("successfull application page logouted",true);
		HomeClass h=new HomeClass(driver);
		h.setlogout();
	}
	@AfterTest
	public void closethebrowser()
	{
		driver.close();
		Reporter.log("successfull application page logined",true);
	}

}
