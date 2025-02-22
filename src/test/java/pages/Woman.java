package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Woman {
    WebDriver driver;
    @FindBy(css = "img[alt='Radiant Tee']")
    WebElement radiantTeeImg;

    public Woman(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickradiantTeeImg() {
        radiantTeeImg.click();
    }
}
