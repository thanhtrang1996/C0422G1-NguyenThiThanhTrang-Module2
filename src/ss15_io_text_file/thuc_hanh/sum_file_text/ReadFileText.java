package ss15_io_text_file.thuc_hanh.sum_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileText {
    public void readFileText(String filePath) throws FileNotFoundException {
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/ss15_io_text_file/thuc_hanh/sum_file_text/file.txt";
        ReadFileText readFile = new ReadFileText();
        readFile.readFileText(path);
    }
}