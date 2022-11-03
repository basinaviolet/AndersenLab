package aliexpress;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@Epic(value = "Aliexpress tests")
@Feature(value = "Product features")
public class AliSelectTest extends AliBaseTest {

  private static Stream<Arguments> selectCategories() {
    return Stream.of(
            Arguments.of("Home", "Kitchen", "kitchen"),
            Arguments.of("Shoes", "Bestselling Shoes", "shoes"),
            Arguments.of("Phones", "Mobile Phones", "phones")
    );
  }

  @Story(value = "Categories")
  @Severity(SeverityLevel.NORMAL)
  @Owner(value = "Violetta Basina")
  @ParameterizedTest(name = "go to the selected category: {0} -> {1}")
  @DisplayName("selecting of category")
  @MethodSource("selectCategories")
  public void AliSelectCategory(String categoryItem, String subCategoryItem, String forCheck) {
    AliProductPage productPage = new AliProductPage(driver, wait);
    productPage = page.selectCategory(categoryItem, subCategoryItem);
    assertTrue(productPage.checkCurrentAria(forCheck));
  }
}