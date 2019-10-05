package stringhandling;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
        String string = obj.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int n = (int) c;
            if (n < 98) {
                sum = sum + n;

            }
        }
        System.out.println(sum - sum1);
    }
}
