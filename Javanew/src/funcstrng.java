import java.util.Scanner;

public class funcstrng {
    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
        System.out.print("name");
        String v=input.next();
        String c =hey(v);
        System.out.println(c);
    }
    static String hey(String b){
        String message="hello "+ b;
        return message;
    }
}
