package object_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_Page
{
   @FindBy(xpath = "(//div[@class='ant-menu-submenu-title'])[2]")
   private WebElement clickMain;

   @FindBy(xpath = "//i[@class='icon icon-dasbhoard']")
   private WebElement clickdashboard;
   
    @FindBy(xpath="(//i[@class='icon icon-home'])[1]")
    private WebElement clickPMO;
    
    @FindBy(xpath="(//i[@class='icon icon-home'])[2]")
    private WebElement clickProjectManager;
   
   @FindBy(xpath = "//span[text()='Employee']")
   private WebElement clickEmployee;

   @FindBy(xpath = "//div[text()='Projects']")
   private WebElement clickProjects;

   @FindBy(xpath = "//div[text()='Resources']")
   private WebElement clickResources;

   @FindBy(xpath = "//i[@class='icon icon-email']")
   private WebElement ClickDashbord;

   @FindBy(xpath = "//li[text()='Logout']")
   private WebElement LogoutBtn;
		
   public Home_Page(WebDriver driver)
   {
       PageFactory.initElements(driver, this);
   }  
    public WebElement getClickMain() 
    {
	     return clickMain;
    }
    public WebElement getClickdashboard() 
    {
	return clickdashboard;
    }
   public WebElement getClickPMO() 
   {
	return clickPMO;
   }
   public WebElement getClickProjectManager() 
   {
	return clickProjectManager;
   }
   public WebElement getClickEmployee() 
   {
	return clickEmployee;
   }
  public WebElement getClickProjects() 
  {
	return clickProjects;
  }
  public WebElement getClickResources() 
  {
	return clickResources;
  }
  public WebElement getClickDashbord() 
  {
	return ClickDashbord;
  }
  public WebElement getLogoutBtn() 
  {
	return LogoutBtn;
  }
  public void clickonMain()
	{
	   getClickMain().click();
	}
  public void clickondashboard()
  {
	  getClickdashboard().click();
  }
	 public void clickonPMO()
	 {
		 getClickPMO().click();
	 }
	 public void clickonProjectManager()
	 {
		 getClickProjectManager().click();
	 }
	 public void clickonEmployee()
	 {
		 getClickEmployee().click();
	 }
	public void clickonProjects()
	{
		getClickProjects().click();
	}
	public void clickonResources()
	{
	   getClickResources().click();
	 }
	 public void clickondashboard1()
	{
	    getClickdashboard().click();
	}
	public void clickonLogoutBtn()
	{
	    getLogoutBtn().click();
	 }	
	}
		