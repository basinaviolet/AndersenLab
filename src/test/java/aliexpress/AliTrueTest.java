package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AliTrueTest extends AliBaseTest {

  @Test
  @DisplayName("settings check")
  public void AliSetting() {
    aliexpressPage.setSettings();
    assertTrue(aliexpressPage.checkSettings());
  }

  @Test
  @DisplayName("searching check")
  public void AliSearch() {
    aliexpressPage.setSettings();
    aliexpressPage.search();
    assertTrue(aliexpressPage.checkSearch());
  }

  @Test
  @DisplayName("search item and add it to cart check")
  public void AliCart() {
    aliexpressPage.setSettings();
    aliexpressPage.search();
    aliexpressPage.addToCart();
    assertTrue(aliexpressPage.checkCart("650ml Infuser Water Bottle Plastic"));
  }
}