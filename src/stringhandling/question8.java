import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        String string = obj.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char n = string.charAt(i);
            int N = (int) n;
            if (n < 98) {
                sum = sum + N;

            }
        }
        System.out.println(sum);
    }
}