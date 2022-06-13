package ss5_public_static.bai_tap.student;

public class TestRun {
    public static void main(String[] args) {
        Student student1 = new Student("jack","O2");
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println(" Student 1 : Name :" +student1.getName() +"  Class :" +student1.getClasses());
        System.out.println( "Student2 : Name :" +student2.getName() +"   Class :" + student2.getClasses());
        student3.setName("bts");
        student3.setClasses("cl");
        System.out.println("Student3 : Name :" +student3.getName() +"   Class :" + student3.getClasses());

    }
}
