package ss15_io_text_file.thuc_hanh.sum_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath)  {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        try {
        FileReader fileReader =new FileReader(file); ;
        BufferedReader br = new BufferedReader(fileReader);

            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("not file");
            e.printStackTrace();
        }
        return numbers;
    }

    public void writeFile(String filePast, int max) throws IOException {
        try {
            FileWriter writer = new FileWriter(filePast, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write("Max đây nè: " + max);
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println("not file");
        }
    }
}