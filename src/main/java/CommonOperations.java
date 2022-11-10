import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonOperations {
    public int getInt() {
        int number;

        System.out.print("������� �����: ");
        Scanner scn = new Scanner(System.in);

        while (!scn.hasNextInt()) {
            System.out.println("������� ���������� �����");
            scn.next();
        }
        number = scn.nextInt();
        return number;
    }

    public String getStr() {
        System.out.print("������� ���: ");
        return new Scanner(System.in).next();
    }

    public int[] getIntArray() {
        Scanner scn = new Scanner(System.in);
        Map<Integer, Integer> temp = new HashMap<>();
        int i = 0;

        System.out.print("������� ������ ����� (��� ��������� ����� ������� ������� ����� ������, �������� �� ������� � �����):");
        while (scn.hasNextInt()) {
            temp.put(i, scn.nextInt());
            i++;
        }

        int[] intArray = new int[temp.size()];
        for (Integer key : temp.keySet()) {
            intArray[key] = temp.get(key);
        }
        return intArray;
    }
}
