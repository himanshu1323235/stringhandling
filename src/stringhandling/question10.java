import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        char ch = obj.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            char ch1 = string.charAt(i);
            if (ch1 == ch) {
                System.out.println(i);
                break;
            }
        }
    }
}