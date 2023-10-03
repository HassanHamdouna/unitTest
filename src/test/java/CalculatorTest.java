import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @DataProvider(name = "divisionData")
    public Object[][] dpMethod() {
        return new Object[][]{
                {10.0F, 5.0f, 2.1f},
                {-10.0f, 5.0f, -2.0f},
                {10.0f, -5.0f, -2.0f},
                {-10.0f, -5.0f, 2.0f},
                {5.0f, 5.0f, 1.0f},

        };
    }
    @DataProvider(name = "Invalid Data")
    public Object[][] dMethod() {
        return new Object[][]{
                {10.0F, 0.0f}

        };
    }


    @Test(dataProvider = "Invalid Data", expectedExceptions = ArithmeticException.class)
    public void testDivisionWithException(float x, float y) {
        Calculator calculator = new Calculator();
        calculator.divide(x,y);
    }
    @Test(dataProvider = "divisionData")
    public void testDivision(float x, float y, float expected) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(x, y), expected);
    }
    @Test(dataProvider = "divisionData")
    public void testDivisionAll(float x, float y, float expected) {
        Calculator calculator = new Calculator();
        float result = calculator.divide(x, y);
        Assert.assertEquals(result, expected);
    }
}
 /*   @Test
    public void testDivision() {
        float result = calculator.divide(15.0f, 3.0f);
        Assert.assertEquals(result, 5.0f, "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        try {
            calculator.divide(10.0f, 0.0f);
            Assert.fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {
            // This is expected; do nothing
        }
    }

    @Test
    public void testNegativeDivision() {
        float result = calculator.divide(-10.0f, 2.0f);
        Assert.assertEquals(result, -5.0f, "Negative division test failed");
    }

    @Test
    public void testZeroDivision() {
        float result = calculator.divide(0.0f, 5.0f);
        Assert.assertEquals(result, 0.0f, "Zero division test failed");
    }

    @Test
    public void testLargerNumbersDivision() {
        float result = calculator.divide(1000.0f, 20.0f);
        Assert.assertEquals(result, 50.0f, "Large numbers division test failed");
    }

    @Test
    public void testNonIntegerDivision() {
        double expectedResult = 3.3333;
        double result = calculator.divide(10.0f, 3.0f);

        double tolerance = 0.001; // Define a tolerance value

        Assert.assertEquals(result, expectedResult, tolerance, "Non-integer division test failed");
    }



    @AfterClass
    public void tearDown() {
        calculator = null;
    }*/

