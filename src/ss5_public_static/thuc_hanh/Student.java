package ss5_public_static.thuc_hanh;

public class Student {
    private int stt;
    private String name;
    private static String college ;
    Student(int stt, String name){
         this.stt = stt;
         this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(stt + " : " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"TRANG");
        Student s2 = new Student(2,"NHAN");
        Student s3 = new Student(3,"TAI");
        Student s4 = new Student(4,"PHAT");
        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }

}
