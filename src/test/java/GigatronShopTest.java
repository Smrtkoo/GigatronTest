import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTast{
    PopUpPage popUpPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        popUpPage = new PopUpPage(driver);
        homePage = new HomePage(driver);

    }
    @Test
    public void shopTest()
    {
        //popUpPage.clickOnPopUp();
        popUpPage.clickPrihvati();
        homePage.inputSearch("iPhone");
        Assert.assertEquals(homePage.rezultat.isDisplayed(),true,"APPLE iPhone 14 Plus 6/256GB Purple MQ563SX/A");

        homePage.setAddToCart();
        Assert.assertEquals(homePage.getCart(),"1");
    }

    @AfterMethod
    public void after()
    {
        driver.quit();
    }
}
