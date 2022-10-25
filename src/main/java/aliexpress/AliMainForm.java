package aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class AliMainForm extends AliBasePage {

    By settings = By.id("switcher-info");

    By settingsCountry = By.xpath("//a[@data-role='country']");
    By settingsCountrySearch = By.xpath("//input[@placeholder='Search']");
    By settingsCountryItem = By.xpath("//li[@data-name='Poland']");

    By settingsLanguage = By.xpath("//span[@data-role='language-input']");
    By settingsLanguageItem = By.xpath("//a[@data-locale='en_US']");
    By settingCheckLan = By.xpath("//span[@class='language_txt']");
    By settingCheckCur = By.xpath("//span[@class='currency']");

    By settingsCurrency = By.xpath("//div[@data-role='switch-currency']");
    By settingsCurrencyItem = By.xpath("//a[@data-currency='EUR']");

    By uiButton = By.xpath("//button[@data-role='save']");

    By searchKey = By.id("search-key");
    By searchButton = By.xpath("//input[@class='search-button']");
    By searchElement = By.xpath("//h1[contains(text(),'650ml Infuser')]");

    By cookies = By.xpath("//button[@data-role='gdpr-accept']");
    By addToCartButton = By.xpath("//div[@class='product-action']//button[@ae_button_type='addtocart_click']");
    By addToCartItem = By.xpath("//li[@class='sku-property-item']");

    By viewShoppingCart = By.xpath("//button[@ae_button_type='View_shopping_cart']");
    By cartItemContainer = By.xpath("//div[@class='cart-product-wrap']");

    By cartItemList = By.xpath("//div[@class='cart-product-wrap']");
    By cartItem = By.xpath("//div[@class='cart-product-name']//a");

    public void setSettings() {
        cookies();
        driver.findElement(settings).click();
        driver.findElement(settingsCountry).click();
        driver.findElement(settingsCountryItem).click();
        driver.findElement(settingsLanguage).click();
        driver.findElement(settingsLanguageItem).click();
        driver.findElement(settingsCurrency).click();
        driver.findElement(settingsCurrencyItem).click();
        driver.findElement(uiButton).click();
        wait.until(stalenessOf(driver.findElement(searchButton)));

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(settingCheckLan), "English"));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(settingCheckCur), "EUR"));
    }

    public void search() {
        cookies();
        driver.findElement(searchKey).click();
        driver.findElement(searchKey).sendKeys("650ml infuser water bottle plastic lemon kettle");
        driver.findElement(searchButton).click();
        wait.until(ExpectedConditions.urlContains("/wholesale"));

        List<WebElement> elements = driver.findElements(searchElement);
        if (elements.size() > 0)
            driver.findElement(searchElement).click();
    }

    public void addToCart() {
        cookies();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        wait.until(ExpectedConditions.urlContains("/item"));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addToCartButton)));

        driver.findElement(addToCartButton).click();

        // -------I don`t know why, but without this string the button doesn`t click :(
        System.out.println("wh -> " + driver.getWindowHandles().toString());
        //--------

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(viewShoppingCart)));
        driver.findElement(viewShoppingCart).click();
    }

    public void cookies() {
        try {
            if (driver.findElement(cookies).isDisplayed())
                driver.findElement(cookies).click();
        } catch (Exception e) {
        }
    }

    //---------------- assertions --------------------
    public boolean checkSettings() {
        return (driver.findElement(settingCheckLan).getText().equals("English")
                && driver.findElement(settingCheckCur).getText().equals("EUR"));
    }

    public boolean checkSearch() {
        try {
            driver.findElements(searchElement);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean checkCart(String searchItem) {
        System.out.println("1 -> " + driver.getTitle()
                + ", 2 -> " + driver.findElements(cartItemList).size()
                + ", 3 -> " + ifInsertItem(searchItem)
        );

        return (driver.getTitle().equals("Shopping Cart") // it is Shopping Cart
                && driver.findElements(cartItemList).size() > 0 // count of items > 0
                && ifInsertItem(searchItem)); //there is the target item
    }

    public boolean ifInsertItem(String itemForSearch) {
        return (driver.findElement(cartItem).getText().contains(itemForSearch));
    }
//-----------------------------------------------
}
