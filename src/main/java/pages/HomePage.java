package pages;

import base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseTests
{
    @Step("Ürün Seçme")
    public HomePage clickProduct ()
    {
        driver.findElement(By.cssSelector("[href*=\"prod.html?idp_=1\"]")).click();
        return this;
    }
}