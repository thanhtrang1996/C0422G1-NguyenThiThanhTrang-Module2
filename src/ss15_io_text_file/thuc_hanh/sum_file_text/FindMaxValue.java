package ss15_io_text_file.thuc_hanh.sum_file_text;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }

        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss15_io_text_file/thuc_hanh/sum_file_text/file.csv");
        int maxValue = findMax(numbers);
        System.out.println(maxValue);
        readAndWriteFile.writeFile("src/ss15_io_text_file/thuc_hanh/sum_file_text/result.csv", maxValue);
    }
}
