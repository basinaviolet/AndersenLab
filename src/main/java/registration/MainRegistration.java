package registration;

public class MainRegistration {
    public static void main(String[] args) {
        RegistrationForm registrationPage = new RegistrationForm();

        //--------- RegistrationTrueTest------------------------
        System.out.println("RegistrationTrueTest");
        start(registrationPage);
        registrationPage.fillAllFields();
        errors(registrationPage);
        registrationPage.complete();

        //--------- RegistrationFalseTest------------------------
        System.out.println("RegistrationFalseTest");
        start(registrationPage);
        registrationPage.fillNotAllFields();
        errors(registrationPage);
        registrationPage.complete();

        //--------- RegistrationFalseErrorTest------------------------
        System.out.println("RegistrationFalseErrorTest");
        start(registrationPage);
        registrationPage.fillAllFieldsWithError();
        errors(registrationPage);
        registrationPage.complete();

        //--------- RegistrationFalseWithoutAllTest------------------------
        System.out.println("RegistrationFalseWithoutAllTest");
        start(registrationPage);
        registrationPage.withoutFillingFields();
        errors(registrationPage);
        registrationPage.complete();
    }

    public static void start(RegistrationForm registrationPage) {
        registrationPage.setUp();
        System.out.println("if it is registration page? " + registrationPage.ifMainPage());
    }

    public static void errors(RegistrationForm registrationPage) {
        Boolean error = (registrationPage.checkErrorElement() != 0);

        System.out.println(!error
                ? ("all required elements are not null")
                : ("there are some unfilled fields or fields with errors: "
                    + registrationPage.checkErrorElementCount())
        );
    }
}
