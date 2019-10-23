import javafx.scene.control.cell.CheckBoxListCell;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;


public class CheckboxesLaraTest {

    private WebDriver driver;

    @BeforeSuite
    public void setUp () {
        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\laris\\IdeaProjects\\sepJavaTestNG\\src\\test\\resouces\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void test1() {

        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\laris\\IdeaProjects\\sepJavaTestNG\\src\\test\\resouces\\drivers\\geckodriver.exe");

        openBrowser ();
        navigateToMainPage ();

    }

    private void navigateToMainPage() {
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);

    }

    private void openBrowser() {
        driver = new FirefoxDriver ();

    }


    @AfterSuite
    public void afterSuite (){
        driver.quit();

    }
}

