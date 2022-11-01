package aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class AliProductPage{

    private final WebDriver driver;
    private final Wait wait;
    private final AliCommonCommand command;

    //----------------Search----------------
    By searchElement = By.xpath("//h1[contains(text(),'650ml Infuser')]");

    //----------------Cart----------------
    By addToCartButton = By.xpath("//div[@class='product-action']//button[@ae_button_type='addtocart_click']");
    By addToCartItem = By.xpath("//li[@class='sku-property-item']");

    By viewShoppingCart = By.xpath("//button[@ae_button_type='View_shopping_cart']");
    By cartItemContainer = By.xpath("//div[@class='cart-product-wrap']");

    By cartItemList = By.xpath("//div[@class='cart-product-wrap']");
    By cartItem = By.xpath("//div[@class='cart-product-name']//a");

    By dialogWindow = By.xpath("//div[@role='dialog']");

    //----------------Categories----------------
    By categoryCurrentAria = By.xpath("//span[@aria-current='page']//span");

    //------------------------------------------

    public AliProductPage(WebDriver driver, Wait wait) {
        this.driver = driver;
        this.wait = wait;
        this.command = new AliCommonCommand(driver);
    }

    //-----------------------------------------
    public AliCartPage addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addToCartButton)));

        command.clickElement(addToCartButton);

        wait.until(ExpectedConditions.presenceOfElementLocated(dialogWindow));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(viewShoppingCart)));
        command.clickElement(viewShoppingCart);

        return new AliCartPage(driver, wait);
    }

    //---------------- assertions --------------------

    public boolean checkCurrentAria(String currentAria) {
        return driver.findElement(categoryCurrentAria).getText().toLowerCase().contains(currentAria.toLowerCase());
    }

    public boolean checkSearch() {
        try {
            driver.findElements(searchElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//-----------------------------------------------
}
