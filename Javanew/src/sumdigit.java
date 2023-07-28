import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a;
        int rev = 0;
        while (a > 0) {
            rev =rev+ a % 10;
            a = a / 10;
        }
        System.out.println(rev);
    }
}
