import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonOperations {
    public int getInt() {
        int number;

        System.out.print("введите число: ");
        Scanner scn = new Scanner(System.in);

        while (!scn.hasNextInt()) {
            System.out.println("введите корректное число");
            scn.next();
        }
        number = scn.nextInt();
        return number;
    }

    public String getStr() {
        System.out.print("введите имя: ");
        return new Scanner(System.in).next();
    }

    public int[] getIntArray() {
        Scanner scn = new Scanner(System.in);
        Map<Integer, Integer> temp = new HashMap<>();
        int i = 0;

        System.out.print("введите массив чисел (для окончания ввода массива введите любой символ, отличный от пробела и числа):");
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
