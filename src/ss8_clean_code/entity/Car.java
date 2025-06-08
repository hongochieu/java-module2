package ss8_clean_code.entity;

public class Car extends Vehicle{
    private int soChoNgoi;
    private String kieuXe;
    public Car(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe){
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
    @Override
    public void hienThiThongTin() {
        System.out.printf("Car: %s - %s - %d - %s - %s - %d\n", bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, kieuXe, soChoNgoi);
    }
}
