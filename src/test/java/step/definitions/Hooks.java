package step.definitions;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        //In case your google version is 102 use chromedriver
        //in case your google version is 107 use chromerdriver2
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver4.exe");
//         driver = new ChromeDriver();//
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
