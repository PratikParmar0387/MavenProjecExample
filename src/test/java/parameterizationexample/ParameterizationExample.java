package parameterizationexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    @Parameters ({"courseName","cityName"})
    @Test

    public void parmeterizationmethod(String courseName,String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement serchTextBox = driver.findElement(By.name("q"));
        serchTextBox.sendKeys(courseName+" "+cityName);
        serchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(1000);


    }


}
