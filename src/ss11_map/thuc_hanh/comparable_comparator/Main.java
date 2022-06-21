package ss11_map.thuc_hanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien",24,"HN");
        Student student2 = new Student("Kan",25,"QB");
        Student student3 = new Student("An",28,"HN");
        Student student4 = new Student("Ba",22,"QT");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student students: lists
             ) {
            System.out.println(students.toString());

        }
        AgeComparator  ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("///////////////////");
        for (Student st: lists
             ) {
            System.out.println(st.toString());

        }

    }
}
