import java.util.Arrays;

public class Task3 {

    private final CommonOperations operation = new CommonOperations();

    public void algorithm3(int numberForCheck, int[] arrayOfNumbers) {
        System.out.println("Алгоритм 3");
        System.out.println("Начальный массив: " + Arrays.toString(arrayOfNumbers));
        System.out.print("Числа кратные " + numberForCheck + ": ");
        for (int i : arrayOfNumbers) {
            System.out.print((i % numberForCheck == 0) ? (i + " ") : "");
        }
        System.out.print("\n");
    }

    public void algorithm3(int numberForCheck) {
        System.out.println("Ввод массива через консоль для алгоритма 3:");
        int[] arrayOfNumbers = operation.getIntArray();
        algorithm3(numberForCheck, arrayOfNumbers);
    }
}
