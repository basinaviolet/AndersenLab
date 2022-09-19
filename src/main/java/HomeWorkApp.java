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

    public static void checkSumSign(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(((a + b) >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(int value) {
        System.out.println("value = " + value);
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println( (a >= b) ? "a >= b" : "a < b");
    }
}
