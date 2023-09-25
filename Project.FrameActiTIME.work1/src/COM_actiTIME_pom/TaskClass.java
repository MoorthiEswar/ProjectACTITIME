package COM_actiTIME_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_actiTIME_generics.BaseClass;

public class TaskClass extends BaseClass{
    
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[contains(text(),'+ New Customer')]")
	private WebElement addcustbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercusnametxt;//enter the customer name
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement custdestxt;//enter customer description
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcustdd;//select copy project
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectbigbangcompny;//select for project name
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createbtn;//click create button
	
	@FindBy(id="customerLightBoxCloseButton")
	private WebElement cancel;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
    private WebElement gettexttitle;
	
	//new customer created declearation is completed
	
	@FindBy(xpath="//div[text()='+ New Project']")//click new project button
    private WebElement newprojectbutton;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='Enter Project Name' and @class]")//enter project name
	private WebElement enterprojectname;
	
	@FindBy(className ="emptySelection")
	private WebElement pleaseSelectCustomerOrAddProjectDD;
	
	@FindBy(xpath="//div[text()='Axis_001']")
	private WebElement selectprojecttnb_001;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
	private WebElement AddProjectDescriptiontext;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
	private WebElement entertaskbtn;
	//create project button
	@FindBy(xpath="//div[text()='Create Project']")
    private WebElement createprojectbtn;
	//cancel the project
	@FindBy(id="closeProjectLightBoxBtn")
	private WebElement cancelprojectbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@title='liwu']")
	private WebElement projecttitleget;
	
	//create new project decleration is completed
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement clicktaskbtn;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='itemRow selected']")
	private WebElement selectcustomeraddtotask;
	

	@FindBy(id="closeCreateTasksPopupButton")
	private WebElement canceltaskbutton;
public TaskClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getAddbtninhomepage() {
	return addbtn;
}


public WebElement getAddcustbtnhomepage() {
	return addcustbtn;
}


public WebElement getEntercustomernametxt() {
	return entercusnametxt;
}


public WebElement getCustomerdestxt() {
	return custdestxt;
}


public WebElement getSelectcustomerdd() {
	return selectcustdd;
}


public WebElement getSelectbigbangcompny() {
	return selectbigbangcompny;
}


public WebElement getCreatebtn() {
	return createbtn;
}
public WebElement getcancel()
{
	return cancel;
}
public WebElement  gettextvalue()
{
	return gettexttitle;
}
//completed code for createing new customer 


public WebElement  getnewprojectbutton()
{
	return newprojectbutton;
}
public WebElement getprojectname()
{
	return enterprojectname;
}
public WebElement  getPleaseSelectCustomertoAddProject()
{
	return pleaseSelectCustomerOrAddProjectDD;
	
}
public WebElement getselectprojectTNB_001()
{
	return selectprojecttnb_001;
}
public WebElement getAddProjectDescription()
{
	return AddProjectDescriptiontext;
	
}
public WebElement getentertaskname()
{
	return entertaskbtn;
}

public WebElement getcancelprojectbutton()
{
	return cancelprojectbtn;
}
public WebElement getcreateprojectbutton()
{
	return cancelprojectbtn;
}
public WebElement getprojecttitleprint()
{
	return projecttitleget;
	
}

//completed for createing new project
public WebElement getclicknewtaskbtn()
{
	return clicktaskbtn;
}
public WebElement getselectcustomertoaddfortask()
{
	return selectcustomeraddtotask;
}
public WebElement getcanceltaskpage()
{
	return canceltaskbutton;
}
}
