package end_module.bai_tap1.models;

import end_module.bai_tap1.models.Transport;

public class Truck extends Transport {
    private int trongTai;

    public Truck(int bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, float taiTrong) {
    }

    public Truck(int bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trongTai=" + trongTai +
                '}';
    }
}
