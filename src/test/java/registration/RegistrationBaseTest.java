package registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegistrationBaseTest{

    static RegistrationForm registrationPage = new RegistrationForm();

    @BeforeEach
    public void previous() {
        registrationPage.setUp();
    }

    @AfterEach
    public void ending() {
        registrationPage.complete();
    }
}
