package ss5_public_static.thuc_hanh.crud;

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

    public void addNewStudent() {
        System.out.println("ADD NEW STUDENT");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter mail: ");
        String mail = scanner.nextLine();
        Student student = new Student(id, name, address, gender, mail);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void findNameStudent() {
        System.out.println("Find name student");
        System.out.print("Enter the name you want to find: ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                {
                    if (students[i].getName().equals(name)) {
                        System.out.println(1);
                        System.out.println("Student :" + students[i]);
                    }

                }
            }

        }
    }

    // crud la create, read, update, delete
    public void deleteStudent() {
        System.out.println("Delete Student");
        System.out.print("Enter the id you want to delete : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = id; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

    }

    public static void main(String[] args) {
        TestRun testRun = new TestRun();
        testRun.display();
        testRun.addNewStudent();
        testRun.display();
        testRun.deleteStudent();
        testRun.display();
        testRun.findNameStudent();
        testRun.display();
    }
}
