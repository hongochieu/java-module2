package ss8_clean_code.main;
import ss8_clean_code.repository.VehicleRepository;
import ss8_clean_code.service.VehicleService;

import java.util.Scanner;
public class TestMain {
        public static void main(String[] args) {
            VehicleRepository repository = new VehicleRepository();
            VehicleService service = new VehicleService(repository);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n==== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ====");
                System.out.println("1. Thêm mới phương tiện");
                System.out.println("2. Hiển thị phương tiện");
                System.out.println("3. Xoá phương tiện");
                System.out.println("4. Thoát");
                System.out.print("Chọn chức năng (1-4): ");

                String luaChon = scanner.nextLine();

                switch (luaChon) {
                    case "1":
                        service.themPhuongTien();
                        break;
                    case "2":
                        service.hienThiPhuongTien();
                        break;
                    case "3":
                        service.xoaPhuongTien();
                        break;
                    case "4":
                        System.out.println("👉 Thoát chương trình. Tạm biệt!");
                        return;
                    default:
                        System.out.println("❌ Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
                }
            }
        }
    }
