package task1_telephone.models;

public  abstract class Phone {
    private int id ;
    private String phoneName;
    private int price;
    private int soLuong;
    private String manufacturer;

    private static Integer countId;

    public Phone() {
    }

    public Phone(int id, String phoneName, int price, int soLuong, String manufacturer) {
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.soLuong = soLuong;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public static Integer getCountId() {
        return countId;
    }

    public static void setCountId(Integer countId) {
       Phone.countId = countId;
    }



    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", price='" + price + '\'' +
                ", manufacturer='" + manufacturer
                ;
    }
}
