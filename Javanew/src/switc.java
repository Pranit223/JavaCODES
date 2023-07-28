import java.util.Scanner;
public class switc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a= in.next();
        switch (a) {
            case "mango" -> System.out.println("ok right");
            case "apple" -> System.out.println("nice choice");
            default -> System.out.println("invalid ladwe");
        }

    }
}
