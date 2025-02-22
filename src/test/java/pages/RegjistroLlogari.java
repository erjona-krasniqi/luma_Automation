package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegjistroLlogari {
    WebDriver driver;

    @FindBy (id = "firstname")
    WebElement emri;
    @FindBy (id = "lastname")
    WebElement mbiemri;
    @FindBy (id = "email_address")
    WebElement email;
    @FindBy (id = "password")
    WebElement fjalkalimi;
    @FindBy (id = "password-confirmation")
    WebElement konfirmoFjalkalimin;
    @FindBy (css = "button[title='Create an Account']")
    WebElement krijoLlogariButtom;

    public RegjistroLlogari(WebDriver driver) { //konstruktori per Main Page
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shkruajEmrin(String emri){
        this.emri.sendKeys(emri);
    }
    public void shkruajMbiemerin(String mbiemeri){
        this.mbiemri.sendKeys(mbiemeri);
    }
    public void shkruajEmailin(String email){
        this.email.sendKeys(email);
    }
    public void shkruajPasswordin(String passwordi){
        this.fjalkalimi.sendKeys(passwordi);
    }
    public void konfirmoPasswordin(String konfirmoPasswordin){
        this.konfirmoFjalkalimin.sendKeys(konfirmoPasswordin);
    }
    public void klikoButtonin(){
        this.krijoLlogariButtom.click();
    }

    public void krijoLLogari(String firstname, String lastname, String email, String password, String confirmPassword) {
        this.emri.sendKeys(firstname);
        this.mbiemri.sendKeys(lastname);
        this.email.sendKeys(email);
        this.fjalkalimi.sendKeys(password);
        this.konfirmoFjalkalimin.sendKeys(confirmPassword);
        krijoLlogariButtom.click();
    }

}
