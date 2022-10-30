package registrationTestSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import registration.RegistrationForm;


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
