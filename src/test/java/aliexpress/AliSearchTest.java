package aliexpress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AliSearchTest extends AliBaseTest {

    @Test
    @DisplayName("searching check")
    public void AliSearch() {
        AliProductPage productPage = new AliProductPage(driver, wait);
        productPage = page.search();
        assertTrue(productPage.checkSearch());
    }
}