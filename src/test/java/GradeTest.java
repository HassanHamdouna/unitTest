import org.example.Grade;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GradeTest {

    private Grade grade;

    @DataProvider(name = "gradeData")
    public Object[][] provideGradeData() {
        return new Object[][] {
                {101, "Invalid"},
                {100, "Excellent"},
                {99, "Excellent"},
                {91, "Excellent"},
                {90, "Excellent"},
                {89, "Very Good"},
                {81, "Very Good"},
                {80, "Very Good"},
                {79, "Good"},
                {71, "Good"},
                {70, "Good"},
                {69, "Accepted"},
                {61, "Accepted"},
                {60, "Accepted"},
                {59, "Failed"},
                {51, "Failed"},
                {50, "Failed"},
                {49, "Failed"},
                {41, "Failed"},
                {40, "Failed"},
                {39, "Invalid"},
                {0, "Invalid"},
                {-1, "Invalid"},
        };
    }

    @Test(dataProvider = "gradeData")
    public void testGetGrade(int mark, String expectedGrade) {
        grade = new Grade();
        String result = grade.getGrade(mark);
        Assert.assertEquals(result, expectedGrade);
    }
}