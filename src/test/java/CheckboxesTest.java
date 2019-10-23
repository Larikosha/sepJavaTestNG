import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.locks.Condition;


public class CheckboxesTest<input1CheckedValue> {

    WebDriver driver;


    @BeforeSuite
    public void setUp () {
        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\laris\\IdeaProjects\\sepJavaTestNG\\src\\test\\resouces\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void test0001() {
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get (url);

        List<WebElement> ListOfInputs = driver.findElements(By.tagName("input"));

        int numberOfInputs = ListOfInputs.size();

        Assert.assertTrue( numberOfInputs == 2);
        WebElement input1 = ListOfInputs.get (0);
        WebElement input2 = ListOfInputs.get (1);

        boolean isInput1Displayed = input1.isDisplayed();

        Assert.assertTrue(isInput1Displayed);

      String input1CheckedValue = input1.getAttribute("checked");
      if (input1CheckedValue == null) {
      input1.click();

    }

    input1CheckedValue = input1.getAttribute("checked");

    Assert.assertEquals(input1CheckedValue, "true");

    }

    @AfterSuite
    public void afterSuite (){
        driver.quit();

    }
}
