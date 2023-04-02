package testNg;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("In Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("    In Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("        In Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("            In Before Method");
    }
    //Test Method

    @AfterMethod
    public void afterMethod(){
        System.out.println("            In After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("        In After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("    In After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("In After Suite");
    }
}
