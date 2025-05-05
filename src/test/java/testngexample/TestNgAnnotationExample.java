package testngexample;

import org.testng.annotations.*;

public class TestNgAnnotationExample {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Example");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class Example");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeMethod
    public void preRequisuite(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void postMethod(){
        System.out.println("AfterMethod");
    }
    @Test
    public void verifyGoogle(){
        System.out.println("Verify Google");
    }
    @Test
    public void verifyReddifmail(){
        System.out.println("Verify Redifmail");
    }
    @Test
    public void verifyAmazon(){
        System.out.println("Verify Amazon");
    }


}
