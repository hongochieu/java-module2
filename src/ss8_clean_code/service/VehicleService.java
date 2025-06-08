package ss8_clean_code.service;
import ss8_clean_code.entity.*;
import ss8_clean_code.repository.VehicleRepository;
import java.util.Scanner;
public class VehicleService {
    private VehicleRepository repository;
    private Scanner scanner = new Scanner(System.in);

    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public void themPhuongTien() {
        System.out.printf("1. Thêm xe tải\n2. Thêm ô tô\n3. Thêm xe máy");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.printf("Biển KS: ");
                String bien1 = scanner.nextLine();
                System.out.printf("Hãng SX: ");
                String hang1 = scanner.nextLine();
                System.out.printf("Năm SX: ");
                int nam1 = Integer.parseInt(scanner.nextLine());

        }
    }
}
