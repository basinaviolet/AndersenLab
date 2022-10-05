package exeptionAndHelp;

import fileMethods.AppData;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HelpMethods {

    /* help method for converting data from a file to a class
     *
     */
    public void toAppDataClass(String strToData, AppData data) {
        String[] arrayWithData = strToData.split(":");
        data.setHeader(arrayWithData[0].split(";"));

        int i = 1;
        int n = data.getHeader().length;
        int[][] dataItem = new int[arrayWithData.length-1][n];

        while (i <= arrayWithData.length-1) {
            String[] newStrWithData = arrayWithData[i].split(";");
            if (newStrWithData.length != n)
                System.out.println("Error when transferring data from a file: the count of headers doesn`t match the  count of values in " + i + " row");
            for (int j = 0; j < (n <= newStrWithData.length ? n : newStrWithData.length); j++) {
                dataItem[i-1][j] = isNumber(newStrWithData[j], i-1, j) ? Integer.parseInt(newStrWithData[j]) : 0;
            }
            i++;
        }
        data.setData(dataItem);
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
