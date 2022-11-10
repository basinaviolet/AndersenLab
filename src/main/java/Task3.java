import java.util.Arrays;

public class Task3 {

    private final CommonOperations operation = new CommonOperations();

    public void algorithm3(int numberForCheck, int[] arrayOfNumbers) {
        System.out.println("�������� 3");
        System.out.println("��������� ������: " + Arrays.toString(arrayOfNumbers));
        System.out.print("����� ������� " + numberForCheck + ": ");
        for (int i : arrayOfNumbers) {
            System.out.print((i % numberForCheck == 0) ? (i + " ") : "");
        }
        System.out.print("\n");
    }

    public void algorithm3(int numberForCheck) {
        System.out.println("���� ������� ����� ������� ��� ��������� 3:");
        int[] arrayOfNumbers = operation.getIntArray();
        algorithm3(numberForCheck, arrayOfNumbers);
    }
}
