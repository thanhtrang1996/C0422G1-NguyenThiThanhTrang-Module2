package task1_telephone.models;

public class GenuinePhones extends Phone {
    private int thoiGianBaoHanh;
    private  String phamViBaoHanh;

    public GenuinePhones() {
    }

    public GenuinePhones(int id, String phoneName,int price, int soLuong, String manufacturer, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, phoneName, price, soLuong, manufacturer);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "GenuinePhones" + super.toString()+
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                ']';
    }
   public  String toFileGenuinePhone(){
        return this.getId() +","+this.getPhoneName()+","+this.getPrice()+","+this.getSoLuong()+","+this.getManufacturer()+","+this.thoiGianBaoHanh+","+this.phamViBaoHanh;
   }
}
