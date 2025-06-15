package ss8_clean_code.service;

import ss8_clean_code.entity.*;
import ss8_clean_code.repository.VehicleRepository;

import java.util.Scanner;
import java.util.List;

public class VehicleService {
    private VehicleRepository repository;
    private Scanner scanner = new Scanner(System.in);

    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public void themPhuongTien() {
        System.out.printf("1. Thêm xe tải\n2. Thêm ô tô\n3. Thêm xe máy\n");
        System.out.printf("Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.printf("Biển KS: ");
                String bien1 = scanner.nextLine();
                System.out.printf("Hãng SX: ");
                String hang1 = scanner.nextLine();
                System.out.printf("Năm SX: ");
                int nam1 = Integer.parseInt(scanner.nextLine());
                System.out.printf("Chủ sở hữu: ");
                String chu1 = scanner.nextLine();
                System.out.printf("Trọng tải: ");
                double trongTai = Double.parseDouble(scanner.nextLine());
                repository.themTruck(new Truck(bien1, hang1, nam1, chu1, trongTai));
                System.out.println("✅ Đã thêm xe tải thành công.");
                break;
            case 2:
                System.out.printf("Biển KS: ");
                String bien2 = scanner.nextLine();
                System.out.printf("Hãng SX: ");
                String hang2 = scanner.nextLine();
                System.out.printf("Năm SX: ");
                int nam2 = Integer.parseInt(scanner.nextLine());
                System.out.printf("Chủ sở hữu: ");
                String chu2 = scanner.nextLine();
                System.out.printf("Số chỗ ngồi: ");
                int soCho = Integer.parseInt(scanner.nextLine());
                System.out.printf("Kiểu xe: ");
                String kieuXe = scanner.nextLine();
                repository.themCar(new Car(bien2, hang2, nam2, chu2, soCho, kieuXe));
                System.out.println("✅ Đã thêm ô tô thành công.");
                break;
            case 3:
                System.out.printf("Biển KS: ");
                String bien3 = scanner.nextLine();
                System.out.printf("Hãng SX: ");
                String hang3 = scanner.nextLine();
                System.out.printf("Năm SX: ");
                int nam3 = Integer.parseInt(scanner.nextLine());
                System.out.printf("Chủ sở hữu: ");
                String chu3 = scanner.nextLine();
                System.out.printf("Công suất: ");
                int congSuat = Integer.parseInt(scanner.nextLine());
                repository.themMotorbike(new Motorbike(bien3, hang3, nam3, chu3, congSuat));
                System.out.println("✅ Đã thêm xe máy thành công.");
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ.");
        }
    }

    public void hienThiPhuongTien() {
        System.out.printf("1. Hiển thị xe tải\n2. Hiển thị ô tô\n3. Hiển thị xe máy\n");
        System.out.printf("Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                List<Truck> dsTai = repository.getDanhSachXeTai();
                if (dsTai.isEmpty()) {
                    System.out.println("❌ Không có xe tải.");
                } else {
                    for (Truck t : dsTai) {
                        t.hienThiThongTin();
                    }
                }
                break;
            case 2:
                List<Car> dsCar = repository.getDanhSachOto();
                if (dsCar.isEmpty()) {
                    System.out.println("❌ Không có ô tô.");
                } else {
                    for (Car c : dsCar) {
                        c.hienThiThongTin();
                    }
                }
                break;
            case 3:
                List<Motorbike> dsBike = repository.getDanhSachXeMay();
                if (dsBike.isEmpty()) {
                    System.out.println("❌ Không có xe máy.");
                } else {
                    for (Motorbike b : dsBike) {
                        b.hienThiThongTin();
                    }
                }
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ.");
        }
    }

    public void xoaPhuongTien() {
        System.out.printf("Nhập biển kiểm soát cần xoá: ");
        String bien = scanner.nextLine();

        Vehicle v = repository.timTheoBienSo(bien);
        if (v == null) {
            System.out.println("❌ Không tìm thấy phương tiện.");
            return;
        }

        System.out.printf("Bạn có chắc chắn muốn xoá không? (Yes/No): ");
        String xacNhan = scanner.nextLine();
        if (xacNhan.equalsIgnoreCase("Yes")) {
            boolean ketQua = repository.xoaTheoBienSo(bien);
            if (ketQua) {
                System.out.println("✅ Đã xoá thành công.");
            } else {
                System.out.println("❌ Xoá thất bại.");
            }
        } else {
            System.out.println("⏪ Hủy xoá.");
        }
    }
}
