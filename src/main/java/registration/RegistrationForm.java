package registration;

import org.openqa.selenium.By;
import java.util.HashMap;

public class RegistrationForm extends RegBasePage {

    public void fillingFields(HashMap<String, String> fieldValues) {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys(fieldValues.get("name"));
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys(fieldValues.get("lastName"));
        driver.findElement(maritalStatusMarried).click();
        driver.findElement(hobby).click();
        driver.findElement(By.xpath(hobbyItemLocator + "[2]"));

        driver.findElement(country).click();
        driver.findElement(By.xpath("//option[. = 'India']")).click();

        driver.findElement(dayOfBirth).click();
        driver.findElement(dayOfBirth).findElement(By.xpath("//option[. = '1']")).click();
        driver.findElement(monthOfBirth).click();
        driver.findElement(monthOfBirth).findElement(By.xpath("//option[. = '1']")).click();
        driver.findElement(yearOfBirth).click();
        driver.findElement(By.xpath("//option[. = '2014']")).click();

        driver.findElement(phoneNumber).click();
        driver.findElement(phoneNumber).sendKeys(fieldValues.get("phoneNumber"));

        driver.findElement(username).click();
        driver.findElement(username).sendKeys(fieldValues.get("username"));

        driver.findElement(email).click();
        driver.findElement(email).sendKeys(fieldValues.get("email"));

        driver.findElement(about).click();
        driver.findElement(about).sendKeys(fieldValues.get("about"));

        driver.findElement(password).click();
        driver.findElement(password).sendKeys(fieldValues.get("password"));

        driver.findElement(confirmPassword).click();
        driver.findElement(confirmPassword).sendKeys(fieldValues.get("confirmPassword"));
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
