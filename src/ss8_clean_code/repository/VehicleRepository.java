package ss8_clean_code.repository;
import ss8_clean_code.entity.*;
import java.util.ArrayList;
import java.util.List;
public class VehicleRepository {
    public List<Car> danhSachOto = new ArrayList<>();
    public List<Truck> danhSachXeTai = new ArrayList<>();
    public List<Motorbike> danhSachXeMay = new ArrayList<>();

    public void themCar(Car car){
        danhSachOto.add(car);
    }

    public void themTruck(Truck truck){
        danhSachXeTai.add(truck);
    }

    public void themMotorbike(Motorbike motorbike){
        danhSachXeMay.add(motorbike);
    }
    public boolean xoaTheoBienSo (String bienSo) {
        return danhSachOto.removeIf(v -> v.getBienKiemSoat().equals(bienSo)) ||
                danhSachXeTai.removeIf(v -> v.getBienKiemSoat().equals(bienSo)) ||
                danhSachXeMay.removeIf(v -> v.getBienKiemSoat().equals(bienSo));

    }
}
