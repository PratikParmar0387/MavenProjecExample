package mavenexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
        driver.manage().window().maximize();
        driver.close();
    }
}
