package ss14_tim_chuoi_lien_tiep;
import java.util.Scanner;

public class FindNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (temp.isEmpty()) {

                temp += currentChar;
            } else {
                if (currentChar == temp.charAt(temp.length() - 1) + 1) {
                    temp += currentChar;
                } else {
                    if (temp.length() > result.length()) {
                        result = temp;
                    }
                    temp = "" + currentChar;
                }
            }
        }

        if (temp.length() > result.length()) {
            result = temp;
        }

        System.out.println("Longest consecutive substring: " + result);
    }
}
