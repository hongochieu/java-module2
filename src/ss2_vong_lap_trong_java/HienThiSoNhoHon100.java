package ss2_vong_lap_trong_java;
import java.util.Scanner;
public class HienThiSoNhoHon100 {
    public static void main(String[] args) {
        // Duyệt các số từ 2 đến 100
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Hàm kiểm tra một số có phải là số nguyên tố không
    public static boolean isPrime(int n) {
        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Không phải số nguyên tố nếu chia hết
            }
        }
        return true; // Là số nguyên tố nếu không chia hết cho số nào
    }
}
