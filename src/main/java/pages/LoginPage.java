package pages;

import base.BaseTests;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTests
{
    @Step("Register Butonu Tıklama")
    public LoginPage clickLogin ()
    {
        driver.findElement(By.cssSelector("[id=\"login2\"]")).click();
        return this;
    }
    @Step("Kullanıcı Giriş Alanı Doldurma")
    public LoginPage  fillLoginUsername(String text){
        driver.findElement(By.id("loginusername")).sendKeys(text);
        return this;
    }
    @Step("Şifre Giriş Alanı Doldurma")
    public LoginPage  fillLoginPassword(String text){
        driver.findElement(By.id("loginpassword")).sendKeys(text);
        return this;
    }
    @Step("Log-In Butonu Click İşlemi")
    public LoginPage  logInClick(){
        driver.findElement(By.cssSelector("[onclick=\"logIn()\"]")).click();
        return this;
    }
    @Step("Kullanıcı Kontrolü")
    public LoginPage accountControl(String value)
    {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        String text = driver.findElement(By.id("nameofuser")).getText();
        Assert.assertEquals(value, text);
        return this;
    }
}
