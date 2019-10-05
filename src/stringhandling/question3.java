package stringhandling;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                string = string.replace(string.charAt(i), '*');
            }

        }
    }
}
