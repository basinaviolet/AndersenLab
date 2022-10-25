package aliexpress;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AliBaseTest {

    static AliMainForm aliexpressPage = new AliMainForm();

    @BeforeEach
    public void previous() {
        aliexpressPage.setUp();
    }

    @AfterEach
    public void ending() {
        aliexpressPage.complete();
    }
}
