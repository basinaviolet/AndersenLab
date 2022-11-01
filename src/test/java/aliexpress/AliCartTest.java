package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AliCartTest extends AliBaseTest {

  @Test
  @DisplayName("search item and add it to cart check")
  public void AliCart() {
    AliCartPage cartPage = new AliCartPage(driver, wait);
    cartPage = page.search().addToCart();
    assertTrue(cartPage.checkCart("650ml Infuser Water Bottle Plastic"));
  }
}