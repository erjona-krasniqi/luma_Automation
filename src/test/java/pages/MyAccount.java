package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
    WebDriver driver;
        @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
        WebElement resultMessage;

    public MyAccount(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String returnResultMessage() {
        return resultMessage.getText();
    }
}
