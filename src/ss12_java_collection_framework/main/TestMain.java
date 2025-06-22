package ss12_java_collection_framework.main;

import ss12_java_collection_framework.entity.Product;
import ss12_java_collection_framework.service.ProductService;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp giá tăng/giảm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    service.add(new Product(id, name, price));
                    break;

                case 2:
                    service.findAll().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID cần sửa: ");
                    int idU = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên mới: ");
                    String nameU = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double priceU = Double.parseDouble(sc.nextLine());
                    boolean updated = service.update(idU, nameU, priceU);
                    System.out.println(updated ? "Sửa thành công" : "Không tìm thấy ID");
                    break;

                case 4:
                    System.out.print("ID cần xóa: ");
                    int idD = Integer.parseInt(sc.nextLine());
                    boolean deleted = service.delete(idD);
                    System.out.println(deleted ? "Xóa thành công" : "Không tìm thấy ID");
                    break;

                case 5:
                    System.out.print("Nhập tên: ");
                    String keyword = sc.nextLine();
                    service.search(keyword).forEach(System.out::println);
                    break;

                case 6:
                    System.out.print("1. Tăng  2. Giảm: ");
                    int sortOption = Integer.parseInt(sc.nextLine());
                    service.sortByPrice(sortOption == 1);
                    System.out.println("Đã sắp xếp.");
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Sai lựa chọn.");
            }
        } while (choice != 0);
    }
}
