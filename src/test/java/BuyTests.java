import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BuyTests extends BaseTests
{
    ProductPage productPage = new ProductPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @Test(description = "Ürün Satın Alma İşlemi")
    public void ClickProduct()
    {
        // Satın alım için giriş yapılması gerekmektedir.
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginPage.fillLoginUsername("test")
                .fillLoginPassword("test")
                .logInClick();
        loginPage.accountControl("Welcome test");

        //Ürün Seçimi
        homePage.clickProduct();

        //Ürün Sayfasına Giriş Kontrolü
        productPage.productControl("Add to cart")
                .addToCartClick();

        driver.navigate().refresh();

        productPage.cartClick();

        cartPage.cartControl("Place Order")
                .placeOrderClick()
                .fillName("Emin")
                .fillCountry("Türkiye")
                .fillCity("İstanbul")
                .fillCreditCard("0000-4444-3333-2222-0000-55")
                .fillMonth("03")
                .fillYear("1998")
                .purchaseClick()
                .shoppingControl("OK");

        screenshot();
    }
}
