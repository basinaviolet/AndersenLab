package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AliCommonTest extends AliBaseTest {

  @Test
  @DisplayName("settings check")
  public void AliSetting() {
    aliexpressPage.setSettings();
    assertTrue(aliexpressPage.checkSettings());
  }
}