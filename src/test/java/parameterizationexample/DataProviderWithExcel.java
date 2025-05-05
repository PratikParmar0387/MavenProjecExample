package parameterizationexample;


import FailTestRun.FailtestExample;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import  java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name="Pratik")
    public  Object[][] dataFun() throws IOException,FileNotFoundException {
        Object[][] objArray = getExcelData("C:\\Users\\pratik\\OneDrive\\Desktop\\Test.xlsx","Sheet1");
        return objArray;
    }
    public String[][] getExcelData(String filePath,String sheetName) throws IOException,FileNotFoundException {
        FileInputStream fp = new FileInputStream(filePath);
        XSSFWorkbook  wb = new XSSFWorkbook(fp);
        XSSFSheet sheet = wb.getSheet(sheetName);

        XSSFRow row = sheet.getRow(0);
        int numOfRows = sheet.getPhysicalNumberOfRows();
        int numbOfColumns = row.getLastCellNum();
        Cell cell;
        String[][] data = new String[numOfRows][numbOfColumns];
        for(int i=0;i<numOfRows;i++){
            for(int j=0;j<numbOfColumns;j++){
                row=sheet.getRow(i);
                cell= row.getCell(j);
                data[i][j] = cell.getStringCellValue();
            }

        }
        return data;
    }

    @Test(dataProvider =  "Pratik",retryAnalyzer = FailtestExample.class)
    public void parmeterizationmethod(String courseName,String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement serchTextBox = driver.findElement(By.name("q"));
        serchTextBox.sendKeys(courseName+" "+cityName);
        serchTextBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(false);

        Thread.sleep(1000);
        driver.close();

    }

}
