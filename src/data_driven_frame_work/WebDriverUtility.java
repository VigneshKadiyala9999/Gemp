package data_driven_frame_work;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class WebDriverUtility
{
/**
*
* @param data
* @return
* @throws Exception
*/
public String getDataFromProperty(String data) throws Exception
{
 FileInputStream fis = new FileInputStream("C:\\Users\\vkadiyala\\Desktop\\Manual Testing\\SELENIUM\\LoginCredentilas.properties.txt");
 Properties pobj = new Properties();
 pobj.load(fis);
 return pobj.getProperty(data);
}
/**
 *
 * @param sheet
 * @param rowNum
 * @param cellNum
 * @return
 * @throws Exception
 */
public String getDataFromExcel(String sheet,int rowNum,int cellNum) throws Exception
{
   FileInputStream fis = new FileInputStream("D:\\Selenium_Folder\\Data_Entry.xlsx");
   Workbook book = WorkbookFactory.create(fis); 
   Sheet sh = book.getSheet("USER");
   DataFormatter df = new DataFormatter();
   String value = df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
   return value;
}
/**
 *
 * @return
 */
  public int getRandomclassData()
  {
   Random r = new Random();
   int num = r.nextInt(100);
   return num;
  }
}
