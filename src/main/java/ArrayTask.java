import java.util.Arrays;

public class ArrayTask {

    // 5
    /* Inverting items of array from 1 -> 0 and from 0 -> 1
     * the method receives int[] arrayForReverting - array for reverting.
     * the method return int[] array as result.
     */
    public int[] getInvertingNumArray(int[] arrayForReverting) {

        for (int i = 0; i < arrayForReverting.length; i++) {
                arrayForReverting[i] = (arrayForReverting[i] == 0) ? 1 : 0;
        }
        return arrayForReverting;
    }

    /* Creating an array consisting of 0 and 1 with length = n
     * the method receives int n - length of array.
     * the method return int[] array consisting of 0 and 1 with length = n.
     */
    public int[] getNewArray(int n) {
        if (n > 0) {
            int[] newArrayForReverting = new int[n];

            for (int i = 0; i < n; i++) {
                newArrayForReverting[i] = (int) (Math.random() + 0.5);
            }
            return newArrayForReverting;
        } else System.out.println("error: the number of array`s items less than 1");
        return null;
    }

    // 6
    /* Creating an array consisting of a sequence of numbers from 1 -> 100
     * the method receives nothing.
     * the method return int[] array consisting of a sequence of numbers from 1 -> 100.
     */
    public int[] insertNumInArray() {
        int[] newArrayWithNum = new int[100];

        for (int i = 0; i < newArrayWithNum.length; i++) {
            newArrayWithNum[i] = i + 1;
        }
        return newArrayWithNum;
    }

    // 7
    /* Changing the items of given array: if an item < 6 it is doubled.
     * the method receives nothing, the desired array is set inside the method.
     * the method return int[] array as result.
     */
    public int[] changingNumInArray() {
        System.out.print("{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1} -> ");
        int[] base = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < base.length; i++) {
            if (base[i] < 6) base[i] = base[i] * 2;
        }
        return base;
    }

    // 8
    /* Changing the two-dimensional array with diagonal`s items = 1, and others = 0.
     * the method receives int n - length of array (count of the both rows and columns).
     * the method return int[][] array as result.
     */
    public int[][] diagonalsWithOne(int n) {
        int[][] arrayWithOneInDiagonal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1))
                    arrayWithOneInDiagonal[i][j] = 1;
                else arrayWithOneInDiagonal[i][j] = 0;
            }
        }
        return arrayWithOneInDiagonal;
    }

    //9
    /* Creating an array where length and items are equal to the given values.
     * the method receives int len - length of array; int initialValue - item of array.
     * the method return int[] array as result.
     */
    public int[] getArrayFromValue(int len, int initialValue) {

        int[] newArrayFromValue = new int[len];
        for (int i = 0; i < len; i++) {
            newArrayFromValue[i] = initialValue;
        }
        return newArrayFromValue;
    }

    //***
    /* Shifting of items of the array elements by a given number of steps (+) - to the right, (-) - to the left.
     * the method receives - int[] baseArray - array for changing;
     *  - int shiftNum - number of steps for shifting.
     * the method return int[] array as result.
     */
    public int[] shiftValue(int[] baseArray, int shiftNum) {
        int temp;
        int absShiftNum = Math.abs(shiftNum);

        System.out.println("baseArray: " + Arrays.toString(baseArray));
        if (baseArray.length > 1) {
            for (int i = 1; i <= absShiftNum; i++) {
                int j;
                if (shiftNum > 0) {
                    temp = baseArray[baseArray.length - 1];
                    for (j = baseArray.length - 1; j > 0; j--) {
                        baseArray[j] = baseArray[j - 1];
                    }
                    baseArray[0] = temp;
                }
                if (shiftNum < 0) {
                    temp = baseArray[0];
                    for (j = 0; j < baseArray.length - 1; j++) {
                        baseArray[j] = baseArray[j + 1];
                    }
                    baseArray[baseArray.length - 1] = temp;
                }
            }
        }
        return baseArray;
    }

    //support
    /* Help method for printing two-dimensional array.
     * the method receives - int[] arrayForPrn - array for printing;
     * the method returns nothing, and prints array as result.
     */
    public void prnTwoDimArray(int[][] arrayForPrn) {
        for (int[] arrLines : arrayForPrn) {
            System.out.println(Arrays.toString(arrLines));
        }
    }
}
