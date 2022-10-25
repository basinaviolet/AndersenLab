package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegBasePage {

    WebDriver driver;

    By pageName = By.tagName("h1");
    By pageNameText = By.tagName("h2");
    By name = By.name("name");
    By lastName = By.cssSelector("p:nth-child(2) > input");
    By maritalStatusSingle = By.xpath("//input[@name='m_status']//ancestor::label[1][contains(text(),' Single')]");
    By maritalStatusMarried = By.xpath("//input[@name='m_status']//ancestor::label[1][contains(text(),' Married')]");
    By maritalStatusDivorced = By.xpath("//input[@name='m_status']//ancestor::label[1][contains(text(),' Divorced')]");

    By hobby = By.name("hobby");
    String hobbyItemLocator = "//label[contains(text(),'Hobby')]//ancestor::fieldset[1]/div/label";

    By country = By.xpath("//label[contains(text(),'Country')]//ancestor::fieldset[1]/select");
    String countryItemLocator = "//label[contains(text(),'Country')]//ancestor::fieldset[1]/select";

    By dayOfBirth = By.xpath("//option[contains(text(),'Day')]//ancestor::select[1]");
    By monthOfBirth = By.xpath("//option[contains(text(),'Month')]//ancestor::select[1]");
    By yearOfBirth = By.xpath("//option[contains(text(),'Year')]//ancestor::select[1]");

    By phoneNumber = By.name("phone");
    By username = By.name("username");
    By email = By.name("email");
    By about = By.cssSelector("textarea");
    By password = By.name("password");
    By confirmPassword = By.name("c_password");
    By submitButton = By.xpath("//input[@value='submit']");

    By errorElement = By.cssSelector(".error_p");

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window()
                .setSize(new Dimension(1320, 1040));
        //.maximize();
        this.driver.get("https://www.way2automation.com/way2auto_jquery/registration.php");
    }

    public void complete() {
        this.driver.quit();
    }
}
