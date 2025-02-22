package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
    WebDriver driver;
    @FindBy (id = "firstname")
    WebElement firstName;
    @FindBy (id = "lastname")
    WebElement lastName;
    @FindBy (id = "email_address")
    WebElement emailAddress;
    @FindBy (id = "password")
    WebElement password;
    @FindBy (id = "password-confirmation")
    WebElement confirmPassword;
    @FindBy (css = "button[title='Create an Account']")
    WebElement createanAccount;

    public CreateAccount(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void createAccount(String firstname, String lastname, String email, String password, String confirmPassword) {
        this.firstName.sendKeys(firstname);
        this.lastName.sendKeys(lastname);
        this.emailAddress.sendKeys(email);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
        createanAccount.click();
    }





    }
