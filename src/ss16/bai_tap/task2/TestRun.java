package ss16.bai_tap.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestRun {

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        File source = new File("src/ss16/bai_tap/task2/source.csv");
        File target = new File("src/ss16/bai_tap/task2/target.csv");
        try {
            copyFileUsingStream(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Dung luong: " + target.length());
    }
}
