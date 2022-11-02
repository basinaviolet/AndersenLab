package aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class AliMainPage {

    private final WebDriver driver;
    private final Wait wait;
    private final AliCommonCommand command;

    //----------------Search----------------
    By searchKey = By.id("search-key");
    By searchButton = By.xpath("//input[@class='search-button']");
    By searchElement = By.xpath("//h1[contains(text(),'650ml Infuser')]");

    //----------------Categories----------------
    String categorySelectPattern = "//a[contains(text(),'";
    String categorySubMenuSelectPattern = "//dl[@data-role='two-menu']//dt//a[contains(text(),'";
    By categoryCurrentAria = By.xpath("//span[@aria-current='page']//span");

    //----------------Setting----------------
    By settings = By.id("switcher-info");

    By settingsCountry = By.xpath("//a[@data-role='country']");
    By settingsCountrySearch = By.xpath("//input[@placeholder='Search']");
    By settingsCountryItem = By.xpath("//li[@data-name='Poland']");
    String country = "//li[@data-name='";

    By settingsLanguage = By.xpath("//span[@data-role='language-input']");
    By settingsLanguageItem = By.xpath("//a[@data-locale='en_US']");
    String language = "//a[@data-locale='";
    By settingCheckLan = By.xpath("//span[@class='language_txt']");
    By settingCheckCur = By.xpath("//span[@class='currency']");

    By settingsCurrency = By.xpath("//div[@data-role='switch-currency']");
    By settingsCurrencyItem = By.xpath("//a[@data-currency='EUR']");
    String currency = "//a[@data-currency='";

    By uiButton = By.xpath("//button[@data-role='save']");

    //----------------Cookies----------------
    By cookies = By.xpath("//button[@data-role='gdpr-accept']");

    //-----------------------------------------

    public AliMainPage(WebDriver driver, Wait wait) {
        this.driver = driver;
        this.wait = wait;
        this.command = new AliCommonCommand(driver);
    }

    //-----------------------------------------

    public AliMainPage setSettings(String setCountry, String setLanguage, String setCurrency) {
        cookies();
        command.clickElement(settings);
        command.clickElement(settingsCountry);
        command.clickElement(By.xpath(country + setCountry + "']"));
        command.clickElement(settingsLanguage);
        command.clickElement(By.xpath(language + setLanguage + "']"));
        command.clickElement(settingsCurrency);
        command.clickElement(By.xpath(currency + setCurrency + "']"));
        command.clickElement(uiButton);

        wait.until(stalenessOf(driver.findElement(searchButton)));
        return this;
    }

    public void cookies() {
        try {
            if (driver.findElement(cookies).isDisplayed())
                command.clickElement(cookies);
        } catch (Exception e) {
        }
    }

    public AliProductPage search(String str) {
        command.input(searchKey, str);
        command.clickElement(searchButton);

        wait.until(ExpectedConditions.urlContains("/wholesale"));

        List<WebElement> elements = driver.findElements(searchElement);
        if (elements.size() > 0)
            command.clickElement(searchElement);

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        wait.until(ExpectedConditions.urlContains("/item"));

        return new AliProductPage(driver, wait);
    }

    public AliProductPage selectCategory(String categoryItem, String subCategoryItem) {
        String categoryMenuItem = categorySelectPattern + categoryItem + "')]";
        String categorySubMenuItem = categorySubMenuSelectPattern + subCategoryItem + "')]";

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(categoryMenuItem)))
                .build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(categorySubMenuItem))));
        command.clickElement(By.xpath(categorySubMenuItem));

        wait.until(ExpectedConditions
                .elementToBeClickable(driver.findElement(
                        categoryCurrentAria)));

        return new AliProductPage(driver, wait);
    }

    //---------------- assertions --------------------
    public boolean checkSettings(String languageForCheck, String currencyForCheck) {
        return (driver.findElement(settingCheckLan).getText().equals(languageForCheck)
                && driver.findElement(settingCheckCur).getText().equals(currencyForCheck));
    }
//-----------------------------------------------
}
