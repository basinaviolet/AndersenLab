package fileMethods;

import exeptionAndHelp.HelpMethods;

import java.io.*;

public class WorkWithFile {
    public boolean readFromFile(String pathToFile, AppData data) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            HelpMethods help = new HelpMethods();
            String str;
            StringBuilder finalStr = new StringBuilder();

            while ((str = reader.readLine()) != null) {
                finalStr.append(str).append(":");
            }
            help.toAppDataClass(String.valueOf(finalStr), data);
            reader.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveInFile(String pathToFile, AppData data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {
            StringBuilder strForWriting = new StringBuilder();

            strForWriting.append(data.headerToString())
                    .append("\n")
                    .append(data.dataToString());
            writer.write(strForWriting.toString());
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
