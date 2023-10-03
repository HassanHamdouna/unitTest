import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {


    @BeforeMethod
    public void printStatusBeforeMethod(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+" printStatus BeforeMethod");

    }
    @AfterMethod
    public void printStatusAfterMethod(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+" printStatus AfterMethod");

    }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("BeforeMethod hassan");
        Assert.assertTrue(5 == 5);
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod hassan");
    }
    @Test(priority = 1)
    public void testMultiplication(){
        System.out.println(" test hassan");
        Assert.assertTrue(5 == 5);
    }
}
