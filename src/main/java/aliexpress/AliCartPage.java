package aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class AliCartPage {

    private final WebDriver driver;
    private final Wait wait;
    private final AliCommonCommand command;

    //----------------Cart----------------
    By cartItemList = By.xpath("//div[@class='cart-product-wrap']");
    By cartItem = By.xpath("//div[@class='cart-product-name']//a");

    //------------------------------------------

    public AliCartPage(WebDriver driver, Wait wait) {
        this.driver = driver;
        this.wait = wait;
        this.command = new AliCommonCommand(driver);
    }

    //---------------- assertions --------------------
    public boolean checkCart(String searchItem) {
        return (driver.getTitle().equals("Shopping Cart") // it is Shopping Cart
                && driver.findElements(cartItemList).size() > 0 // count of items > 0
                && ifInsertItem(searchItem)); //there is the target item
    }

    public boolean ifInsertItem(String itemForSearch) {
        return (driver.findElement(cartItem).getText().toLowerCase().contains(itemForSearch.toLowerCase()));
    }
//-----------------------------------------------
}
