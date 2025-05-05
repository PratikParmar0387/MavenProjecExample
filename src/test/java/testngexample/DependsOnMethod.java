package testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomepage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify On Boarding");
    }
}
