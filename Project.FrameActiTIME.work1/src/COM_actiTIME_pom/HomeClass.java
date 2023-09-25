package COM_actiTIME_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass {
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
	
	@FindBy(id="logoutLink")
	private WebElement logutbtn;
	
public HomeClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void settask()
{
	taskbtn.click();
}

public void setlogout()
{
	logutbtn.click();
}
}
