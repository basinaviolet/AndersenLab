import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NumberTask tasksWithNum = new NumberTask();
        ArrayTask tasksWithArr = new ArrayTask();

        //1
        System.out.println();
        System.out.println(tasksWithNum.ifSumInLimits(2, 12));
        System.out.println(tasksWithNum.ifSumInLimits(2, -2));
        System.out.println(tasksWithNum.ifSumInLimits(2, 20));

        //2
        System.out.println();
        tasksWithNum.printPositiveOrNegative(2);
        tasksWithNum.printPositiveOrNegative(-2);
        tasksWithNum.printPositiveOrNegative(0);

        //3
        System.out.println();
        System.out.println(tasksWithNum.ifNegative(2));
        System.out.println(tasksWithNum.ifNegative(-2));
        System.out.println(tasksWithNum.ifNegative(0));

        //4
        System.out.println();
        tasksWithNum.printStrNumTimes("my duplicate string", 4);

        //4*
        System.out.println();
        System.out.println(tasksWithNum.ifLeapYear(-33));
        System.out.println(tasksWithNum.ifLeapYear(0));
        System.out.println(tasksWithNum.ifLeapYear(4));
        System.out.println(tasksWithNum.ifLeapYear(2020));
        System.out.println(tasksWithNum.ifLeapYear(1900));
        System.out.println(tasksWithNum.ifLeapYear(2000));

        //5
        System.out.println();
        int[] arrayForInverting = tasksWithArr.getNewArray(6);
        System.out.println("array before reverting: " + Arrays.toString(arrayForInverting));
        System.out.println("after: " + Arrays.toString(tasksWithArr.getInvertingNumArray(arrayForInverting)));

        //6
        System.out.println();
        System.out.println(Arrays.toString(tasksWithArr.insertNumInArray()));

        //7
        System.out.println();
        System.out.println(Arrays.toString(tasksWithArr.changingNumInArray()));

        //8
        System.out.println();
        tasksWithArr.prnTwoDimArray(tasksWithArr.diagonalsWithOne(7));

        //9
        System.out.println();
        System.out.println(Arrays.toString(tasksWithArr.getArrayFromValue(6, 10)));

        //***
        System.out.println();
        int[] arrayForShift = {1,2,3,4,5,6};
        System.out.println("after shifting to 2: "
                + Arrays.toString(tasksWithArr.shiftValue(arrayForShift, 2)));
        System.out.println("after shifting to -2: "
                + Arrays.toString(tasksWithArr.shiftValue(arrayForShift, -2)));
    }
}
