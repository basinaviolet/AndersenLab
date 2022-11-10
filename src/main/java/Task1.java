public class Task1 {

    private final CommonOperations operation = new CommonOperations();
    public void algorithm1(int forCheck) {
        System.out.println("Алгоритм 1");
        if (operation.getInt() > forCheck) System.out.println("Привет");
    }
}
