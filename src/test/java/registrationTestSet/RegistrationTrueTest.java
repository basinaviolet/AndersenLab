package registrationTestSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTrueTest extends RegistrationBaseTest{

  @Test
  @DisplayName("all required fields are filled in correctly")
  public void registrationTrue() {
    assertTrue(registrationPage.ifMainPage());
    registrationPage.fillAllFields();
    assertEquals(registrationPage.checkErrorElement(), 0);
  }

  @Test
  @DisplayName("there are some unfilled fields")
  public void fillNotAllFields() {
    assertTrue(registrationPage.ifMainPage());
    registrationPage.fillNotAllFields();
    assertNotEquals(registrationPage.checkErrorElement(), 0);
  }

  @Test
  @DisplayName("there are some fields with errors")
  public void fillAllFieldsWithError() {
    assertTrue(registrationPage.ifMainPage());
    registrationPage.fillAllFieldsWithError();
    assertNotEquals(registrationPage.checkErrorElement(), 0);
  }

  @Test
  @DisplayName("the fields are not filled in")
  public void withoutFillingFields() {
    assertTrue(registrationPage.ifMainPage());
    registrationPage.withoutFillingFields();
    assertNotEquals(registrationPage.checkErrorElement(), 0);
  }
}
