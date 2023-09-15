import io.cucumber.java.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunTest {

    @Before
    public void beforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void testMethod1() {
        int a = 10;
        int b = 5;

        int sum = a + b;

        Assertions.assertEquals(15, sum);
    }

    @Test
    public void testMethod2() {
        double a = 10;
        double b = 5;

        double divide = a / b;

        Assertions.assertEquals(2, divide);
    }

    @Test
    public void failedTestMethod1() {
        double a = 10;
        double b = 5;

        double divide = a / b;

        divide -= 1;

        Assertions.assertEquals(2, divide);
    }

    @Test
    public void failedTestMethod2() {
        int a = 10;
        int b = 5;

        int sum = a + b;

        sum += 1;

        Assertions.assertEquals(15, sum);
    }

    @Before
    public void afterTest() {
        System.out.println("After test");
    }
}
