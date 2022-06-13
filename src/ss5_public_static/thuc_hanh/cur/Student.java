package ss5_public_static.thuc_hanh.cur;

public class Student {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String mail;
    public static String school = "Codegym";

    public Student(int id, String name, String address, String gender, String mail) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.mail = mail;
    }

    public Student(int id, String name, String address, String gender, String mail, String school) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.mail = mail;
        this.school = school;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Cur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", mail='" + mail + '\'' +
                '}';
    }
}
