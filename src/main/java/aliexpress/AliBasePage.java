package aliexpress;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AliBasePage {

    WebDriver driver;
    WebDriverWait wait;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window()
                .setSize(new Dimension(1320, 1040));
        //.maximize();
        this.driver.get("https://best.aliexpress.com/");
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public void complete() {
        this.driver.quit();
    }
}
