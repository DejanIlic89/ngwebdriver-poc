import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalcTest {

    CalculatorPage calculatorPage;

    @BeforeTest
    public void setup() {
        calculatorPage = new CalculatorPage();
    }

    @AfterClass
    public void tearDown() {
        calculatorPage.driver.quit();
    }

    @Test(priority = 1)
    public void sumTest() {
        String res = calculatorPage.doSum("10", "20");
        Assert.assertEquals(res, "30");
    }

    @Test(priority = 2)
    public void subTest() {
        String res = calculatorPage.doSub("20", "10");
        Assert.assertEquals(res, "10");
    }

    @Test(priority = 3)
    public void divTest() {
        String res = calculatorPage.doDiv("20", "10");
        Assert.assertEquals(res, "2");
    }

}
