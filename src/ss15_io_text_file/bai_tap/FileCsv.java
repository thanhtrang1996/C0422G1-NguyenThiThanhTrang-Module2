package ss15_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileCsv {
    public static List<String>  readFile( String filePath){
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            String [] arr = null;
            while ((str = bufferedReader.readLine()) != null){
               arr = str.split(",");
               Country country = new Country(Integer.parseInt(arr[0]),arr[1],arr[2]);
                System.out.println(country);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }return list;
    }

    public static void main(String[] args) {

        List<String> list = readFile("src/ss15_io_text_file/bai_tap/file.csv") ;

    }
}
