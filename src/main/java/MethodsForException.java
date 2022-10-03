public class MethodsForException {
    public void checkAndSum(String[][] arrayForCheck) {
        int n = 4;

        // checking the size of the array. If the size is not equal to 4x4 -> exception
        try {
            checkArraySize(n, arrayForCheck);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {

            // calculation of the sum of all values of the array with verification is the string value a number
            int sum = 0;
            for (int i = 0; i < arrayForCheck.length; i++) {
                for (int j = 0; j < arrayForCheck[i].length; j++) {
                    if (isNumber(arrayForCheck[i][j], i, j))
                        sum += Integer.parseInt(arrayForCheck[i][j]);
                }
            }
            System.out.println("Sum = " + sum);
        }
    }

    /* checking the size of the array. If the size is not equal to 4x4 ->
     * an exception is thrown. Exception is checked in the calling method
     */
    public void checkArraySize(int n, String[][] arrayForCheck) throws MyArraySizeException {
        if (arrayForCheck.length == n) {
            for (String[] k : arrayForCheck) {
                if (k.length != n) throw new MyArraySizeException();
            }
        } else throw new MyArraySizeException();
    }

    /* checking the size of the array. If the size is not equal to 4x4 -> exception
     *
     */
    public boolean isNumber(String item, int i, int j) {
        try {
            Integer.parseInt(item);
            return true;
        } catch (NumberFormatException e) {
            new MyArrayDataException().getMessage(i, j);
            return false;
        }
    }
}
