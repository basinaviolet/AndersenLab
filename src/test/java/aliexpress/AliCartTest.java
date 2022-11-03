package aliexpress;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Epic(value = "Aliexpress tests")
@Feature(value = "Product features")
public class AliCartTest extends AliBaseTest {

  @Story(value = "Search and add to cart")
  @Severity(SeverityLevel.NORMAL)
  @Owner(value = "Violetta Basina")
  @ParameterizedTest
  @DisplayName("search item and add it to cart check")
  @ValueSource(strings = {"650ml Infuser Water Bottle Plastic"})
  public void AliCart(String str) {
    AliCartPage cartPage = new AliCartPage(driver, wait);
    cartPage = page.search(str).addToCart();
    assertTrue(cartPage.checkCart(str));
  }
}