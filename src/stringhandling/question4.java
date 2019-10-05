package stringhandling;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        int a = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'i') {
                if (a == 1) {
                    string = string.replace(string.charAt(i), '*');

                } else if (a == 2) {
                    string = string.replace(string.charAt(i), '^');
                } else if (a == 3) {
                    string = string.replace(string.charAt(i), '!');
                } else if (i == 4) {
                    i = 1;
                }
                a++;

            }
        }

    }
}