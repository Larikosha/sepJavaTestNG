import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GoogleSearchBing {
    WebDriver driver;
    String resultStatsID = "resultStats";

    @AfterSuite
    public void afterSuite (){
        //driver.quit();

    }

    @Test
    public void test111() {
        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\laris\\IdeaProjects\\sepJavaTestNG\\src\\test\\resouces\\drivers\\geckodriver.exe");

        openBrowser ();
        navigateToMainPage ();
        typeQuary();
        submitSearch ();
        waitForResultsElement();
        assertResultsPage ();

    }

    private void assertResultsPage() {
       WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));
       boolean isDisplayed = resultStatsElement.isDisplayed();
       boolean expected = true;
       Assert.assertEquals(isDisplayed,expected);

    }

    private void waitForResultsElement() {
        By elementToWait = By.id(resultStatsID);
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        webDriverWait.until(condition);

    }

    private void submitSearch() {
        String selector = "#sb_form_q";
        driver.findElement(By.cssSelector(selector)).submit();
    }

    private void typeQuary() {

        String selector = "#sb_form_q";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
            String url = "https://www.bing.com/";
            driver.get(url);
    }

    private void openBrowser() {
            driver = new FirefoxDriver ();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }

