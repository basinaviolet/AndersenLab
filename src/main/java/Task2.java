import java.util.Locale;

public class Task2 {

    private final CommonOperations operation = new CommonOperations();

    public void algorithm2(String forCheck) {
        System.out.println("Алгоритм 2: " +
                (operation.getStr().toLowerCase().equals(forCheck.toLowerCase()) ?
                ("Привет, " + forCheck) :
                "Нет такого имени")
        );
    }
}
