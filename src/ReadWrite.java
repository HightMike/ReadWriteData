import java.io.*;
import java.util.ArrayList;

public class ReadWrite {

    private ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> readFile(File file) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String str;

        while ((str= bufferedReader.readLine())!=null) {
            arrayList.add(str);
        }
        return arrayList;
    }


    public void writeToFile(String string, BufferedWriter fileWriter) throws Exception{
        String str = String.format("\t\t<input type=\"text\" size=\"32\" placeholder=\"%s\" name=\"fee\" />\n",string);
        fileWriter.write(str);
        fileWriter.newLine();
    }
}
