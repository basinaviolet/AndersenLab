package fileMethods;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        checkCountOfData(data);
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    /* checking of matching value and headers numbers
     * if the numbers do not match, an error message will be written
     */
    private void checkCountOfData(int[][] data){
        for (int i = 0; i < data.length; i++){
            if (data[i].length != header.length){
                System.out.println("Error in AppData class: the number of values does not match the number of headers in " + i + " row");
            }
        }
    };

    @Override
    public String toString() {
        return "AppData {" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.deepToString(data) +
                '}';
    }

    public String headerToString() {
        StringBuilder headerString = new StringBuilder();
        Arrays.stream(this.header).forEach(h -> headerString.append(h).append(";"));
        headerString.setLength(headerString.length()-1);
        return headerString.toString();
    }

    public String dataToString() {
        StringBuilder dataString = new StringBuilder();

        for(int i = 0; i < this.data.length; i++) {
            Arrays.stream(this.data[i]).forEach(d -> dataString.append(d).append(";"));
            dataString.setLength(dataString.length()-1);
            dataString.append("\n");
        }
        return dataString.toString();
    }
}
