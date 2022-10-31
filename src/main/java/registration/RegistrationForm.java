package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;

public class RegistrationForm extends RegBasePage {

    public void fillingFields(HashMap<String, String> fieldValues) {
        input(driver.findElement(name), fieldValues.get("name"));
        input(driver.findElement(lastName), fieldValues.get("lastName"));
        input(driver.findElement(phoneNumber), fieldValues.get("phoneNumber"));
        input(driver.findElement(username), fieldValues.get("username"));
        input(driver.findElement(email), fieldValues.get("email"));
        input(driver.findElement(about), fieldValues.get("about"));
        input(driver.findElement(password), fieldValues.get("password"));
        input(driver.findElement(confirmPassword), fieldValues.get("confirmPassword"));

        driver.findElement(maritalStatusMarried).click();

        select(driver.findElement(hobby), By.xpath(hobbyItemLocator + "[2]"));
        select(driver.findElement(country), By.xpath("//option[. = 'India']"));
        select(driver.findElement(dayOfBirth), By.xpath("//option[. = '1']"));
        select(driver.findElement(monthOfBirth), By.xpath("//option[. = '1']"));
        select(driver.findElement(yearOfBirth), By.xpath("//option[. = '2014']"));
    }

    public void input(WebElement element, String text) {
        Actions action = new Actions(driver);
        try {
            action.moveToElement(element).click()
                    .sendKeys(text)
                    .build().perform();
        } catch (Exception e) {
            System.out.println("error during execution: input " + text + ": " + e.getMessage());
        }

    }

    public void select(WebElement element, By selectElement) {
        try {
            element.click();
            element.findElement(selectElement).click();
        } catch (Exception e) {
            System.out.println("error during execution: select "
                    + selectElement.toString() + ": "
                    + e.getMessage());
            System.out.println("----------------------------");
        }
    }

    public void registration(HashMap<String, String> values) {
        fillingFields(values);
        submitButtonClick();
    }

    public void withoutFillingFields() {
        submitButtonClick();
    }

    public void submitButtonClick() {
        driver.findElement(submitButton).click();
    }

    public boolean checkValue(HashMap<String, String> values) {
        return (driver.findElement(name).getAttribute("value").equals(values.get("name"))
                && driver.findElement(lastName).getAttribute("value").equals(values.get("lastName"))
                && driver.findElement(phoneNumber).getAttribute("value").equals(values.get("phoneNumber"))
                && driver.findElement(email).getAttribute("value").equals(values.get("email"))
                && driver.findElement(username).getAttribute("value").equals(values.get("username"))
                && driver.findElement(about).getAttribute("value").equals(values.get("about"))
                && driver.findElement(password).getAttribute("value").equals(values.get("password"))
                && driver.findElement(confirmPassword).getAttribute("value").equals(values.get("confirmPassword")));
    }

    //---------------- assertions --------------------
    public boolean ifMainPage() {
        return (driver.findElement(pageName).getText().equals("Registration")
                && driver.findElement(pageNameText).getText().equals("Registration Form"));
    }

    public int checkErrorElement() {
        return driver.findElements(errorElement).size();
    }

//-----------------------------------------------
}
