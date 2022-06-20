package ss9_array_list.bai_tap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
    public  static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return "ArrayListTest{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student(1, "joy");
        Student student2 = new Student(2, "tom");
        Student student3 = new Student(3, "tommy");
        Student student4 = new Student(4, "cherry");
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.size();


        for (Student o : arrayList
        ) {
            System.out.println(o);

        }
        System.out.println(arrayList.size());

    }
    }


