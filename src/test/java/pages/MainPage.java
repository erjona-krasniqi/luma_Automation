package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    @FindBy(css = "div[class='panel header'] li[data-label='or'] a")
    WebElement signInButton;
    @FindBy(css = "header[class='page-header'] li:nth-child(3) a:nth-child(1)")
    WebElement createAccountButton;
    @FindBy(css = "#search")
    WebElement search;
    @FindBy(css = ".action.showcart")
    WebElement showCartButton;
    @FindBy(css = "img[src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']")
    WebElement logo;
    @FindBy(css = "span[class='customer-name active'] button[type='button']")
    WebElement accountInfo;
    @FindBy(css = "div[aria-hidden='false'] li[data-label='or'] a")
    WebElement signOut;
    @FindBy(css = "a[id='ui-id-3'] span:nth-child(1)")
    WebElement whatIsNew;
    @FindBy(css = "a[id='ui-id-4'] span:nth-child(2)")
    WebElement woman;
    @FindBy(css = "#ui-id-5")
    WebElement men;
    @FindBy(css = "a[id='ui-id-6'] span:nth-child(2)")
    WebElement gear;
    @FindBy(css = "a[id='ui-id-7'] span:nth-child(2)")
    WebElement training;
    @FindBy(css = "#ui-id-8")
    WebElement sale;
    @FindBy( xpath = "//img[@alt='Radiant Tee']")
    WebElement radiantTree;


    public MainPage(WebDriver driver)  { //konstruktori per Main Page
    this.driver =driver;
    PageFactory.initElements(driver,this);  //inicializimi i elementeve brenda faqes

}
public void clickSignInButton() {
        signInButton.click();
}
public void clickCreateanAccount(){
        createAccountButton.click();
}
public void enterSearch(String search) {
    this.search.clear(); //fshin
    this.search.sendKeys(search); //ploteson
    this.search.click();//enter
}
public void clickShoppingCart(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(showCartButton));
        showCartButton.click();
    }

public void clickWhatisNew() {
        whatIsNew.click();
}
public void clickWomanButton() {
        woman.click();
}
public void clickMenButton () {
        men.click();
}
public void clickGearButton () {
        gear.click();
}
public void clickTrainingButton () {
        training.click();
}
public void clickSaleButton () {
        sale.click();
}
public void clickRadiantTreeImg () {
    radiantTree.click();
}
public void clickAccountInfo() {
        accountInfo.click();
}
public void clickSignOutButton() {
        signOut.click();
    }



}
