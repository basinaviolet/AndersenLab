package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AliCartTest extends AliBaseTest {

  @ParameterizedTest
  @DisplayName("search item and add it to cart check")
  @ValueSource(strings = {"650ml Infuser Water Bottle Plastic"})
  public void AliCart(String str) {
    AliCartPage cartPage = new AliCartPage(driver, wait);
    cartPage = page.search(str).addToCart();
    assertTrue(cartPage.checkCart(str));
  }
}