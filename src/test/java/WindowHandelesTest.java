import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WindowHandelesTest {

    WebDriver driver;
    String url = "https://the-internet.herokuapp.com/windows";


    @BeforeSuite
    public void setUp () {
        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\laris\\IdeaProjects\\sepJavaTestNG\\src\\test\\resouces\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void test001() {

        openBrowser();
        navigateToMainPage();
        findElement();
        submitResultElement();
        assertResultPage();
        goBackOnePage();

    }

    private void goBackOnePage() {
        driver.navigate().back();
    }

    private void assertResultPage() {
        WebElement resultElement = driver.findElement(By.cssSelector(".example > h3:nth-child(1"));
        boolean isDisplayed = resultElement.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(isDisplayed, expected);

    }

    private void submitResultElement() {

        String selector = "#content > ul:nth-child(4) > li:nth-child(1) > a:nth-child(1)";
        driver.findElement(By.cssSelector(selector)).click();

    }

    private void findElement() {
        String selector = "#content > ul:nth-child(4) > li:nth-child(1) > a:nth-child(1)";
        driver.findElement(By.cssSelector(selector));
    }

    private void navigateToMainPage() {
        driver.get(url);
    }

    private void openBrowser() {
        driver = new FirefoxDriver();

    }


    //@AfterSuite
    //public void afterSuite (){
        //driver.quit();



}
