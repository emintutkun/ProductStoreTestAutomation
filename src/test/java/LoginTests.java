import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;


public class LoginTests extends BaseTests
{
    LoginPage loginPage = new LoginPage();

    @Test(description = "Kullanıcı Oluşturma Kontrolu")
    public void TestLoginSucccesfullControl()
    {
        String username = createUserName();

        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginPage.fillLoginUsername("test")
                .fillLoginPassword("test");
        screenshot();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginPage.logInClick();
        loginPage.accountControl("Welcome test");
        screenshot();

    }
}
