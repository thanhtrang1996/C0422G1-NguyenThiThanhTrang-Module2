package ss9_array_list.bai_tap;

public class ArrayListTest {
    private int id;
    private String name;

    public ArrayListTest(int id, String name) {
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
    } public static void main(String[] args) {
ArrayListTest student = new ArrayListTest(1,"Tom");
ArrayListTest student1 = new ArrayListTest(2,"Jack");
ArrayListTest student2 = new ArrayListTest(3,"Tommy");
ArrayListTest student3 = new ArrayListTest(4,"Marry");
ArrayListTest student4 = new ArrayListTest(5,"Joy");
ArrayListTest student5 = new ArrayListTest(6,"ToTo");
    }

}
