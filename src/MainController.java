import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class MainController {

    public static void main(String[] args) throws Exception{
        File fileData = new File ("/home/administator1/IdeaProjects/ReadWriteData/src/data.txt");
        File fileHtml = new File ("/home/administator1/IdeaProjects/ReadWriteData/src/exampleFirst.html");
        File fileHtml2 = new File ("/home/administator1/IdeaProjects/ReadWriteData/src/exampleFirst2.html");


        ReadWrite readData = new ReadWrite();
        ArrayList<String> arrayData = readData.readFile(fileData);
        for (String str : arrayData) {
            System.out.println(str);
        }

        ReadWrite readHtml = new ReadWrite();
        ReadWrite writeHtml = new ReadWrite();
        ArrayList<String> arrayHtml = readHtml.readFile(fileHtml);
        for (String str : arrayHtml) {
            if (str.contains("id=\"1000\"")||str.contains("id=\"1001\"")||str.contains("id=\"1002\"")){
                writeHtml.writeToFile(str, fileHtml2);
                System.out.println(str);
            }
            else {
                FileWriter writer = new FileWriter(fileHtml2, false);
                writer.write(str);
                writer.flush();
                //TODO необходимо использовать writer.flush();

            }
        }
    }


}
