package ss8_clean_code.entity;

public class Truck extends Vehicle{
    private double trongTai;
    public Truck(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai){
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    @Override
    public void hienThiThongTin() {
        System.out.printf("Truck: %s - %s - %d - %s - Trọng tải: %.1f tấn\n",
                bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai);
    }
}
