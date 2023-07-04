package data_driven_frame_work;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import generic_utility.Base_Class;
public class TC_01 extends Base_Class
{
@Test
 public void Gpm() throws Exception
 {
	WebDriverUtility WUTIL = new WebDriverUtility();
    String USERNAME = WUTIL.getDataFromProperty("username");
	String PASSWORD = WUTIL.getDataFromProperty("password");
	String URL = WUTIL.getDataFromProperty("url");
	String BROWSER = WUTIL.getDataFromProperty("browser");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Home']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@class='ant-menu-item ant-menu-item-only-child ant-menu-item-selected']")).click();
	driver.findElement(By.xpath("(//div[@class='ant-menu-submenu-title'])[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='/timesheets/submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()=' New Timesheet']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='ant-btn gx-mt-3 addBtn ant-btn-text']")).click();
	driver.findElement(By.xpath("//span[@class='ant-cascader-picker']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='ant-cascader-menu']")).click();
	driver.findElement(By.xpath("//li[text()='Project Not Assigne']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//span[text()=' / ']")).click();
	Thread.sleep(3500);
	//Actions Ac = new Actions(driver);
	//WebElement e1 = driver.findElement(By.xpath("//span[@class='ant-cascader-picker-label']"));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//ssAc.doubleClick(e1).perform();
 } 
}







