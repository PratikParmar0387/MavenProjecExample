package testngexample;

import org.testng.annotations.Test;

public class PriorityExample {
   @Test(priority = 1)
    public void testZ(){
       System.out.println("Test Z");
   }
   @Test(priority = 2)
    public void testH(){
       System.out.println("Test H");
   }
   @Test(priority = 3)
    public void testA(){
       System.out.println("Test A");
   }
}
