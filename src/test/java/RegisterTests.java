import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.RegisterPage;
import java.util.concurrent.TimeUnit;

public class RegisterTests extends BaseTests
{
    RegisterPage registerPage = new RegisterPage();

    @Test(description = "Kullanıcı Oluşturma Kontrolu")
    public void Test1RegisterSucccesfullControl()
    {
        String username = createUserName();

        registerPage.clickRegister();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        registerPage.fillUsername(username)
                .fillPassword("test");
        screenshot();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        registerPage.signUpClick();
    }
}
