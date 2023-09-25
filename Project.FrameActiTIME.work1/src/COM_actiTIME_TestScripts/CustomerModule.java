package COM_actiTIME_TestScripts;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.dataloader.impl.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import COM_actiTIME_pom.HomeClass;
import COM_actiTIME_pom.TaskClass;
import Com_actiTIME_generics.BaseClass;
import dev.failsafe.internal.util.Assert;

@Listeners(Com_actiTIME_generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String username=f.getExceldata("CreateCustomer", 1, 2);
		String description=f.getExceldata("CreateCustomer", 1, 3);
		HomeClass h=new HomeClass(driver);
		h.settask();
		TaskClass t=new TaskClass(driver);
		t.getAddbtninhomepage().click();
		t.getAddcustbtnhomepage().click();
		t.getEntercustomernametxt().sendKeys(username);
		t.getCustomerdestxt().sendKeys(description);
		Thread.sleep(2000);
		t.getSelectcustomerdd().click();
		Thread.sleep(2000);
         t.getSelectbigbangcompny().click();
         Thread.sleep(2000);
         t.getCreatebtn().click();
         Thread.sleep(5000);
        String exceptedtitle = t.gettextvalue().getText();
        Thread.sleep(5000);       
        org.testng.Assert.assertEquals(username, exceptedtitle);
	}
@Test
public void createnewproject() throws EncryptedDocumentException, IOException, InterruptedException
{
	String customername = f.getExceldata("CreateCustomer", 1, 2);
	String des = f.getExceldata("CreateCustomer", 1, 3);
	HomeClass l=new HomeClass(driver);
	l.settask();
	TaskClass t=new TaskClass(driver);
	t.getAddbtninhomepage().click();
	t.getnewprojectbutton().click();
	t.getprojectname().sendKeys(customername);
	t.getPleaseSelectCustomertoAddProject().click();
	t.getselectprojectTNB_001().click();
	//Thread.sleep(5000);
	t.getAddProjectDescription().sendKeys(des);
	Thread.sleep(5000);
	t.getentertaskname().sendKeys("abcd");
	Thread.sleep(5000);
	t.getcreateprojectbutton().click();
	Thread.sleep(5000);
	String text = t.getprojecttitleprint().getText();
	org.testng.Assert.assertEquals(customername, text);
	
    //t.getcancelprojectbutton().click();
    //driver.switchTo().alert().accept();
}
/*@Test
public void createnewtask()
{
	HomeClass l=new HomeClass(driver);
	l.settask();
	TaskClass t=new TaskClass(driver);
	t.getCreatebtn();
	t.getclicknewtaskbtn().click();;
	t.getcanceltaskpage();
	
}*/
}
