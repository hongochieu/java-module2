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
    public Vehicle timTheoBienSo(String bienSo) {
        for (Car car : danhSachOto) {
            if (car.getBienKiemSoat().equalsIgnoreCase(bienSo)) return car;
        }
        for (Truck truck : danhSachXeTai) {
            if (truck.getBienKiemSoat().equalsIgnoreCase(bienSo)) return truck;
        }
        for (Motorbike bike : danhSachXeMay) {
            if (bike.getBienKiemSoat().equalsIgnoreCase(bienSo)) return bike;
        }
        return null;
    }
    public List<Truck> getDanhSachXeTai() {
        return danhSachXeTai;
    }

    public List<Car> getDanhSachOto() {
        return danhSachOto;
    }

    public List<Motorbike> getDanhSachXeMay() {
        return danhSachXeMay;
    }
}
