package object_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_Page 
{
	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement userPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SignInBtn;

	public Login_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public WebElement getUserName() 
	{
		return userName;
	}
	public WebElement getUserPassword() 
	{
		return userPassword;
	}
	public WebElement getSignInBtn() 
	{
		return SignInBtn;
	}
	/**
	  *Business Library
	  *@return
	  */
	public void loginPage(String Username ,String Password)
	{
	getUserName().sendKeys(Username);
	getUserPassword().sendKeys(Password);
	getSignInBtn().click();
	}
  }
