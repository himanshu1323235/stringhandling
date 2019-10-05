import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        String string = obj.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);
            int n = (int) a;
            sum = sum + n;
        }
        System.out.println(sum);
    }
}