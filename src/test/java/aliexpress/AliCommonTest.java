package aliexpress;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AliCommonTest extends AliBaseTest {

  @Epic(value = "Aliexpress tests")
  @Feature(value = "Settings features")
  @Story(value = "Settings")
  @Severity(SeverityLevel.NORMAL)
  @Owner(value = "Violetta Basina")
  @Test
  @DisplayName("settings check")
  public void AliSetting() {
    assertTrue(page.checkSettings("English", "EUR"));
  }
}