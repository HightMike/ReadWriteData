import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class MainController {

    public static void main(String[] args) throws Exception{
        File fileData = new File ("Resource/data.txt");
        File fileHtml = new File ("Resource/exampleFirst.html");
        File fileHtml2 = new File ("Resource/exampleFirst2.html");


        ReadWrite readData = new ReadWrite();
        ArrayList<String> arrayData = readData.readFile(fileData);
        for (String str : arrayData) {
            System.out.println(str);
        }

        ReadWrite readHtml = new ReadWrite();
        ReadWrite writeHtml = new ReadWrite();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileHtml2));
        ArrayList<String> arrayHtml = readHtml.readFile(fileHtml);
        for (String str : arrayHtml) {
            if (str.contains("id=\"1000\"")){
                fileWriter.write(str);
                fileWriter.newLine();
                String newStr = arrayData.get(0).split(" ")[2];
                writeHtml.writeToFile(newStr, fileWriter);
            }
            else if (str.contains("id=\"1001\"")) {
                fileWriter.write(str);
                fileWriter.newLine();
                String newStr = arrayData.get(1).split(" ")[2];
                writeHtml.writeToFile(newStr, fileWriter);
            }
            else if (str.contains("id=\"1002\"")) {
                fileWriter.write(str);
                fileWriter.newLine();
                String newStr = arrayData.get(2).split(" ")[2];
                writeHtml.writeToFile(newStr, fileWriter);
            }
            else {
                fileWriter.write(str);
                fileWriter.newLine();
            }
        }
        fileWriter.flush();
    }
}
