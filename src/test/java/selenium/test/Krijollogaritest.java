package selenium.test;

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

public class Krijollogaritest extends Hooks {
    RegjistroLlogari regjistroLlogari;
    CreateAccount createAccount;
    @Test
    public void test1() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        regjistroLlogari = new RegjistroLlogari(driver);
        regjistroLlogari.shkruajEmrin("Gezim");
        regjistroLlogari.shkruajMbiemerin("Cako");
        regjistroLlogari.shkruajEmailin("tes444585t@test.com");
        regjistroLlogari.shkruajPasswordin("G12345678!");
        regjistroLlogari.konfirmoPasswordin("G12345678!");
        regjistroLlogari.klikoButtonin();


    }
}