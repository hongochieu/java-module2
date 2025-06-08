package ss8_clean_code.repository;
import ss8_clean_code.entity.Car;
import java.util.ArrayList;
import java.util.List;
public class CarRepository {
    private List<Car> carList = new ArrayList<>();
    public void them(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
    public boolean xoa(String bienSo) {
        return carList.removeIf(c -> c.getBienKiemSoat().equals(bienSo));
    }
}
