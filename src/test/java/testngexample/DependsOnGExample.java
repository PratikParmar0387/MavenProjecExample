package testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.fail();
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomepage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify On Boarding");
    }
}
