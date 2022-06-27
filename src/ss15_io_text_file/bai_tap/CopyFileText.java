package ss15_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String filePath){
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                list.add(str);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public  static void writeFile(String filePath,List<String> list){
        File file = new File(filePath);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.newLine();
                bufferedWriter.write(list.get(i));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "src/ss15_io_text_file/bai_tap/source_file.csv";
        List<String> list = readFile(source);
        String target = "src/ss15_io_text_file/bai_tap/target_file.csv";
        writeFile(target,list);
    }

}
