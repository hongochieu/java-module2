package ss8_clean_code.entity;

public abstract class Vehicle {
    protected String bienKiemSoat;
    protected String tenHangSanXuat;
    protected int namSanXuat;
    protected String chuSoHuu;

    public Vehicle(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu){
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public abstract void hienThiThongTin();
}
