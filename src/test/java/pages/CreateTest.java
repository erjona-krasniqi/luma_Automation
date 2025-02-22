package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTest {
    WebDriver driver;
    @FindBy(id = "firstname")
    WebElement emri;
    @FindBy(id = "lastname")
    WebElement mbiemri;
    @FindBy(id = "email_address")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;
}
