package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationForm extends RegBasePage {

    public void fillAllFields() {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys("Violeta");
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys("Basina");
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
        driver.findElement(phoneNumber).sendKeys("48999999999");

        driver.findElement(username).click();
        driver.findElement(username).sendKeys("Vio");

        driver.findElement(email).click();
        driver.findElement(email).sendKeys("similjar@gmail.com");

        driver.findElement(about).click();
        driver.findElement(about).sendKeys("A few words about me");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(confirmPassword).click();
        driver.findElement(confirmPassword).sendKeys("123456");

        driver.findElement(submitButton).click();
    }

    public void fillNotAllFields() {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys("Violeta");
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys("Basina");
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
        driver.findElement(phoneNumber).sendKeys("48999999999");

        driver.findElement(username).click();
        driver.findElement(username).sendKeys("Vio");

        driver.findElement(email).click();
        driver.findElement(email).sendKeys("similjar@gmail.com");

        driver.findElement(about).click();
        driver.findElement(about).sendKeys("A few words about me");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(confirmPassword).click();

//-----------------Error-------------------------
//        driver.findElement(confirmPassword).sendKeys("123456");
//-----------------Error-------------------------

        driver.findElement(submitButton).click();
    }

    public void fillAllFieldsWithError() {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys("Violeta");
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys("Basina");
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
        driver.findElement(phoneNumber).sendKeys("48999999999");

        driver.findElement(username).click();
        driver.findElement(username).sendKeys("Vio");

//-----------------Error-------------------------
        driver.findElement(email).click();
        driver.findElement(email).sendKeys("similjar\"gmail.com");
//-----------------Error-------------------------

        driver.findElement(about).click();
        driver.findElement(about).sendKeys("A few words about me");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(confirmPassword).click();
        driver.findElement(confirmPassword).sendKeys("123456");

        driver.findElement(submitButton).click();
    }

    public void withoutFillingFields() {
        driver.findElement(submitButton).click();
    }

//---------------- assertions --------------------
    public boolean ifMainPage() {
        return (driver.findElement(pageName).getText().equals("Registration")
                && driver.findElement(pageNameText).getText().equals("Registration Form"));
    }

    public int checkErrorElement() {
        return driver.findElements(errorElement).size();
    }

    public int checkErrorElementCount() {
        List<WebElement> errorElementList = driver.findElements(errorElement);
        int count = 0;
        if (driver.findElements(errorElement).size() > 0) {
            for (WebElement item : errorElementList)
                count += item.getTagName().equals("input") ? 1 : 0;
        }
        return count;
    }
//-----------------------------------------------
}
