package ss8_clean_code.repository;
import ss8_clean_code.entity.Truck;
import java.util.ArrayList;
import java.util.List;
public class TruckRepository {
    private List<Truck> truckList = new ArrayList<>();

    public void them(Truck truck) {
        truckList.add(truck);
    }

    public List<Truck> getTruckList() {
        return truckList;
    }

    public boolean xoa (String bienSo){
        return truckList.removeIf(t -> t.getBienKiemSoat().equals(bienSo));
    }
}
