package aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AliCommonCommand {

    WebDriver driver;

    public AliCommonCommand(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void input(By element, String text) {
        Actions action = new Actions(driver);
        try {
            action.moveToElement(driver.findElement(element)).click()
                    .sendKeys(text)
                    .build().perform();
        } catch (Exception e) {
            System.out.println("error during execution: input " + text + ": " + e.getMessage());
        }
    }
}
