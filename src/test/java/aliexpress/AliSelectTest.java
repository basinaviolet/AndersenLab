package aliexpress;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AliSelectTest extends AliBaseTest {

  private static Stream<Arguments> selectCategories() {
    return Stream.of(
            Arguments.of("Home", "Kitchen", "kitchen"),
            Arguments.of("Shoes", "Bestselling Shoes", "shoes"),
            Arguments.of("Phones", "Mobile Phones", "phones")
    );
  }

  @ParameterizedTest(name = "go to the selected category: {0} -> {1}")
  @MethodSource("selectCategories")
  public void AliSelectCategory(String categoryItem, String subCategoryItem, String forCheck) {
    aliexpressPage.setSettings();
    aliexpressPage.selectCategory(categoryItem, subCategoryItem);
    assertTrue(aliexpressPage.checkCurrentAria(forCheck));
  }
}