import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    @FindBy(css = "#header__center__searchbox .search-container input")
    WebElement search;
    @FindBy(css = "div[id='header__center__searchbox'] div div[class='search-icon']")
    WebElement icon;
    @FindBy(css = "#product-499145 h4")
    WebElement rezultat;
    @FindBy(css = "#product-499145 .item__bottom__cart")
    WebElement addToCart;
    @FindBy(css = "#header__center__login__and__cart .icon-number")
    WebElement getCartNumber;

    public HomePage (ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void inputSearch(String text)
    {
        search.sendKeys(text);
        icon.click();
    }
    public void rezultatPretrage()
    {
         rezultat.isDisplayed();
    }
    public void setAddToCart ()
    {
        addToCart.click();
    }
    public String getCart()
    {
        return getCartNumber.getText();
    }
}
