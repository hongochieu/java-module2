package ss2_vong_lap_trong_java;
import java.util.Scanner;

public class HienThiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số lượng số nguyên tố cần in
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        int numbers = scanner.nextInt();

        // Bước 2 & 3: Khai báo biến đếm và biến kiểm tra số nguyên tố
        int count = 0;
        int N = 2;

        // Bước 4: Lặp cho đến khi in đủ số nguyên tố
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
