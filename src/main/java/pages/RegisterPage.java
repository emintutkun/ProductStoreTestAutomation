package pages;

import base.BaseTests;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTests
{
    @Step("Register Butonu Tıklama")
    public RegisterPage clickRegister ()
    {
        driver.findElement(By.cssSelector("[id=\"signin2\"]")).click();
        return this;
    }
    @Step("Kullanıcı Kayıt Alanı Doldurma")
    public RegisterPage  fillUsername(String text){
        driver.findElement(By.id("sign-username")).sendKeys(text);
        return this;
    }
    @Step("Şifre Alanı Doldurma")
    public RegisterPage  fillPassword(String text){
        driver.findElement(By.id("sign-password")).sendKeys("test");
        return this;
    }
    @Step("Sign-Up Butonu Click İşlemi")
    public RegisterPage  signUpClick(){
        driver.findElement(By.cssSelector("[onclick=\"register()\"]")).click();
        return this;
    }
}
