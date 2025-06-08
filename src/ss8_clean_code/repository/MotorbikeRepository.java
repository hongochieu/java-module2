package ss8_clean_code.repository;
import ss8_clean_code.entity.Motorbike;
import java.util.ArrayList;
import java.util.List;
public class MotorbikeRepository {
    private List<Motorbike> motorbikeList = new ArrayList<>();

    public void them (Motorbike motorbike){
        motorbikeList.add(motorbike);
    }

    public List<Motorbike> getMotorbikeList() {
        return motorbikeList;
    }

    public boolean xoa(String bienSo) {
        return motorbikeList.removeIf(b -> b.getBienKiemSoat().equals(bienSo));
    }
}
