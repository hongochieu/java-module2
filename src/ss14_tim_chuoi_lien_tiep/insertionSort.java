package ss14_tim_chuoi_lien_tiep;
import java.util.Scanner;
public class insertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] list = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("list[" + i + "] = ");
            list[i] = scanner.nextInt();
        }

        System.out.println("\nMảng ban đầu:");
        printArray(list);

        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        printArray(list);
    }
}
