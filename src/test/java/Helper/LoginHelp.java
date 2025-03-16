package Helper;

import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import tests.TestBase;

public class LoginHelp {
     LoginPage loginPage = new LoginPage(TestBase.driver);
     DashboardPage dashboardPage = new DashboardPage(TestBase.driver);

    public void LoginWithValidUsernameAndValidPassword()  {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.dashboardText);
    }
}
