package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import step.definitions.Hooks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static step.definitions.Hooks.driver;

public class TestScenarious extends Hooks {
    CreateAccount createAccount;
    MainPage mainPage;
    MyAccount myAccount;
    Woman woman;
    RadiantTee radiantTee;
    ShoppingCardPage shoppingCardPage;
    RegjistroLlogari regjistroLlogari;

    @Test

    public void registerTest() {
        driver.get("https://magento.softwaretestingboard.com/"); //navigate to demo page https://magento.softwaretestingboard.com/
        mainPage = new MainPage(driver); //objekti per faqjen kryesore
        mainPage.clickCreateanAccount();
        createAccount = new CreateAccount(driver); //objekti per faqjen Create account
        createAccount.createAccount("Jonidaa", "Jonnn", "jmdfghjkucenjjhghjh@gmail.com", "Jm1019273","Jm1019273");
        String expectedResult = "Thank you for registering with Main Website Store.";
        myAccount = new MyAccount(driver);
        assertEquals(expectedResult, myAccount.returnResultMessage());
//        //mainPage.clickAccountInfo();//
//        //mainPage.clickSignOutButton();//
//        //WebDriverWait wait = new WebDriverWait(driver, 5);
//        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id='ui-id-4'] span:nth-child(2)")));
//        mainPage.clickWomanButton();
//        woman = new Woman(driver);
//        woman.clickradiantTeeImg();
//        radiantTee = new RadiantTee(driver);
//        radiantTee.clickS();
//        radiantTee.clickblueColour();
//        radiantTee.enterQuantity(1);
//        radiantTee.clickAddtoCart();
//        mainPage.clickShoppingCart(1000);
//        shoppingCardPage = new ShoppingCardPage(driver);
//        shoppingCardPage.clickProceedCheckout();

    }
    @Test
    public void test1() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
//        createAccount = new CreateAccount(driver); //objekti per faqjen Create account
//        createAccount.createAccount("Jonidaa", "Jonnn", "jmdfghjkucenjjhghjh@gmail.com", "Jm1019273","Jm1019273");
//        String expectedResult = "Thank you for registering with Main Website Store.";
////
        regjistroLlogari = new RegjistroLlogari(driver);
        regjistroLlogari.krijoLLogari("Gezim","Cako","test@rest.com","G12345678!","G12345678!");

    }


}
