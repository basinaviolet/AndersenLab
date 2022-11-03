package aliexpress;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@Epic(value = "Aliexpress tests")
@Feature(value = "Product features")
public class AliSearchTest extends AliBaseTest {

    @Story(value = "Searching")
    @Severity(SeverityLevel.NORMAL)
    @Owner(value = "Violetta Basina")
    @ParameterizedTest
    @DisplayName("searching check")
    @ValueSource(strings = {"650ml infuser water bottle plastic lemon kettle"})
    public void AliSearch(String str) {
        AliProductPage productPage = new AliProductPage(driver, wait);
        productPage = page.search(str);
        assertTrue(productPage.checkSearch());
    }
}