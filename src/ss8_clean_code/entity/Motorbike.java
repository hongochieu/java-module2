package ss8_clean_code.entity;

public class Motorbike extends Vehicle{
    private int congSuat;
    public Motorbike(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congSuat){
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public void hienThiThongTin() {
        System.out.printf("Motorbike: %s - %s - %d - %s - Công suất: %dcc\n",
                bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat);
    }
}
