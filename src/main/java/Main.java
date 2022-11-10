public class Main {

    public static void main(String[] args) {
        int numberForCheckTask1 = 7;
        String strForCheckTask2 = "ֲÿקוסכאג";
        int[] arrayOfNumbersTask3 = {-3, -2, 0, 9, 11};
        int numberForCheckTask3 = 3;
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.algorithm1(numberForCheckTask1);
        t2.algorithm2(strForCheckTask2);
        t3.algorithm3(numberForCheckTask3, arrayOfNumbersTask3);
        t3.algorithm3(numberForCheckTask3);
    }
}
