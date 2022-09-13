public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, 0);
        checkSumSign(-5, 0);
        checkSumSign(5, -5);
        printColor(0);
        printColor(-1);
        printColor(1);
        printColor(100);
        printColor(101);
        compareNumbers(1, -1);
        compareNumbers(1, 1);
        compareNumbers(-1, 1);
    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int per1, int per2) {
        int a = per1;
        int b = per2;
        System.out.println("a = " + a + ", b = " + b);
        if ((a + b) >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(int per) {
        int value = per;
        System.out.println("value = " + value);
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers(int per1, int per2) {
        int a = per1;
        int b = per2;
        System.out.println("a = " + a + ", b = " + b);
        if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
    }
}
