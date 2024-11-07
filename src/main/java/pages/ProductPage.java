package pages;

import base.BaseTests;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseTests
{
    @Step("Ürüne Giriş Kontrolü")
    public ProductPage productControl(String value)
    {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success.btn-lg")));

        String text = driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).getText();
        Assert.assertEquals(value, text);
        return this;
    }
    @Step("Sepete Ekle Butonu")
    public ProductPage addToCartClick()
    {
        driver.findElement(By.cssSelector("[onclick=\"addToCart(1)\"]")).click();
        return this;
    }
    @Step("Cart Linkine Gidiş")
    public ProductPage cartClick()
    {
        driver.findElement(By.cssSelector("[href=\"cart.html\"]")).click();
        return this;
    }
}
