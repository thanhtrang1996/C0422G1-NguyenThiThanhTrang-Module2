package ss5_public_static.thuc_hanh.cur;

import java.util.Scanner;

public class TestRun {

    Scanner scanner = new Scanner(System.in);

    static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "THANH", "DN", "female", "thanh123", "");
        students[1] = new Student(2, "THAI", "QT", "male", "thai13", "");
        students[2] = new Student(3, "THA", "TB", "female", "tha345", "");
    }

    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
    public void addNewStudent(){
        System.out.println("ADD NEW STUDENT");
        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.print("Nhap mail: ");
        String mail = scanner.nextLine();
        Student student = new Student(id,name,address,gender,mail);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
// create, read, update, delete
    public static void main(String[] args) {
        TestRun testRun = new TestRun();

        testRun.display();
        testRun.addNewStudent();
        testRun.display();
    }
}
