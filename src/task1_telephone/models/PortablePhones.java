package task1_telephone.models;

public class PortablePhones extends Phone {
    private String quocGiaXachTay;
    private  String trangThai;

    public PortablePhones() {
    }

    public PortablePhones(int id, String phoneName, int price, int soLuong, String manufacturer, String quocGiaXachTay, String trangThai) {
        super(id, phoneName, price, soLuong, manufacturer);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PortablePhones{" +super.toString()+
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    public String toFilePortablePhones(){
        return this.getId()+","+this.getPhoneName()+","+this.getPrice()+","+this.getSoLuong()+","+this.getManufacturer()+","+this.quocGiaXachTay+","+this.trangThai;
    }
}
