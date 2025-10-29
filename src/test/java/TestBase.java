import org.testng.annotations.*;

public class TestBase {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I run before suite!");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I run after suite!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I run before all tests!");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I run after all tests!");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("I run before test groups!");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("I run after test groups!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I run before test class.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I run after test class.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I run before each method.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I run after each method.");
    }

}
