package ss15_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String filePath){
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader =null ;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                list.add(str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public  static void writeFile(String filePath,List<String> list){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter = new FileWriter(file);
           bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.newLine();
                bufferedWriter.write(list.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        String source = "src/ss15_io_text_file/bai_tap/source_file.csv";
        List<String> list = readFile(source);
        String target = "src/ss15_io_text_file/bai_tap/target_file.csv";
        writeFile(target,list);
    }

}
