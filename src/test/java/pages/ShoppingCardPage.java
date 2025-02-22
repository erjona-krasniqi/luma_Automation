package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCardPage {
    WebDriver driver;
    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement checkoutProceed;
    public ShoppingCardPage(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);
}
    public void clickProceedCheckout(){
        checkoutProceed.click();
    }

}