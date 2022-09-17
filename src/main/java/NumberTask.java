public class NumberTask {

    //1
    /* Determining whether the sum of the numbers a and b is in the range from 10 to 20 (incl.)
    * the method receives int a and int b.
    * the method return true - if inside; false - if outside.
     */
    public boolean ifSumInLimits(int a, int b) {
        System.out.print("a = " + a + ", b = " + b + ", Sum into [10:20] ? -> ");
        return (a + b >= 10) && (a + b <= 20) ? true : false;
    }

    //2
    /* Determining whether the number a is positive ( >=0 ) or negative ( <0 )
     * the method receives int a.
     * the method returns nothing, and prints positive or negative.
     */
    public void printPositiveOrNegative(int a) {
        String result;
        result = (a >= 0) ? "positive" : "negative";
        System.out.println("the number " + a + " is " + result);
    }

    //3
    /* Determining whether the number a is negative ( <0 )
     * the method receives int a.
     * the method return true - if a < 0; false - if a >= 0 .
     */
    public boolean ifNegative(int a) {

        System.out.print("if " + a + " is negative? -> ");
        return a < 0;
    }

    //4.1
    /* The method prints the string the number of times.
     * the method receives int times - number of times for printing;
     *  - String strForPrinting - string for printing.
     * the method returns nothing.
     */
    public void printStrNumTimes(String strForPrinting, int times) {
        if (times > 0) {
            for (int i = 0; i < times; i++) {
                System.out.println(strForPrinting);
            }
        } else System.out.println("error: the number of times less than or equal 0");
    }

    //4.2
    /* Determining whether the year is a leap year
     * the method receives int year.
     * the method return true - if the year is a leap year; false - if isn`t.
     */
    public boolean ifLeapYear(int year) {

        System.out.print("if " + year + " year is leap? -> ");
        int[] leapYearBeforeOurEra = {-45, -42, -39, -36, -33, -30, -27, -24, -21, -18, -15, -12, -9};
        int temp = year;

        if (year == 0) {
            temp = -1;
        } else if (year > 4) {
            if (year % 100 == 0) temp = temp / 100;
            temp = temp % 4;
        } else if (year >= -45) {
            for (int i : leapYearBeforeOurEra) {
                if (i == year) temp = 0;
            }
        } else System.out.println("error: the year is less than the first leap year");

        return temp == 0;
    }
}
