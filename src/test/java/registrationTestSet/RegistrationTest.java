package registrationTestSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.stream.Stream;



public class RegistrationTest extends RegistrationBaseTest {

    private static Stream<Arguments> realItems() {
        return Stream.of(
                Arguments.of("Violeta", "Basina", "48999999999", "Vio",
                        "similjar@gmail.com", "A few words about me",
                        "123456", "123456")
        );
    }

    private static Stream<Arguments> falseItems() {
        return Stream.of(
                Arguments.of("without confirmPassword", "Violeta", "Basina", "48999999999", "Vio",
                        "similjar@gmail.com", "A few words about me",
                        "123456", ""),
                Arguments.of("incorrect e-mail", "Violeta", "Basina", "48999999999", "Vio",
                        "similjar\"gmail.com", "A few words about me",
                        "123456", "123456")
        );
    }

    @Test
//    @DisplayName("all required fields are filled in correctly")
    void registrationTruePageTitleTest() {
        assertTrue(registrationPage.ifMainPage());
    }

    @ParameterizedTest(name = "all required fields are filled in correctly: values")
    @MethodSource("realItems")
    void registrationTrueValueTest(String name, String lastName,
                                   String phoneNumber, String email, String username,
                                   String about, String password, String confirmPassword) {
        HashMap<String, String> fieldValues = fieldValuesInsert(
                new String[]{name, lastName, phoneNumber, email, username, about, password, confirmPassword});
        registrationPage.fillingFields(fieldValues);
        assertTrue(registrationPage.checkValue(fieldValues));
    }

    @ParameterizedTest(name = "all required fields are filled in correctly: button")
    @MethodSource("realItems")
    void registrationTrueTest(String name, String lastName,
                              String phoneNumber, String email, String username,
                              String about, String password, String confirmPassword) {
        HashMap<String, String> fieldValues = fieldValuesInsert(
                new String[]{name, lastName, phoneNumber, email, username, about, password, confirmPassword});
        registrationPage.registration(fieldValues);
        assertEquals(0, registrationPage.checkErrorElement());
    }

    @ParameterizedTest(name = "there are some unfilled fields: {0}")
    @MethodSource("falseItems")
    void registrationFalseTest(String testName, String name, String lastName,
                               String phoneNumber, String email, String username,
                               String about, String password, String confirmPassword) {
        assertTrue(registrationPage.ifMainPage());
        HashMap<String, String> fieldValues = fieldValuesInsert(
                new String[]{name, lastName, phoneNumber, email, username, about, password, confirmPassword});
        registrationPage.registration(fieldValues);
        assertNotEquals(0, registrationPage.checkErrorElement());
    }

    @Test
    @DisplayName("there are some unfilled fields: null")
    void registrationFalseNullValuesTest() {
        registrationPage.withoutFillingFields();
        assertNotEquals(0, registrationPage.checkErrorElement());
    }

    public HashMap<String, String> fieldValuesInsert(String[] forFilling) {
        HashMap<String, String> fieldValues = new HashMap<>();

        fieldValues.put("name", forFilling[0]);
        fieldValues.put("lastName", forFilling[1]);
        fieldValues.put("phoneNumber", forFilling[2]);
        fieldValues.put("username", forFilling[3]);
        fieldValues.put("email", forFilling[4]);
        fieldValues.put("about", forFilling[5]);
        fieldValues.put("password", forFilling[6]);
        fieldValues.put("confirmPassword", forFilling[7]);

        return fieldValues;
    }
}
