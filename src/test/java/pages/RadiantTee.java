package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadiantTee {
    WebDriver driver;
    @FindBy (css = "div[class='reviews-actions'] span:nth-child(2)")
    WebElement review;
    @FindBy (css = ".action.add")
    WebElement addReview;
    @FindBy(id = "option-label-size-143-item-166")
    WebElement sizeXS;
    @FindBy(id = "option-label-size-143-item-167")
    WebElement sizeS;
    @FindBy(id = "option-label-size-143-item-168")
    WebElement sizeM;
    @FindBy(id = "option-label-size-143-item-169")
    WebElement sizeL;
    @FindBy(id = "option-label-size-143-item-170")
    WebElement sizexL;
    @FindBy(id = "option-label-color-93-item-50")
    WebElement blueColour;
    @FindBy(id = "option-label-color-93-item-56")
    WebElement orangeColour;
    @FindBy(id = "option-label-color-93-item-57")
    WebElement purpleColour;
    @FindBy(id = "qty")
    WebElement quantity;
    @FindBy(id = "product-addtocart-button")
    WebElement addToCartButton;
    @FindBy(css = "a[class='action towishlist'] span")
    WebElement addToWishlistButton;
    @FindBy(css = "a[class='action tocompare'] span")
    WebElement addtoCompareButton;

    public RadiantTee(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);  //inicializimi i elementeve brenda faqes
    }
    public void clickReviewButton() {
    review.click();
    }
    public void clickAddReview() {
        addReview.click();
    }
    public void clickXS() {
        sizeXS.click();
    }
    public void clickS() {
        sizeS.click();
}
    public void clickM() {
        sizeM.click();
    }
    public void clickL() {
        sizeL.click();
    }
    public void clickXL() {
        sizexL.click();
    }
    public void clickblueColour() {
        blueColour.click();
    }
    public void clickorangeColour() {
        orangeColour.click();
    }
    public void clickpurpleColour() {
        orangeColour.click();
    }
    public void enterQuantity(int quantity) {
        this.quantity.clear(); // Clear any existing value
        this.quantity.sendKeys(String.valueOf(quantity));
    }
    public void clickAddtoCart() {
        addToCartButton.click();
    }
    public void clickAddtoWishlist() {
        addToWishlistButton.click();
    }
    public void clickAddtoCompare() {
        addtoCompareButton.click();
    }
}

