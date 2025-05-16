package ss2_vong_lap_trong_java;
import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Bước 1: In menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Bước 2.1: In hình chữ nhật
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Bước 2.2: In hình tam giác vuông 4 góc
                    System.out.println("Choose angle position:");
                    System.out.println("1. Bottom-left");
                    System.out.println("2. Top-left");
                    System.out.println("3. Bottom-right");
                    System.out.println("4. Top-right");
                    int angleChoice = scanner.nextInt();

                    System.out.print("Enter size: ");
                    int size = scanner.nextInt();

                    switch (angleChoice) {
                        case 1:
                            for (int i = 1; i <= size; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = size; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= size; i++) {
                                for (int j = 1; j <= size - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = size; i >= 1; i--) {
                                for (int j = 1; j <= size - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Invalid angle choice!");
                    }
                    break;

                case 3:
                    // Bước 2.3: In tam giác cân
                    System.out.print("Enter height: ");
                    int h = scanner.nextInt();
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}
