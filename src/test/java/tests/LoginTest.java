package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends TestBase{

    LoginPage loginpage;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void LoginWithValidUsernameAndValidPassword()  {
        System.out.println(driver);
        loginpage.fillUserName("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.dashboardText);
    }

}
