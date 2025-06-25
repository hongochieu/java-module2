package ss14_tim_chuoi_lien_tiep;
import java.util.Scanner;

public class InsertionSortSteps {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Bắt đầu sắp xếp ---");
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.print("Bước " + i + ": ");
            printArray(arr);
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

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nMảng ban đầu: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("\nMảng sau khi sắp xếp: ");
        printArray(arr);
    }
}
