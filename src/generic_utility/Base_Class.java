package generic_utility;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Parameters;
import data_driven_frame_work.WebDriverUtility;
import object_repository.Home_Page;
import object_repository.Login_Page;
/**
* This class consists with all the common properties of GemPrism application 
*
* 
*
*/
public class Base_Class
{
 /**
 *Global object of WebDriverUtility class and WebDriver
 */
WebDriverUtility WUTIL = new WebDriverUtility();
public static WebDriver driver = null;
//Creating Connection With DataBase
 @BeforeSuite(alwaysRun = true)
public void establishDbConnection()
{
   System.out.println("Connecton Establish sucessfull!!");
}
 @BeforeClass(alwaysRun = true)
   public void ConfigureBrowser() throws Exception
 {
	 driver = new ChromeDriver();
	 String URL = WUTIL.getDataFromProperty("url");
     System.out.println("Chrome Browser Launched");
     driver.get(URL); 
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize(); 
 }
 @BeforeMethod(alwaysRun = true)
 public void LoginGPM() throws Exception
 {
 String USERNAME = WUTIL.getDataFromProperty("username");
 String PASSWORD = WUTIL.getDataFromProperty("password");
 Login_Page LOGIN = new Login_Page(driver);
 LOGIN.loginPage(USERNAME,PASSWORD);
 Thread.sleep(4000);
 }
 @AfterMethod(alwaysRun = true)
 public void LogoutGPM()
 {
 // driver.findElement(By.xpath("//a[text()='Logout']")).click();
  Home_Page HOME = new Home_Page(driver);
  HOME.getLogoutBtn();
 }
 @AfterClass(alwaysRun = true)
   public void CloseBrowser()
   {
      driver.quit();
   }
 @AfterSuite(alwaysRun = true)
  public void CloseConnection()
  {
     System.out.println("Connection Closed Successfully!!!");
     
  }
 
 
 
 
 
 
 
 
 
 
 }