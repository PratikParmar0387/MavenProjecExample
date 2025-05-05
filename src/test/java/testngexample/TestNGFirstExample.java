package testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFirstExample {
    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }
    @Test
    public void verifyFirstTest(){

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
        driver.manage().window().maximize();

    }
    @Test
    public void verifyFirst1Test(){

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
        driver.manage().window().maximize();

    }
    @Test
    public void verifyFirst2Test(){

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public  void closeDriver(){
        driver.close();

    }


}
