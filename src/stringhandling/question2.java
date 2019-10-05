package stringhandling;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        int n = obj.nextInt();
        System.out.println(string.substring(0, n));

    }
}