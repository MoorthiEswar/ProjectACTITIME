package COM_actiTIME_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unbox;
	@FindBy(name = "pwd")
	private WebElement pwbox;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logbtn;
	
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setLogin(String un,String pw) throws InterruptedException
{
	unbox.sendKeys(un);
	//Thread.sleep(4000);
	pwbox.sendKeys(pw);
	//Thread.sleep(4000);
	logbtn.click();
	//Thread.sleep(4000);
}
}
