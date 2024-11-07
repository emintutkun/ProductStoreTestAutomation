package pages;

import base.BaseTests;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BaseTests {
    @Step("Cart Sayfası Kontrol")
    public CartPage cartControl(String value) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));

        String text = driver.findElement(By.cssSelector(".btn.btn-success")).getText();
        Assert.assertEquals(value, text);
        return this;
    }

    @Step("Place Order Butona Basım İşlemi")
    public CartPage placeOrderClick() {
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        return this;
    }

    @Step("Name Alanı Doldurma")
    public CartPage fillName(String text) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModalLabel")));
        driver.findElement(By.id("name")).sendKeys(text);
        return this;
    }

    @Step("Country Alanı Doldurma")
    public CartPage fillCountry(String text) {
        driver.findElement(By.id("country")).sendKeys(text);
        return this;
    }

    @Step("Şehir Alanı Doldurma")
    public CartPage fillCity(String text) {
        driver.findElement(By.id("city")).sendKeys(text);
        return this;
    }

    @Step("Credit Card Alanı Doldurma")
    public CartPage fillCreditCard(String text) {
        driver.findElement(By.id("card")).sendKeys(text);
        return this;
    }

    @Step("Month Alanı Doldurma")
    public CartPage fillMonth(String text) {
        driver.findElement(By.id("month")).sendKeys(text);
        return this;
    }

    @Step("Year Alanı Doldurma")
    public CartPage fillYear(String text) {
        driver.findElement(By.id("year")).sendKeys(text);
        return this;
    }
    @Step("Purchase Butona Basım İşlemi")
    public CartPage purchaseClick() {
        driver.findElement(By.cssSelector("[onclick=\"purchaseOrder()\"]")).click();
        return this;
    }
    @Step("Alışveriş Başarılı Bir Şekilde Tamamlandı mı Kontrolü")
    public CartPage shoppingControl(String value) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm.btn.btn-lg.btn-primary")));

        String text = driver.findElement(By.cssSelector(".confirm.btn.btn-lg.btn-primary")).getText();
        Assert.assertEquals(value, text);
        return this;
    }
}