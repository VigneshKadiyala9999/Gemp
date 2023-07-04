package testCaseRepoFormPom;
import org.testng.annotations.Test;
import generic_utility.Base_Class;
import object_repository.Home_Page;
public class Main extends Base_Class
{
@Test
public void PerformGPM()
{
Home_Page HOME = new Home_Page(driver); 
HOME.getClickMain();
} 
}
