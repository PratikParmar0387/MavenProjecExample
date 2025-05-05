package testngexample;

import org.testng.annotations.Test;

public class TestNGAttribute {
    @Test(invocationCount = 100)
    public void attributeExample(){
        System.out.println("TestNg Attribute");
    }
}
