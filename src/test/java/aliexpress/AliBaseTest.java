package aliexpress;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AliBaseTest {

    WebDriver driver;
    WebDriverWait wait;
    AliMainPage page;

    @BeforeEach
    public void previous() {
        setUp();
        page = new AliMainPage(driver, wait);
        page = page.setSettings("Poland", "en_US", "EUR");
    }

    @AfterEach
    public void ending() {
        complete();
    }

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window()
                .setSize(new Dimension(1320, 1040));
        driver.get("https://best.aliexpress.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void complete() {
        driver.quit();
    }
}
