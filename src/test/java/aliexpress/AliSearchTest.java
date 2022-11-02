package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AliSearchTest extends AliBaseTest {

    @ParameterizedTest
    @DisplayName("searching check")
    @ValueSource(strings = {"650ml infuser water bottle plastic lemon kettle"})
    public void AliSearch(String str) {
        AliProductPage productPage = new AliProductPage(driver, wait);
        productPage = page.search(str);
        assertTrue(productPage.checkSearch());
    }
}