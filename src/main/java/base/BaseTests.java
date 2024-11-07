package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTests extends BaseLibrary
{


    @BeforeMethod
    public void openBrowser()
    {
        driver= new ChromeDriver();
        driver.get("https://www.demoblaze.com");
    }
    @AfterMethod
    public void tearDown()
    {
        //driver.quit();
    }
}
