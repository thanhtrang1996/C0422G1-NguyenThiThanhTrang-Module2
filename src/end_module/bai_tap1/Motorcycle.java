package end_module.bai_tap1;

public class Motorcycle extends Transport {
    private double congSuat;

    public Motorcycle() {
    }

    public Motorcycle(int bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "congSuat=" + congSuat +
                '}';
    }
}
