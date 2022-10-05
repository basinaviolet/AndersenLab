import fileMethods.AppData;
import fileMethods.WorkWithFile;

public class Main {
    public static void main(String[] args){
        WorkWithFile file = new WorkWithFile();
        String fileNameFrom = "./src/main/resources/fileWithData.csv";
        String fileNameIn = "./src/main/resources/fileWithDataIn.csv";
        AppData dataFromFile = new AppData();
        AppData dataInFile = new AppData();

        //create data for writing in a file
        String[] header = {"V1", "V2", "V3", "V4", "V5"};
        int[][] items = {{10, 20, 30, 40, 50}, {100, 200, 3000, 400, 500}};
        dataInFile.setHeader(header);
        dataInFile.setData(items);

        //read from a file
        file.readFromFile(fileNameFrom, dataFromFile);
        System.out.println("read from a file: " + dataFromFile.toString());

        //write in a file
        file.saveInFile(fileNameIn, dataInFile);
        dataInFile.toString();
    }
}
