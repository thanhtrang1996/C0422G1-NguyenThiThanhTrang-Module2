package ss16.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String path, List<Student>students) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos  = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;

    }


    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        writeToObject("src/ss16/thuc_hanh/ss11.csv",students);
        List<Student> studentDataFromFile = readDataFromFile("src/ss16/thuc_hanh/ss11.csv");
        for (Student student:studentDataFromFile
             ) {
            System.out.println(student);

        }

    }
}
