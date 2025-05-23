package ss4_lop_va_doi_tuong_java.bai2;
import java.util.Random;

public class Main {
    // Hàm selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử thứ i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Tạo mảng 100,000 phần tử ngẫu nhiên
        int[] array = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100000);
        }

        // Đo thời gian thực thi thuật toán selection sort
        StopWatch watch = new StopWatch();
        watch.start();

        selectionSort(array);

        watch.stop();
        System.out.println("Thời gian thực thi (ms): " + watch.getElapsedTime());
    }
}
